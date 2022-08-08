/*Inserting a record
ABC International School wants to computerize students details. The school maintains a database of students in MYSQL.
The student table contains information related to students and is shown in the following student table structure.
Column Name Type Constraint
Rollno Number (4) Primary Key
StudentName Varchar (20) Not Null
Standard Varchar (2) Not Null
Date_Of_Birth Date
Fees Number (9,2)
 When a new student joins the school, the student record is inserted in the student table.
 The valid student details are as follows:
• Rollno: Valid value is a 4-digit number
• StudentName: Valid value can contain maximum 20 letters in uppercase
• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)
Write a Java program to insert some records to the table*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AbcSchool {

	public static void main(String[] args) throws Exception

	{

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql1 = "";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcschool", "root", "root");

		System.out.println("Selecting data from student table through roll no");
		System.out.println("Enter Roll No");
		int roll = sc.nextInt();

		sql1 = "SELECT * FROM student WHERE rollno = ?;";

		pstmt = conn.prepareStatement(sql1);
		if (roll != 0)
			pstmt.setInt(1, roll);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			int ROLLNO = rs.getInt("ROLLNO");
			String STUDENTNAME = rs.getString("STUDENTNAME");
			String STANDARD = rs.getString("STANDARD");
			String DATE_OF_BIRTH = rs.getString("DATE_OF_BIRTH");
			double FEES = rs.getDouble("FEES");

			System.out.println(ROLLNO + " " + STUDENTNAME + " " + STANDARD + " " + DATE_OF_BIRTH + " " + FEES);
		}

		System.out.println();
		System.out.println("Inserting Data to Student Table");
		int rollno = 0;
		do {
			System.out.print("Enter rollno: ");
			String rollstr = sc.nextLine();

			try {
				rollno = Integer.parseInt(rollstr);
				if (String.valueOf(rollno).length() != 4)
					rollno = 0;
			} catch (Exception e) {
			}
		} while (rollno == 0);

		String studentName = "";
		boolean uppercasefound;
		do {
			System.out.print("Enter name: ");
			studentName = sc.nextLine();

			uppercasefound = false;
			for (int i = 0; i < studentName.length(); i++) {
				if (Character.isUpperCase(studentName.charAt(i))) {
					uppercasefound = true;
					break;
				}
			}

		} while (studentName.length() > 20);

		String standard = "";
		String[] standards = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
		List<String> list = new ArrayList();
		list.add("I");
		list.add("II");
		list.add("III");
		list.add("IV");
		list.add("V");
		list.add("VI");
		list.add("VII");
		list.add("VIII");
		list.add("IX");
		list.add("X");

		do {
			System.out.print("Enter standard: ");
			standard = sc.nextLine();
		} while (!list.contains(standard));

		System.out.print("Enter DOB: ");
		String dob = sc.nextLine();

		System.out.print("Enter Fees: ");
		double fees = sc.nextInt();

		// inserting data into db

		String sql = "INSERT INTO student VALUES(?, ?, ?, ?, ?)";

		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, rollno);
		pstmt.setString(2, studentName);
		pstmt.setString(3, standard);
		pstmt.setString(4, dob);
		pstmt.setDouble(5, fees);
		int i = pstmt.executeUpdate();
		if (i > 0) {
			System.out.println("Success");
		}

		System.out.println();
		System.out.println("Selecting Data from Student table");
		Statement st = conn.createStatement();
		String query = "select * from student;";
		ResultSet rs1;
		rs1 = st.executeQuery(query);

		while (rs1.next()) {
			System.out.println("RollNo: " + rs1.getInt(1) + ", Name: " + rs1.getString(2) + ", Standard: "
					+ rs1.getString(3) + ", DOB: " + rs1.getString(4) + ", Fees: " + rs1.getString(5));
		}

	}
}
