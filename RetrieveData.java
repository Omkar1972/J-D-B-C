import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","omkar123");
		
		
	    Statement st=con.createStatement();
	    
	    String sql="select *from student_tbl";
	    
	    ResultSet rs=st.executeQuery(sql);
	    
	    
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+" "+rs.getString(2).toUpperCase()+" ");
	    }
	    
	    con.close();
		

	}

}
