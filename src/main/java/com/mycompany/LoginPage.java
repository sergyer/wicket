package com.mycompany;

import com.mycompany.model.Person;
import com.mycompany.service.PersonService;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by sergy on 06-May-17.
 */
public class LoginPage extends WebPage {

    @SpringBean
    private PersonService personService;

    private LoginPageModel pageModel;




    public LoginPage() {

//        final TextField userNameField = new TextField("userName", new Model(""));
//        final PasswordTextField passwordField = new PasswordTextField("password",new Model(""));

//        Form form = new Form("loginForm"){
//            @Override
//            protected void onSubmit() {
//                final String userName = (String) userNameField.getModelObject();
//                PageParameters pageParameters = new PageParameters();
//                pageParameters.add("userName", userName);
//                setResponsePage(WelcomePage.class,pageParameters);
//            }
//        };

        pageModel = new LoginPageModel();

        add(new MyForm("loginForm", new CompoundPropertyModel(pageModel)));

//        form.add(userNameField);
//        form.add(passwordField);
//        add(form);
    }



    private class MyForm extends Form {

        private static final long serialVersionUID = 7304238595549111471L;

        public MyForm(final String id, final IModel model) {
            super(id, model);
            setOutputMarkupId(true);
            initFormComponets();
        }

        private void initFormComponets() {
            final TextField userNameField = new TextField("userName");
            final PasswordTextField passwordField = new PasswordTextField("password");
            add(userNameField);
            add(passwordField);
        }

        @Override
        protected void onSubmit() {
//            super.onSubmit();
            LoginPageModel result = (LoginPageModel)getModelObject();




        }
    }


}
