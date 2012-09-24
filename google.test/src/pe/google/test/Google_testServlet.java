package pe.google.test;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Google_testServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world xxxxxxxxxxx yyyyy jojojoj xxxx ja compilo");
	}
}
