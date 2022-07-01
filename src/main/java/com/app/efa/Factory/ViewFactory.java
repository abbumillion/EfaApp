package com.app.efa.Factory;

import com.app.efa.views.MainView.LandingView;
import com.app.efa.views.MainView.LoginView;
import com.app.efa.views.ViewBase.View;

public class ViewFactory {
    private static View view;
    public static View getView(String viewType)
    {
        switch (viewType)
        {
            case "LANDINGVIEW":
                view = new LandingView();
                break;
            case "LOGINVIEW":
                view = new LoginView();
        }
        view.getReady();
        return view;
    }
}
