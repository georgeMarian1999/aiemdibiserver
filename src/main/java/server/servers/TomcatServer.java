package server.servers;

import server.servlets.Client;
import server.servlets.Movies;
import server.servlets.Status;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;


import java.io.File;

public class TomcatServer {
    private final int PORT = 8083;
    private Tomcat server;

    public TomcatServer() {
        server = new Tomcat();
    }

    public void startServer() throws Exception{
        server.setPort(PORT);

        Context ctx = server.addContext("",(new File(".")).getAbsolutePath());


        Tomcat.addServlet(ctx,"status", new Status());
        Tomcat.addServlet(ctx,"movies",new Movies());
        Tomcat.addServlet(ctx,"client",new Client());
        ctx.addServletMappingDecoded("/status","status");
        ctx.addServletMappingDecoded("/movies","movies");
        ctx.addServletMappingDecoded("/","client");

        server.start();
        System.out.println("Start server Tomcat embedded");
        server.getServer().await();
    }
}
