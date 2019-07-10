package com.transcendit.hr.project1.services.impl;

import com.transcendit.hr.project1.domain.Element;
import com.transcendit.hr.project1.repositories.ElementRepository;
import com.transcendit.hr.project1.services.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElementServiceImpl implements ElementService {

    @Autowired
    private ElementRepository elementRepository;

    @Override
    public Iterable<Element> listAllElements() {
        return elementRepository.findAll();
    }

    @Override
    public Optional<Element> getElementById(Integer id) {
        return elementRepository.findById(id);
    }

    @Override
    public Element saveElement(Element element) {
        return elementRepository.save(element);
    }

    @Override
    public Iterable<Element> saveElementList(Iterable<Element> elementIterable) {
        return elementRepository.saveAll(elementIterable);
    }

    @Override
    public void deleteElement(Integer id) {
        elementRepository.deleteById(id);
    }

    @Override
    public Element findByElementName(String elementName) {
        return elementRepository.findByElementName(elementName);
    }

    @Override
    public List<Element> findAllByElementName(String elementName) {
        return elementRepository.findAllByElementName(elementName);
    }

    @Override
    public List<Element> findAllByElementNameIgnoreCase(String elementName) {
        return elementRepository.findAllByElementNameIgnoreCase(elementName);
    }
}
