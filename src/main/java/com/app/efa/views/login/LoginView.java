package com.app.efa.views.login;
import com.app.efa.views.HomeView.AdminDashboard;
import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
@PageTitle("login")
@Route(value = "login")
public class LoginView extends View {
    //form component
    private LoginOverlay loginForm;
    private Anchor signUp;
    @Override
    public void init()
    {
        loginForm = new LoginOverlay();
        //sign up anchor
        signUp = new Anchor("Sign Up");
        //
    }
    @Override
    public void constructUI()
    {

        add(loginForm,footer);
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
        loginForm.setDescription("login here");
        loginForm.setOpened(true);
        loginForm.setForgotPasswordButtonVisible(true);
//        setDefaultHorizontalComponentAlignment(Alignment.BASELINE);
        //
    }
    @Override
    public void addEvents()
    {
        loginForm.addLoginListener(e->{
            String userName = e.getUsername();
            String password = e.getPassword();
            if(userName.equals("admin")&& password.equals("1234"))
            {
                System.out.println("hii user"+e.getSource());
                UI.getCurrent().navigate(AdminDashboard.class);
            }
        });
        loginForm.addForgotPasswordListener(e->{
            UI.getCurrent().navigate(ForgetPasswordView.class);
        });
    }
    @Override
    public void addStyle() {

    }
}
