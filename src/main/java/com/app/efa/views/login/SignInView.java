package com.app.efa.views.login;

import com.app.efa.views.MainView.MainView;
import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Sign In")
@Route(value = "signin")
public class SignInView extends View {
    private TextField userNameFeild;
    private PasswordField passwordField;
    @Override
    public void init() {
        userNameFeild = new TextField("username");
        //
        passwordField = new PasswordField("password");
    }

    @Override
    public void constructUI() {
        add(
                header,
                userNameFeild,
                passwordField,
                footer
        );
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
    @Override
    public void addStyle() {

    }
}
