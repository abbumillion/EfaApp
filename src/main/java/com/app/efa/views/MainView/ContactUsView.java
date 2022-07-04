package com.app.efa.views.MainView;
import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;

@Route(value = "Contactus", layout = MainView.class)
public class ContactUsView extends View {
    //label
    private Label label;
    @Override
    public void init() {
        label = new Label("contact us view");
    }

    @Override
    public void constructUI() {
        add(label);
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
