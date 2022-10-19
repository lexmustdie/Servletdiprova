package it.alessandro.tomcat;


import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {

	public static void main(String[] args) {

        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8082);

        Context ctx = tomcat.addContext("/pippo", new File(".").getAbsolutePath());
        
        PrimaServlet primaServlet = new PrimaServlet();
        
        Tomcat.addServlet(ctx, "pippo", primaServlet);

        ctx.addServletMapping("/*", "pippo");

        try {
			tomcat.start();
		} catch (LifecycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        tomcat.getServer().await();
	}

}
