package com.app.efa.views.MainView;

import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Admin Dashboard")
@Route(value = "LAN")
public class LandingView extends View {
    //progress bar
    private ProgressBar progressBar;
    //label
    Div progressBarLabel;
    //
    @Override
    public void init() {
        progressBar = new ProgressBar();
        progressBar.setIndeterminate(true);
        progressBarLabel = new Div();
        progressBarLabel.setText("Starting Ethiopian Freelancing " +
                "Application\n" +
                "Please Wait...");
    }
    

    @Override
    public void constructUI()
    {
        //
        add(progressBarLabel, progressBar);
        //
    }

    @Override
    public void bindingOperations()
    {

    }

    @Override
    public void alignElements()
    {

    }

    @Override
    public void addEvents() {

    }

    public ProgressBar getProgressBar()
    {
        return progressBar;
    }

    public Div getProgressBarLabel()
    {
        return progressBarLabel;
    }
}
