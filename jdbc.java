import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("Step 1");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","omkar123");
		//System.out.println("Step 2");
		
		
		Statement st=con.createStatement();
//		System.out.println("Step 3");		
		String sql="insert into student_tbl (s_id,s_name) values(1,'OMKAR')";
		
		
		int a=st.executeUpdate(sql);
		
		if(a>0)
		{
			System.out.println("Data inserted");
		}
		else
		{ 
			System.out.println("Data not inserted");
		}
		
		//System.out.println("Step 4");
		
		con.close();
		//System.out.println("step 5");
		
	}
}
