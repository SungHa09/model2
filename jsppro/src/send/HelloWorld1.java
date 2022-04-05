package send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloWorld1
 */
@WebServlet(description = "처음 작성하는 자바 서블릿", urlPatterns = { "/HelloWorld1" })
public class HelloWorld1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 현재 문서의 한글값 인코딩2
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); // 출력 스트림 객체
		HttpSession session = request.getSession(); // 세션 객체
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>안녕하세요.</h1>");
		out.println("<h1>안녕히 가세요.</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
