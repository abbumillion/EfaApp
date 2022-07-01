package com.app.efa.views.AdminView;

import com.app.efa.views.MainView.MainView;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Admin Dashboard")
@Route(value = "admindashboard", layout = MainView.class)
public class AdminDashboard extends VerticalLayout {
    private Label label;
    public AdminDashboard()
    {
        label = new Label("Admin Dashboard");
        add(label);
    }
}
