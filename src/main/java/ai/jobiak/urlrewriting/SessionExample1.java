package ai.jobiak.urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionExample1
 */
@WebServlet("/sessionExample1")
public class SessionExample1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionExample1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//1.get form data
		String fname=request.getParameter("n1");
		String lname=request.getParameter("n2");
		//2.HttpSession Creation
		HttpSession hs=request.getSession();
			hs.setAttribute("key1",fname);
			hs.setAttribute("key2",lname);
			out.println("<a href=S2?x="+fname+"&y="+lname+">Go to Servlet</a>");
	}

}
