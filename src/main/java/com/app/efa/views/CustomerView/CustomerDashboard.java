package com.app.efa.views.CustomerView;

import com.app.efa.views.HomeView.DashboardView;
import com.vaadin.flow.component.html.Label;

public class CustomerDashboard extends DashboardView {
    private Label label;
    @Override
    public void init() {
        label = new Label("customer dashboard");
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
