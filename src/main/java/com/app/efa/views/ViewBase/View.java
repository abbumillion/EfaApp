package com.app.efa.views.ViewBase;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
public abstract class View extends VerticalLayout implements Viewable {
    protected Header header;
    protected Footer footer;
    protected HorizontalLayout h1,h2,h3,h4,h5,h6,h7,h8,h9,h10;
    public View()
    {
        h1 = new HorizontalLayout();
        h2 = new HorizontalLayout();
        h3 = new HorizontalLayout();
        h4 = new HorizontalLayout();
        h5 = new HorizontalLayout();
        h6 = new HorizontalLayout();
        h7 = new HorizontalLayout();
        h8 = new HorizontalLayout();
        h9 = new HorizontalLayout();
        h10 = new HorizontalLayout();
        footer = new Footer();
        getReady();
        setMargin(true);
        setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
    }
    public void getReady()
    {
        init();
        constructUI();
        addEvents();
        bindingOperations();
        alignElements();
    }
}
