package server.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Client extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        StringBuilder contentBuilder = new StringBuilder();
//        try {
//            BufferedReader in = new BufferedReader(new FileReader("src/main/webapp/dist/index.html"));
//            String str;
//            while ((str = in.readLine()) != null) {
//                contentBuilder.append(str);
//            }
//            in.close();
//        } catch (IOException e) {
//        }
//        String content = contentBuilder.toString();
//        out.println(content);
//        out.flush();
    }
}
