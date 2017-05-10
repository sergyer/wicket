package com.mycompany;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by sergy on 06-May-17.
 */
public class WelcomePage extends WebPage {

    public WelcomePage(PageParameters pageParameters) {

        final Label label = new Label("result", "Welcome: "+ pageParameters.getString("userName"));

        add(label);
    }
}
