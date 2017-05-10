package com.mycompany;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

/**
 * Homepage
 */
public class HomePage extends WebPage {


    public HomePage() {

        add(new Label("message", "If you see this message wicket is properly configured and running"));

    }
}
