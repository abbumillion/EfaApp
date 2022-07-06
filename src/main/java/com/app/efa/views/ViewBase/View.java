package com.app.efa.views.ViewBase;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.Date;

public abstract class View extends VerticalLayout implements Viewable {
    protected Header header;
    protected Footer footer;
    protected Paragraph footerParagraph,headerParagraph;
    protected HorizontalLayout h1,h2,h3,h4,h5,h6,h7,h8,h9,h10;
    protected VerticalLayout v1,v2,v3,v4,v5,v6;
    public View()
    {
        //---------some horizontal layout to be used by childs----------------//
        //--------------------------------------------------------------------//
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
        //-------------------------------------------------------------------//
        //---------some vertical layout to be used by concrete sub classes---//
        v1 = new VerticalLayout();
        v2 = new VerticalLayout();
        v3 = new VerticalLayout();
        v4 = new VerticalLayout();
        v5 = new VerticalLayout();
        v6 = new VerticalLayout();
        //-------------------------------------------------------------------//
        header = new Header();
        footer = new Footer();
        //------------------------------------------------------------------------------------------------------------//
        headerParagraph = new Paragraph("Welcome to Ethio-Freelancing Application...");
        footerParagraph = new Paragraph("Ethiopian Freelancing Application\n" +
                "@copyright all right reserved. "+new Date());
        //
        header.add(headerParagraph);
        footer.add(footerParagraph);
        //------------------------------------------------------------------------------------------------------------//
        getReady();
        setMargin(true);
        setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        //
//        headerParagraph.addClassNames("view-header");
//        footerParagraph.addClassNames("view-header");
        headerParagraph.setSizeFull();
        footerParagraph.setSizeFull();

        //

    }
    public void getReady()
    {
        //this method should be called every time we create a view
        //to setup the entire ui components and other
        //initialization of components
        init();
        //for construction of ui's
        constructUI();
        //for binding some ui events to the backend
        addEvents();
        //for binding some ui components with the backend model for live update
        bindingOperations();
        //for alignment and other styling operations will be done in this
        //functional operation
        alignElements();
    }
}
