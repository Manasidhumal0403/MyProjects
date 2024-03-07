package servlet_product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
int id=Integer.parseInt(req.getParameter("id"));
String name=req.getParameter("name");
double price=Double.parseDouble(req.getParameter("price"));
String brand=req.getParameter("brand");
String state=req.getParameter("state");

Product product=new Product();

product.setId(id);
product.setName(name);
product.setPrice(price);
product.setBrand(brand);
product.setState(state);

ServletContext context=getServletContext();
double CGST=Double.parseDouble(context.getInitParameter("CGST"));
if (state.equals("KAR"))
{
	ServletConfig config=getServletConfig();
	double SGST=Double.parseDouble(config.getInitParameter("KAR"));
	price+=(CGST+SGST)*price;
	
}
else
{
	ServletConfig config=getServletConfig();
	double SGST=Double.parseDouble(config.getInitParameter("MH"));
	price+=(CGST+SGST)*price;
}
product.setPrice(price);

ProductCRUD crud=new ProductCRUD();
try {
	int result=crud.saveProduct(product);
	PrintWriter printWriter=resp.getWriter();
	if (result!=0)
	{
		printWriter.print("saved");
	}
	else
	{
		printWriter.print("not saved");
	}
	
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
	}

}
