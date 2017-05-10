package com.mycompany;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see wicket.myproject.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{    
    /**
     * Constructor
     */
	public WicketApplication()
	{
	}

    @Override
    protected void init() {

        super.init();
        addComponentInstantiationListener(new SpringComponentInjector(this));

        mountBookmarkablePage("asdasd", HomePage.class);

    }


	
	/**
	 * @see wicket.Application#getHomePage()
	 */
	public Class getHomePage()
	{
		return LoginPage.class;
	}

}
