package com.transcendit.hr.project1.repositories;

import com.transcendit.hr.project1.domain.ElementType;
import org.springframework.data.repository.CrudRepository;

public interface ElementTypeRepository extends CrudRepository<ElementType, Integer> {

    ElementType findByElementTypeName(String elementTypeName);
}
