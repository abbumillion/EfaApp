package com.app.efa.views.ViewBase;
//this is the root interface for all
//viewable objects in the system
//they all got some
public interface Viewable {
    //for construction of ui's
    void init();
    void constructUI();
    //for binding some ui components with the backend model for live update
    void bindingOperations();
    //for alignment and other styling operations will be done in this
    //functional operation
    void alignElements();
    //for binding some ui events to the backend
    void addEvents();
    //adding styles
    void addStyle();
}
