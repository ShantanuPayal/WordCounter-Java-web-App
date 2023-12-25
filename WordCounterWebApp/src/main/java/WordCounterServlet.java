import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import wc.WordCounter;

@jakarta.servlet.annotation.WebServlet("/WordCountServlet")
public class WordCounterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward to the input form JSP
        request.getRequestDispatcher("wordcount.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get content from the form
        String content = request.getParameter("content");

        // Create an instance of the WordCounter class
        WordCounter wordCounter = new WordCounter();

        // Call the countTotalWords method
        int totalWords = wordCounter.countTotalWords(content);

        // Set the attribute to pass data to JSP
        request.setAttribute("totalWords", totalWords);

        // Forward to a JSP page to display the result
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
