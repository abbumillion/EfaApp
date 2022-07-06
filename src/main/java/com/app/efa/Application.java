package com.app.efa;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
@Theme(value = "mytodo")
@PWA(name = "Ethiopian Freelancing Application", shortName = "Ethio-Freelancing", offlineResources = {})
@NpmPackage(value = "line-awesome", version = "1.3.0")
public class Application extends SpringBootServletInitializer implements AppShellConfigurator {
    public static void main(String[] args)
    {
        //this is the starting point for our
        //spring boot and vaading based web application
        System.out.println("STARTING THE APPLICATION");
        SpringApplication.run(Application.class, args);

    }
}
