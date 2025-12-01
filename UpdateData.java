import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","omkar123");
		
		int s_id=0;
		String s_name=" ";
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter ID:- ");
		s_id=s.nextInt();
		s.nextLine();
		
		System.out.println("Enter Name:- ");
		s_name=s.nextLine();
		
		String sql="UPDATE student_tbl SET s_name=? WHERE s_id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1, s_name);
		ps.setInt(2, s_id);
		
		//ps.setInt(3, s_id);
		
		int a=ps.executeUpdate();
		
		if(a>0)
		{
			System.out.println("Data are Updated");
		}
		else
		{
			System.out.println("Data are not Updated");
		}
	    
				
		con.close();

	}

}
