package com.app.efa.views.MainView;

import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Welcome to Ethio-Freelancing")
@Route(value = "")
public class LandingView extends View {
    /*
    this page is our landing page it will contain
    header of the company
     aside description of the company slogan / or the same kind of other things to consider also must be included here
    register button on the right top corner
    a footer at the bottom
    * */
    //paragraph
    private Paragraph companySloganParagraph , descriptionParagraph;
    //paragraph container
    //signup button
    private Button signUpButton;
    //sign in button
    private Button signInButton;
    //we need some disabled buttons to show the job categories
    // to our users specially freelancers
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    @Override
    public void init()
    {
        signInButton = new Button("sign in");
        signUpButton = new Button("sign up");
        companySloganParagraph = new Paragraph("" +
                "Find and Become a\nprofessional with Passion" +
                "");
        descriptionParagraph = new Paragraph("Job search platform country-wide\n" +
                "we connect freelancers and startups in an easy way and good collaboration...");
        //
        b1 = new Button("UI Designer");
        b2 = new Button("Frontend developer");
        b3 = new Button("Backend developer");
        b4 = new Button("project manager");
        b5 = new Button("marketing");
        b6 = new Button("3d illustrator");
        b7 = new Button("data analyst");
        b8 = new Button("database designer");
        //
    }
    @Override
    public void constructUI()
    {
        //------------------------------------------------------------------------------------------------------------//
        h1.add(header,signUpButton,signInButton);
        h2.add(companySloganParagraph);
        h3.add(descriptionParagraph);
        h4.add(b1,b2,b3,b4);
        h5.add(b5,b6,b7,b8);
        h6.add(footer);
        v3.add(h1,h2,h3,h4,h5,h6);
        //------------------------------------------------------------------------------------------------------------//
        add(v3);
        //-------------------------------------------------------------------------------------------------------------//
    }
    @Override
    public void bindingOperations()
    {
        //------------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------------//
    }
    @Override
    public void alignElements()
    {
        //------------------------------------------------------------------------------------------------------------//
        header.setWidth("80%");
        companySloganParagraph.setWidthFull();
        footer.setWidthFull();
        //------------------------------------------------------------------------------------------------------------//
        h1.setWidthFull();
        h2.setWidthFull();
        h3.setWidthFull();
        //------------------------------------------------------------------------------------------------------------//
        v3.setSizeFull();
        //------------------------------------------------------------------------------------------------------------//
        setDefaultHorizontalComponentAlignment(Alignment.BASELINE);
        setPadding(true);
        signInButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        signUpButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        //------------------------------------------------------------------------------------------------------------//
    }
    @Override
    public void addEvents()
    {
        //------------------------------------------------------------------------------------------------------------//
        //------------------------------------------------------------------------------------------------------------//
    }

    @Override
    public void addStyle() {
        //
        b1.setDisableOnClick(true);
        b2.setDisableOnClick(true);
        b3.setDisableOnClick(true);
        b4.setDisableOnClick(true);
        b5.setDisableOnClick(true);
        b6.setDisableOnClick(true);
        b7.setDisableOnClick(true);
        b8.setDisableOnClick(true);
        //
    }
}
