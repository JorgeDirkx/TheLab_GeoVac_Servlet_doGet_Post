import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

    @WebServlet("/register")
    public class RegisterChildServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter writer =resp.getWriter();
            writer.println("<html>" +
                    "<head><title>Registration Form Child</title></head>" +
                    "<body>" +
                    "<form method='post'>"+
                    "<label for=\"firstname\">First Name</label>"+
        "<input id=\"firstname\" name=\"firstname\" type=\"text\" placeholder=\"enter your first name\" required>"+
        "<label for=\"lastname\">Last Name</label>"+
        "<input id=\"lastname\" name=\"lastname\" type=\"text\" placeholder=\"enter your last name\"required>"+
        "<label for=\"DOB\">Date of Birth</label>"+
        "<input for=\"DOB\" name=\"DOB\" type=\"date\" required>"+
        "<label for=\"Gender\">Gender</label>"+
        "<select name=\"Gender\" id=\"Gender\">"+
            "<option value=\"Male\">Male</option>"+
            "<option value=\"Female\">Female</option>"+
        "</select>"+
        "<button type=\"submit\">Register Child</button>"+
        "</form>"+
                    "</body>" +
                    "</hmtl>");
            writer.close();
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter writer =resp.getWriter();
            writer.println("<html>" +
                    "<head><title>Registration Form Child</title></head>" +
                    "<body><h1>" +
                    "Registration of: " +
                    req.getParameter("lastname").toUpperCase() + " is completed"+
                    "</h1></body>" +
                    "</hmtl>");
            writer.close();
        }
    }


