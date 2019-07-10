package com.transcendit.hr.project1.bootstrap;

import com.transcendit.hr.project1.domain.Element;
import com.transcendit.hr.project1.domain.ElementType;
import com.transcendit.hr.project1.services.ElementService;
import com.transcendit.hr.project1.services.ElementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.ArrayList;
import java.util.List;

public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ElementService elementService;

    @Autowired
    private ElementTypeService elementTypeService;


    @Override
    //this is the parent method that will be executing the code

    public void onApplicationEvent(ContextRefreshedEvent event) {

        generateElementAndElementTypes();

    }

    private void generateElementAndElementTypes() {
        //TODO: tables in h2 not hydrating, fix;
        ElementType laptopType = new ElementType("Laptop");

        List<Element> elementList = new ArrayList<>();
        elementList.add(new Element("Acer"));
        elementList.add(new Element("Dell"));
        elementList.add(new Element("Apple"));
        elementList.add(new Element("HP"));
        elementList.add(new Element("Asus"));
        elementList.add(new Element("Samsung"));

        laptopType.setElementList(elementList);

        elementTypeService.saveElementType(laptopType);

        //email
        ElementType emailType = new ElementType("Email");

        List<Element> emailList = new ArrayList<>();
        emailList.add(new Element("Work"));
        emailList.add(new Element("Personal"));
        emailList.add(new Element("Delegated"));

        emailType.setElementList(emailList);

        elementTypeService.saveElementType(emailType);



    }
}

