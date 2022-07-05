package com.app.efa.views.HomeView;

import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

public abstract class DashboardView extends View {
    //
    Tab home,contact_us,help,about;
    //
    Tabs tabs;
    public DashboardView()
    {
        //tabs
        home = new Tab("home");
        contact_us = new Tab("contact us");
        help = new Tab("help");
        about = new Tab("about");
        //tab-pane
        tabs = new Tabs();
        //
        tabs.add(home, contact_us, help,about);

        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

    }

}
