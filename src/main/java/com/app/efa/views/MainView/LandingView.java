package com.app.efa.views.MainView;

import com.app.efa.views.SignUp.UserRegistrationView;
import com.app.efa.views.ViewBase.View;
import com.app.efa.views.login.LoginView;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Admin Dashboard")
@Route(value = "/")
public class LandingView extends View {
    //progress bar
    private ProgressBar progressBar;
    //label
    Div progressBarLabel;
    //
    Button loginButton,registerButton;
    //
    @Override
    public void init()
    {
        //
        progressBar = new ProgressBar();
        progressBar.setIndeterminate(true);
        progressBarLabel = new Div();
        progressBarLabel.setText("Starting Ethiopian Freelancing " +
                "Application\n" +
                "Please Wait...");
        //
        loginButton = new Button("login",e->{
            UI.getCurrent().navigate(LoginView.class);});
        registerButton = new Button("sign up",e->
        {
            UI.getCurrent().navigate(UserRegistrationView.class);
        });
        //
    }
    @Override
    public void constructUI()
    {
        //
        add(progressBarLabel, progressBar);
        //
    }
    @Override
    public void bindingOperations()
    {

    }
    @Override
    public void alignElements()
    {

    }
    @Override
    public void addEvents() {

    }
}
