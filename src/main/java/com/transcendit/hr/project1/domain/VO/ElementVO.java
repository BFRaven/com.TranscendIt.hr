package com.transcendit.hr.project1.domain.VO;

public class ElementVO {

    private String newElementType;
    private String newElements;
    private String[] newElementArray;

    //region CONSTRUCTORS

    public ElementVO(){}



    //endregion

    //region CUSTOM METHODS
    //regex for splitting on a new line or carriage return is "\\r?\\n"
    public void splitNewElementsIntoArray() {
        this.setNewElementArray(this.newElements.split("\\r?\\n"));
    }

    //endregion

    //region GETTERS/SETTERS

    public String getNewElements() {
        return newElements;
    }

    public void setNewElements(String newElements) {
        this.newElements = newElements;
    }

    public String getNewElementType() {
        return newElementType;
    }

    public void setNewElementType(String newElementType) {
        this.newElementType = newElementType;
    }

    public String[] getNewElementArray() {
        return newElementArray;
    }

    public void setNewElementArray(String[] newElementArray) {
        this.newElementArray = newElementArray;
    }

    //endregion


}
