package com.app.efa.views.SignUp;

import com.app.efa.views.ViewBase.View;
import com.app.efa.views.login.LoginView;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("sign up")
@Route(value = "signup1")
public class SignUp1 extends View {
    FormLayout formLayout;
    PasswordField password,confirmPassword;
    //
    TextField firstName,lastName,username;
    //
    private Button submitButton,loginButton;
    @Override
    public void init() {
         firstName = new TextField("First name");
         lastName = new TextField("Last name");
         username = new TextField("Username");
         password = new PasswordField("Password");
         confirmPassword = new PasswordField("Confirm password");
         //
        submitButton = new Button("Register",buttonClickEvent -> {
//            UI.getCurrent().navigate(.class);
            //
            //
        });
        //
        loginButton = new Button("sign in",buttonClickEvent ->
        {
            //
            //
            UI.getCurrent().navigate(LoginView.class);
            //
            //

        });
         formLayout = new FormLayout();
    }

    @Override
    public void constructUI() {
//        formLayout.add(
//                firstName, lastName,
//                username,
//                password, confirmPassword
//        );
//        formLayout.setResponsiveSteps(
//                // Use one column by default
//                new FormLayout.ResponsiveStep("0", 1),
//                // Use two columns, if layout's width exceeds 500px
//                new FormLayout.ResponsiveStep("500px", 2)
//        );
//       // Stretch the username field over 2 columns
//        formLayout.setColspan(firstName, 2);
//        formLayout.setColspan(lastName, 2);
//        formLayout.setColspan(username, 2);
//        formLayout.setColspan(password, 2);
//        formLayout.setColspan(confirmPassword, 2);
//        add(formLayout);
    }

    @Override
    public void bindingOperations() {
        //we will bind the service layer with the view here
    }

    @Override
    public void alignElements() {
        //for alignment of the view

    }

    @Override
    public void addEvents() {
        //we can add some events here but it's prefered to do it
        //during initilization
    }
}
