package com.app.efa.views.Tabs;

import com.app.efa.views.Listviews.FreelancerListview;
import com.app.efa.views.ViewBase.View;


public class FreelancerListTab extends View {

    private FreelancerListview freelancerListview;
    @Override
    public void init() {
        freelancerListview = new FreelancerListview();
    }

    @Override
    public void constructUI() {
        add(freelancerListview);
    }

    @Override
    public void bindingOperations() {

    }

    @Override
    public void alignElements() {
        setSizeFull();
    }

    @Override
    public void addEvents() {

    }

    @Override
    public void addStyle() {

    }
}
