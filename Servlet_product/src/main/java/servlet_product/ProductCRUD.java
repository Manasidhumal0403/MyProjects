package servlet_product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductCRUD {
	public int saveProduct(Product product) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdbrj?user=root&password=Bappa@123");

	PreparedStatement preparedStatement=connection.prepareStatement("insert into product values (?,?,?,?,?)");
		preparedStatement.setInt(1, product.getId());
		preparedStatement.setString(2, product.getName());
		preparedStatement.setDouble(3, product.getPrice());
		preparedStatement.setString(4, product.getBrand());
		preparedStatement.setString(5, product.getState());
	int count  =	preparedStatement.executeUpdate();
	connection.close();
	return count;
	
	}
	


}
