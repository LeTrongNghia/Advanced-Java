package Task2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Le Trong Nghia
 * @date Sep 19, 2016
 * @version 1.0
 * @description class for cd controller
 */
public class CDController {
	Database db = new Database();
	
	/*
	 * use to get list CD
	 * return List<CD>
	 */
	public List<CD> getListCD() throws SQLException, ClassNotFoundException {
		List<CD> list;
		try(Connection conn = db.connect()) {
			list = new ArrayList<CD>();
			Statement statement = conn.createStatement();
			String sql = "SELECT * FROM cd";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				CD cd = new CD();
				cd.setId(resultSet.getInt("id"));
				cd.setName(resultSet.getString("name"));
				cd.setSinger(resultSet.getString("singer"));
				cd.setNumberOfSongs(resultSet.getInt("numbersongs"));
				cd.setPrice(resultSet.getDouble("price"));
				list.add(cd);
			}
		}
		return list;
	}
	
	/*
	 * use to insert CD
	 * return result > 0 is success and result < 0 is failed
	 */
	public int addCD(CD cd) throws ClassNotFoundException, SQLException {
		try(Connection conn = db.connect()) {
			Statement statement = conn.createStatement();
			String sql = "INSERT INTO cd (name, singer, numbersongs, price) VALUES ('"
							+ cd.getName() + "', '" + cd.getSinger() + "', "  
							+ cd.getNumberOfSongs() + ", " + cd.getPrice() + ")";
			return statement.executeUpdate(sql);
		} 
	}
	
	/*
	 * use to search CD
	 * input String keyword
	 * return list<CD>
	 */
	public List<CD> searchCD(String n) throws ClassNotFoundException, SQLException {
		List<CD> list;
		try(Connection conn = db.connect()) {
			list = new ArrayList<CD>();
			Statement statement = conn.createStatement();
			String sql = "SELECT * FROM cd WHERE name like '%" + n + "%'";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				CD cd = new CD();
				cd.setId(resultSet.getInt("id"));
				cd.setName(resultSet.getString("name"));
				cd.setSinger(resultSet.getString("singer"));
				cd.setNumberOfSongs(resultSet.getInt("numbersongs"));
				cd.setPrice(resultSet.getDouble("price"));
				list.add(cd);
			}
		}
		return list;
	}
	
	/*
	 * use to update information CD
	 * input int id, int numbers, double price
	 * return result > 0 is success and result < 0 is failed
	 */
	public int updateCD(int id, int numbers, double price) throws ClassNotFoundException, SQLException {
		try(Connection conn = db.connect()) {
			Statement statement = conn.createStatement();
			String sql = "UPDATE cd set numbersongs = " + numbers + ", price = " + price + " WHERE id = " + id;
			return statement.executeUpdate(sql);
		}
	}
	
	/*
	 * use to delete information CD
	 * input int id
	 * return result > 0 is success and result < 0 is failed
	 */
	public int deleteCD(int id) throws ClassNotFoundException, SQLException {
		try(Connection conn = db.connect()) {
			Statement statement = conn.createStatement();
			String sql = "DELETE FROM cd WHERE id = " + id;
			return statement.executeUpdate(sql);
		}
	}
}
