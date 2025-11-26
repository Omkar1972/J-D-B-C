import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","omkar123");
		

		String sql="DELETE FROM student_tbl WHERE s_id = ?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1, 9);
		
		int a=ps.executeUpdate();
		
		if(a>0)
		{
			System.out.println("Record deleted successfully!");
		}
		else
		{
			System.out.println("No record found!");
		}
		
	
		con.close();
		
		}
	}

