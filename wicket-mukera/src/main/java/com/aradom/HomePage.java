package com.aradom;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("selam", "Conveying Greetings"));
		add(new Link("nextpage"){

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				setResponsePage(NextPage.class);
			}
			
		});

		// TODO Add your page's components here

    }
}
