import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Main extends HttpServlet {

    private int i;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<!DOCTYPE HTML>");
        if (i == 2) {
            response.getWriter().println("<html><body><p><h1>IQ = 100500</h1></p></body></html>");
        }else {
            response.getWriter().println("<html><body><p><h1>А Вы, батенька, оптимист </h1></p></body></html>");
        }
        response.getWriter().println("<html><body><p><h1>Правильных ответов " + i + "</h1></p></body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        i = 0;
       String plus = request.getParameter("plus");
       String letter = request.getParameter("letter");
       if(plus.equals("4")) {
           i++;
       }
       if (letter.equals("п")) {
           i++;
       }
       doPost(request, response);
    }
}
