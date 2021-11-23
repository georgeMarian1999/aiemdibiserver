package server.servers;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;
import server.servlets.Movies;
import server.servlets.Status;

public class JettyServer {

    private Server server;

    public JettyServer(){
        server = new Server();
    }

    public void start() throws Exception {

        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8080);
        server.setConnectors(new Connector[] {connector});


        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);

        servletHandler.addServletWithMapping(Status.class,"/status");
        servletHandler.addServletWithMapping(Movies.class,"/movies");
        server.start();
}
}

