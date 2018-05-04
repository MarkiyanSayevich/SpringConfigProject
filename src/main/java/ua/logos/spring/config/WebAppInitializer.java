package ua.logos.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		
		webApplicationContext.setServletContext(servletContext);
		webApplicationContext.setConfigLocation("ua.logos.spring.config");
		
		servletContext.addListener(new ContextLoaderListener(webApplicationContext));
		
		ServletRegistration.Dynamic reg = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webApplicationContext));
		
		reg.setLoadOnStartup(1);
		reg.addMapping("/");
	}

	
}
