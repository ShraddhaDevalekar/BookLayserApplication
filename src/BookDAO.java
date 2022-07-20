import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//commit
public class BookDAO {
	int i;
	public int addBook(BookBean bookBean) throws ClassNotFoundException {
		
		System.out.println("Book DAO class");
		
		  Connection connection = null;
	      String url = "jdbc:mysql://localhost:3306/";
	      String dbName = "capgreact2";
	      String driverName = "com.mysql.jdbc.Driver";
	      String userName = "root";
	      String password = "root";
	      try{
	        Class.forName(driverName);
	        connection = DriverManager.getConnection(url+dbName, userName, password);
	       
	        	String query="insert into book values(?,?,?,?)";
	        	
	        	PreparedStatement pstmt=connection.prepareStatement(query);
	        	pstmt.setInt(1,bookBean.getBookId());
	        	pstmt.setString(2,bookBean.getTitle());
	        	pstmt.setDouble(3, bookBean.getPrice());
	        	pstmt.setString(4, bookBean.getGrade());
	        	System.out.println("pstmt...");
	        	i=pstmt.executeUpdate();
	        	
	        	
	        }
	        catch(SQLException e)
	        {
	        	System.out.println(e);
	        }
		
		return i;
	}

}
