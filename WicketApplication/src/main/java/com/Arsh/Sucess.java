package com.Arsh;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.omg.PortableInterceptor.SUCCESSFUL;

public class Sucess extends WebPage{
public void Sucess(final PageParameters pg){
	System.out.println(pg.getValues("user"));
}
}
