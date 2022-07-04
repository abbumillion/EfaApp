package com.app.efa.views.MainView;
import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
@PageTitle("login")
@Route(value = "/")
public class LoginView extends View {
    //form component
    private LoginOverlay loginForm;
    @Override
    public void init()
    {
        loginForm = new LoginOverlay();
    }
    @Override
    public void constructUI()
    {
        add(loginForm);
    }
    @Override
    public void bindingOperations()
    {
        //
    }
    @Override
    public void alignElements()
    {
        //
        loginForm.setTitle("Ethiopian Freelancing Application");
        loginForm.setDescription("");
        loginForm.setOpened(true);
        loginForm.setForgotPasswordButtonVisible(true);
        setDefaultHorizontalComponentAlignment(Alignment.BASELINE);
        //
    }
    @Override
    public void addEvents()
    {
        loginForm.addLoginListener(e->{
            UI.getCurrent().navigate(MainView.class);
        });
        loginForm.addForgotPasswordListener(e->{
            UI.getCurrent().navigate(ForgetPasswordView.class);
        });
    }
}
