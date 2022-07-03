package com.app.efa.views.ViewBase;

import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

public class DashboardView extends View {
    Tab home,contact_us,help,about;

    Tabs tabs;
    @Override
    public void init() {
        //tabs
         home = new Tab("home");
         contact_us = new Tab("contact us");
         help = new Tab("help");
         about = new Tab("about");
        //tab-pane
         tabs = new Tabs();
    }

    @Override
    public void constructUI() {
        //add tabs to the tab pane
        tabs.add(home, contact_us, help,about);
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
