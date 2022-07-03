package com.app.efa.views.Listviews;

import com.app.efa.views.MainView.MainView;
import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;

@Route(value = "Feedbacks", layout = MainView.class)
public class FeedbackListview extends View {
    private Label label;
    @Override
    public void init() {
        label = new Label("feedbacks list");
    }

    @Override
    public void constructUI() {
        //
        add(label);
        //
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
