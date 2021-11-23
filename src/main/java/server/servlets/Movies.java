package server.servlets;

import server.Model.Movie;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Movies extends HttpServlet {

    private Gson gson = new Gson();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        Movie movie1 = new Movie(1,"Avengers Endgame",7,"Action");
        Movie movie2 = new Movie(2,"Avengers Endgame",7,"Action");
        Movie movie3 = new Movie(3,"Avengers Endgame",7,"Action");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        String moviesJSON = gson.toJson(movies);

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(moviesJSON);
        out.flush();

    }
}
