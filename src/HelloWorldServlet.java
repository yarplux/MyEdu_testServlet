
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8"); // Необходимо для русского языка

        PrintWriter pw = response.getWriter(); // Вывод может быть посимвольный/побайтный - в зависимости от типа данных
        pw.println("<H1>Hello, World!</H1>");
    }
}
