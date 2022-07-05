package com.app.efa.views.SignUp;
import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("personal info registration")
@Route(value = "personinforegistration")
public class UserPersonalInformationRegistrationView extends View {
    //let's declare all the necessary components here
    private Label headerLabel,firstNameLabel,lastNameLabel,phoneLabel,passwordLabel,confirmPasswordLabel,emailLabel;
    private Button registerButton,loginButton;
    private TextField firstNameTF,lastNameTF,phoneTF,passwordTF,confirmPasswordTF;
    private EmailField emailTF;
    @Override
    public void init() {
        //labels for the view
        headerLabel = new Label("Sign Up here");
        firstNameLabel = new Label("first name:");
        lastNameLabel = new Label("last name:");
        phoneLabel = new Label("phone:");
        passwordLabel = new Label("password:");
        confirmPasswordLabel = new Label("re-enter password:");
        emailLabel = new Label("email:");
        headerLabel = new Label("Sign Up here");
        //text-fields
        firstNameTF = new TextField("first name");
        lastNameTF = new TextField("last name");
        passwordTF = new TextField("password");
        confirmPasswordTF = new TextField("re-enter password");
        phoneTF = new TextField("phone number");
        emailTF = new EmailField("email");
        //buttons
        registerButton = new Button("submit");
        loginButton = new Button("login");
    }

    @Override
    public void constructUI() {
        //
        h1.add(headerLabel);
        h2.add(firstNameTF,lastNameTF);
        h3.add(emailTF,phoneTF);
        h4.add(passwordTF,confirmPasswordTF);
        h5.add(registerButton);
        h6.add(loginButton);
        h7.add(footer);
        //
        add(h1,h2,h3,h4,h5,h6,h7);
        //
    }

    @Override
    public void bindingOperations() {
    }

    @Override
    public void alignElements() {
        h1.setVerticalComponentAlignment(Alignment.CENTER);
        h2.setVerticalComponentAlignment(Alignment.CENTER);
        h3.setVerticalComponentAlignment(Alignment.CENTER);
        h4.setVerticalComponentAlignment(Alignment.CENTER);
        h5.setVerticalComponentAlignment(Alignment.CENTER);
        h6.setVerticalComponentAlignment(Alignment.CENTER);
        h7.setVerticalComponentAlignment(Alignment.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    }

    @Override
    public void addEvents() {
        registerButton.addClickListener(e->
                {
                    Notification.show("hii"+firstNameTF.getValue(),20, Notification.Position.MIDDLE);
                });
    }
}
