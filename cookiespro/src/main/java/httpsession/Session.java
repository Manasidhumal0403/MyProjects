package httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session")
public class Session extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	//HttpServletRequest interface provides two methods to get the object of HttpSession:
	//h
	HttpSession httpSession=req.getSession();
	HttpSession httpSession2=req.getSession();
	httpSession.setAttribute("id", 1);
	httpSession.setAttribute("name", "manansi");
	httpSession.setAttribute("place","pune");
	System.out.println(httpSession);
	System.out.println(httpSession2);
}
}
