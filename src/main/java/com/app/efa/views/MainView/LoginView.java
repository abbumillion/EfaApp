package com.app.efa.views.MainView;

import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("login")
@Route(value = "login")
public class LoginView extends View {
    //form component
    private LoginForm loginForm;

    @Override
    public void init() {
        loginForm = new LoginForm();
    }

    @Override
    public void constructUI() {
        add(loginForm);
    }

    @Override
    public void bindingOperations() {

    }

    @Override
    public void alignElements() {
        setAlignItems(Alignment.BASELINE);
    }
}
