package security;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;


@SuppressWarnings("hiding")
@WebFilter("/sec/*")
public class SecurityFilter<UserInfo> implements Filter {

	public void destroy() {
		
	}
	@SuppressWarnings("unchecked")
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		HttpSession session = req.getSession();
		
		UserInfo user = (UserInfo) session.getAttribute("userInfo");
		
		
		if (user == null) {
		res.sendError(HttpServletResponse.SC_FORBIDDEN);
		return;
		
		} else {
		 chain.doFilter(request, response);
	}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}
	
		
	}


