package com.app.efa.views.ViewBase;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public abstract class View extends VerticalLayout implements Viewable {
    //all common elements that are used by all pages should be declared here
    //ex footer,header,
    //every page should extend from this abstraction
    private Footer footer;
    public View()
    {
        footer = new Footer();
    }

    public void getReady()
    {
        init();
        constructUI();
        bindingOperations();
        alignElements();
    }
}
