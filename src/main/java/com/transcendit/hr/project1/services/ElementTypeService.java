package com.transcendit.hr.project1.services;

import com.transcendit.hr.project1.domain.ElementType;

import java.util.Optional;

public interface ElementTypeService {

    //list methods to use in the element service
    //Lists all elements

    Iterable<ElementType> listAllElementTypes();

    Optional<ElementType> getElementTypeById(Integer id);

    ElementType saveElementType(ElementType elementType);

    Iterable<ElementType> saveElementTypeList(Iterable<ElementType> elementTypeIterable);

    //delete

    void deleteElementType(Integer id);

    ElementType findByElementTypeName(String elementTypeName);


}
