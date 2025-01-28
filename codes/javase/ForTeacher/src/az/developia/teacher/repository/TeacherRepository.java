package az.developia.teacher.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import az.developia.teacher.entity.TeacherEntity;
import az.developia.teacher.exception.MyRuntimeException;

public class TeacherRepository {
	
	public void add(TeacherEntity teacher) throws MyRuntimeException{
		
		if (teacher.getUsername().length() > 45) {
			throw new MyRuntimeException("Username should be less than 45 characters...");
		}
		
		String query = "INSERT INTO teacher(name,surname,phone,address,username,password) VALUES "
				+ "('"+teacher.getName()+"','"+teacher.getSurname()+"','"+teacher.getPhone()+"','"+teacher.getAddress()+"','"+teacher.getUsername()+"','"+teacher.getPassword()+"')";
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_teacher?useSSL=false&useTimezone=true&serverTimezone=UTC","root","antalya07");
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean checkUser(String username){
		boolean userExists = false;
		String query = "SELECT count(*) FROM teacher where username ='"+username+"';";
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_teacher?useSSL=false&useTimezone=true&serverTimezone=UTC","root","antalya07");
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery(query);
			result.next();
			userExists = result.getInt(1)==1?true:false;
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return userExists; }
		
		public boolean login(String username, String password) {

			boolean userExists = false;

			String query = "SELECT count(*) FROM teacher where username='" + username + "' and password='"+password+"';";

			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_teacher?useSSL=false&useTimezone=true&serverTimezone=UTC","root","antalya07");
				Statement st = conn.createStatement();

				ResultSet result = st.executeQuery(query);

				result.next();

				userExists = result.getInt(1) == 1 ? true : false;

				conn.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			return userExists;

		}
	
}
