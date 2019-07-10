package com.transcendit.hr.project1.services.impl;

import com.transcendit.hr.project1.domain.ElementType;
import com.transcendit.hr.project1.repositories.ElementTypeRepository;
import com.transcendit.hr.project1.services.ElementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ElementTypeServiceImpl implements ElementTypeService {

    @Autowired
    private ElementTypeRepository elementTypeRepository;


    @Override
    public Iterable<ElementType> listAllElementTypes() {
        return elementTypeRepository.findAll();
    }

    @Override
    public Optional<ElementType> getElementTypeById(Integer id) {
        return elementTypeRepository.findById(id);
    }

    @Override
    public ElementType saveElementType(ElementType elementType) {
        return elementTypeRepository.save(elementType);
    }

    @Override
    public Iterable<ElementType> saveElementTypeList(Iterable<ElementType> elementTypeIterable) {
        return elementTypeRepository.saveAll(elementTypeIterable);
    }

    @Override
    public void deleteElementType(Integer id) {
        elementTypeRepository.deleteById(id);

    }

    @Override
    public ElementType findByElementTypeName(String elementTypeName) {
        return elementTypeRepository.findByElementTypeName(elementTypeName);
    }
}
