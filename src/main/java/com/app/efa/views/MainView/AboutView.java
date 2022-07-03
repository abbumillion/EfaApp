package com.app.efa.views.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("About")
@Route(value = "About us", layout = MainView.class)
public class AboutView extends VerticalLayout {

    public AboutView() {
        setSpacing(false);
        Image img = new Image("images/empty-plant.png", "placeholder plant");
        img.setWidth("200px");
        add(img);
        add(new H2("This place is where we write about our company" +
                "ethiofreelancing platform place where ou can find your dream jobs" +
                "and skilled freelancer"));
        add(new Paragraph("It’s a place 🤗"),new Button("hello9999"));
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }
}
