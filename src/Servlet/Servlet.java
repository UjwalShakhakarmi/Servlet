package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// /hello browser ma garyo vaney yeta ko function run garcxa
@WebServlet(urlPatterns = "/hello")

public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("name","Ujwal ");
        req.getRequestDispatcher("index.jsp").forward(req,res);
    }

}
