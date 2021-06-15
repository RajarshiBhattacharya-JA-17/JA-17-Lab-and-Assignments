/**
 * 
 */
package com.capgemini.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author Rajarshi
 *
 */
public class ProductManagementJDBC {
	
	static Connection conn = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	static Scanner sc = new Scanner(System.in);
	static int pid;
	static String pname;
	static double price;
	
	public Connection getConnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","SecretProgrammer10");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	public void createTable() {
		
		try {
			stmt = conn.createStatement();
			String create = "create table "
					+ "product_new(pid number, pname varchar(20),"
					+ "price number(10,2))";
			int i = stmt.executeUpdate(create);
			if(i == 0)
				System.out.println("Table created successfully");
			else
				System.out.println("Table not created...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void insertData() {
		try {
			String insert = "insert into product_new values(?,?,?)";
			pstmt = conn.prepareStatement(insert);
			readDetails();
			pstmt.setInt(1, pid);
			pstmt.setString(2,  pname);
			pstmt.setDouble(3, price);
			int i = pstmt.executeUpdate();
			if(i != 0)
				System.out.println("Data inserted...");
			else
				System.out.println("Data not inserted...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void getProducts() {
		
		String display = "select * from product_new";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(display);
			System.out.println("PID\t\tPNAME\t\tPRICE");
			System.out.println("==============================================");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+
				rs.getString(2)+"\t\t"+rs.getDouble(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void getProductByID() {
		String displayByID = "select * from product_new"
				+ " where pid = ?";
		try {
			pstmt = conn.prepareStatement(displayByID);
			readPID();
			pstmt.setInt(1, pid);
			rs = pstmt.executeQuery();
			System.out.println("PID\t\tPNAME\t\tPRICE");
			System.out.println("==============================================");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+
				rs.getString(2)+"\t\t"+rs.getDouble(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void updateProduct() {
		String updateByID = "update product_new "
				+ "set pid = ?, pname = ?, price = ?"
				+ " where pid = ?";
		try {
			pstmt = conn.prepareStatement(updateByID);
			readDetails();
			pstmt.setInt(1, pid);
			pstmt.setString(2,  pname);
			pstmt.setDouble(3, price);
			pstmt.setInt(4, pid);
			rs = pstmt.executeQuery();
			if(rs.next())
				System.out.println("Updated Successfully...");
			else
				System.out.println("Not Updated...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void deleteProduct() {
		String deleteByID = "delete from product_new"
				+ " where pid = ?";
		try {
			pstmt = conn.prepareStatement(deleteByID);
			readPID();
			pstmt.setInt(1, pid);
			rs = pstmt.executeQuery();
			if(rs.next())
				System.out.println("Deleted Successfully...");
			else
				System.out.println("Not Deleted...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static void readPID() {
		System.out.println("Enter PID:");
		pid = sc.nextInt();
	}
	
	private static void readDetails() {
		System.out.println("Enter Product Details:");
		readPID();
		System.out.println("Enter Product Name:");
		sc.nextLine();
		pname = sc.nextLine();
		System.out.println("Enter Product Price:");
		price = sc.nextDouble();
	}

}
