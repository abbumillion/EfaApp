package com.app.efa.views.SignUp;

import com.app.efa.views.ViewBase.View;
import com.app.efa.views.login.LoginView;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("sign up")
@Route(value = "signup")
public class UserRegistrationView extends View {
    //
//    FormLayout formLayout;
    //
    private Button registerButton,loginButton;
    //
    private TextField firstNameTF,lastNameTF,phoneTF,passwordTF,confirmPasswordTF;
    private EmailField emailTF;
    //
    //
    @Override
    public void init() {
        //
        firstNameTF = new TextField("first name");
        lastNameTF = new TextField("last name");
        passwordTF = new TextField("password");
        confirmPasswordTF = new TextField("re-enter password");
        phoneTF = new TextField("phone number");
        emailTF = new EmailField("email");
        //buttons
        registerButton = new Button("submit");
        loginButton = new Button("login");
        //text-fields

        registerButton = new Button("Register",buttonClickEvent -> {
//            UI.getCurrent().navigate(.class);
            //
        });
        //
        loginButton = new Button("sign in",buttonClickEvent ->
        {
            //
            UI.getCurrent().navigate(LoginView.class);
            //
        });
//        formLayout = new FormLayout();
    }

    @Override
    public void constructUI() {
        //------------------------------------------------------------------------------------------------------------//
//        h1.add(registerButton);
//        h1.getStyle().set("flex-wrap", "wrap");
       h1.setJustifyContentMode(JustifyContentMode.END);
        //------------------------------------------------------------------------------------------------------------//
        h1.addAndExpand(header,loginButton);
        h2.add(firstNameTF,lastNameTF);
        h3.add(emailTF,phoneTF);
        h4.add(passwordTF,confirmPasswordTF);
        h5.add(registerButton);
        h6.addAndExpand(footer);
        //------------------------------------------------------------------------------------------------------------//
        v1.add(h1,h2,h3,h4,h5,h6);

        //
//        formLayout.add(
//                h1,h2,h3,h4,h5,h6
//        );
//        //
////        formLayout.setResponsiveSteps(
//                // Use one column by default
//                new FormLayout.ResponsiveStep("0", 2)
//                // Use two columns, if layout's width exceeds 500px
////                new FormLayout.ResponsiveStep("500px", 2)
//        );
//        formLayout.setColspan(header, 2);
//        // Stretch the username field over 2 columns
//        formLayout.setColspan(firstNameTF, 1);
//        formLayout.setColspan(lastNameTF, 1);
//        //------------------------------------------------------------------------------------------------------------//
//        formLayout.setColspan(emailTF, 1);
//        formLayout.setColspan(phoneTF, 1);
//        //
//        formLayout.setColspan(passwordTF, 1);
//        formLayout.setColspan(confirmPasswordTF, 1);
//        //
//        formLayout.setColspan(registerButton, 1);
//        formLayout.setColspan(loginButton, 1);
//        //
//        formLayout.setColspan(footer, 2);
        //
//        add(formLayout);
        addAndExpand(v1);
        //
    }

    @Override
    public void bindingOperations()
    {

    }

    @Override
    public void alignElements()
    {
        v1.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        v1.setJustifyContentMode(JustifyContentMode.CENTER);
        registerButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        loginButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
    }

    @Override
    public void addStyle() {

    }
    @Override
    public void addEvents()
    {

    }
}

//        TextField firstNameField = new TextField("First name", "John", "");
//        TextField lastNameField = new TextField("Last name", "Smith", "");
//        EmailField emailField = new EmailField("Email address");
//        emailField.setValue("john.smith@example.com");
//        FormLayout formLayout = new FormLayout(firstNameField, lastNameField, emailField);
//        formLayout.setResponsiveSteps(new ResponsiveStep("0", 2));
//        formLayout.setColspan(emailField, 2);
//
//        Button createAccount = new Button("Create account");
//        createAccount.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
//        Button cancel = new Button("Cancel");
//
//        HorizontalLayout buttonLayout = new HorizontalLayout(createAccount, cancel);

//        TextField firstNameField = new TextField("First name", "John", "");
//        TextField lastNameField = new TextField("Last name", "Smith", "");
//        EmailField emailField = new EmailField("Email address");
//        emailField.setValue("john.smith@example.com");
//        FormLayout formLayout = new FormLayout(firstNameField, lastNameField, emailField);
//        formLayout.setResponsiveSteps(new FormLayout.ResponsiveStep("0", 2));
//        formLayout.setColspan(emailField, 2);
//
//        Button delete = new Button("Delete");
//        delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
//        delete.getStyle().set("margin-inline-end", "auto");
//
//        Button cancel = new Button("Cancel");
//
//        Button createAccount = new Button("Create account");
//        createAccount.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
//
//        HorizontalLayout buttonLayout = new HorizontalLayout(delete, cancel, createAccount);
//        buttonLayout.getStyle().set("flex-wrap", "wrap");
//        buttonLayout.setJustifyContentMode(JustifyContentMode.END);