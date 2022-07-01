package com.app.efa.Controller.MainController;

import com.app.efa.views.MainView.LandingView;
import org.springframework.stereotype.Controller;

@Controller
public class LandingController  {
    private LandingView landingView;

    public LandingController()
    {
        landingView = new LandingView();
    }
}
