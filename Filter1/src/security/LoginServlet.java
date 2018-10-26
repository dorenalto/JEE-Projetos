package security;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		
		UserInfo userInfor = new UserInfo();
		userInfor.setId (user);
		userInfor.setSenha (password);
		
		HttpSession session = request.getSession();
		session.setAttribute ("useInfo", userInfor);
		
		request.getRequestDispatcher("/sucesso.jsp").forward (request, response);
	}

}
