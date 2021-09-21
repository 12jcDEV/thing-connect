package com.thing.con.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@PropertySource("classpath:sfl.properties")
@Component
public class SflProperties {

    @Autowired
    Environment environment;

    private String projectTitle;

    public static SflProperties instance;

    private SflProperties() {
        if(instance == null)
            instance = new SflProperties();

        projectTitle = this.environment.getProperty("project.title");

    }

    public static SflProperties getInstance() {
        return instance;
    }

    public static void setInstance(SflProperties instance) {
        SflProperties.instance = instance;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }
}
