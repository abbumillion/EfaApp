package com.app.efa.views.MainView;

import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("sign up")
@Route(value = "signup")
public class SignUp1 extends View {
    FormLayout formLayout;
    PasswordField password,confirmPassword;
    //
    TextField firstName,lastName,username;
    @Override
    public void init() {
         firstName = new TextField("First name");
         lastName = new TextField("Last name");
         username = new TextField("Username");
         password = new PasswordField("Password");
         confirmPassword = new PasswordField("Confirm password");

         formLayout = new FormLayout();

    }

    @Override
    public void constructUI() {
        formLayout.add(
                firstName, lastName,
                username,
                password, confirmPassword
        );
        formLayout.setResponsiveSteps(
                // Use one column by default
                new FormLayout.ResponsiveStep("0", 1),
                // Use two columns, if layout's width exceeds 500px
                new FormLayout.ResponsiveStep("500px", 2)
        );
       // Stretch the username field over 2 columns
        formLayout.setColspan(username, 2);

        add(formLayout);
    }

    @Override
    public void bindingOperations() {

    }

    @Override
    public void alignElements() {

    }

    @Override
    public void addEvents() {

    }
}
