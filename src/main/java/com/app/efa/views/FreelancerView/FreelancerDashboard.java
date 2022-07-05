package com.app.efa.views.FreelancerView;

import com.app.efa.views.HomeView.DashboardView;
import com.vaadin.flow.component.html.Label;

public class FreelancerDashboard extends DashboardView {
    private Label label;
    @Override
    public void init() {
        label = new Label("Freelancer Dashboard");
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
