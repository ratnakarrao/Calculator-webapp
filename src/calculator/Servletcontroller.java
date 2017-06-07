package calculator;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ServletController")

	public class Servletcontroller extends HttpServlet
	{

	private static final long serialVersionUID = 1L;
	 double c;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
		BasicCalc det=new BasicCalc();
		double a=Double.valueOf(req.getParameter("a"));
		double b=Double.valueOf(req.getParameter("b"));
		det.seta(a);
		det.setb(b);
		String operation=req.getParameter("operation");
		switch (operation)		
		{
		//write switch cases for calling d
			case "Add":
				c=det.Add();
				System.out.println("c");
				break;
			case "Subtract":
				c=det.Subtract();
				System.out.println("c");
				break;
			case "Multiply":
				c=det.Multiply();
				System.out.println("c");
				break;
			case "Divide":
				c=det.Divide();
				System.out.println("c");
				break;
				default:System.out.println("wrong choice");
				break;
		}
		req.setAttribute("answer",c);
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp); 
		} 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	doGet(req, resp);
	}
}
	



	