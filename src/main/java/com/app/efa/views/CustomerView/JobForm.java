package com.app.efa.views.CustomerView;

import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.formlayout.FormLayout;

public class JobForm extends View
{
    private FormLayout formLayout;
    @Override
    public void init() {
        formLayout = new FormLayout();
    }

    @Override
    public void constructUI() {

        add(formLayout);
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
}
