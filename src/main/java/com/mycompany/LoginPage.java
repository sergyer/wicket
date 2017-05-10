package com.mycompany;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

/**
 * Created by sergy on 06-May-17.
 */
public class LoginPage extends WebPage {
    public LoginPage() {

        final TextField userNameField = new TextField("userName", new Model(""));
        final PasswordTextField passwordField = new PasswordTextField("password",new Model("a"));

        Form form = new Form("loginForm"){
            @Override
            protected void onSubmit() {
                final String userName = (String) userNameField.getModelObject();
                PageParameters pageParameters = new PageParameters();
                pageParameters.add("userName", userName);
                setResponsePage(WelcomePage.class,pageParameters);
            }
        };

        form.add(userNameField);
        form.add(passwordField);
        add(form);
    }


}
