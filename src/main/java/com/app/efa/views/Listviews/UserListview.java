package com.app.efa.views.Listviews;

import com.app.efa.Model.UserModel;
import com.app.efa.views.ViewBase.View;
import com.vaadin.flow.component.grid.Grid;

public abstract class UserListview extends Listview {
    //this is an abstract view class for
    //every concrete user list views

    Grid grid;

    public UserListview()
    {
        //this for initializing all components for
        //concrete sub class or views

    }
}
