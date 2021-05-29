package com.OnlineEStore.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.OnlineEStore.Exceptions.IDNotFoundException;
import com.OnlineEStore.Models.Items;

public class ElecItemDaoImpl implements ElecItemDao {
	public void addOneItem(Items item) {
		String sql = "insert into Item values(?,?,?,?,?,?,?,?,?)";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, item.getItemId());
			statement.setString(2, item.getBrand());
			statement.setString(3, item.getCategory());
			statement.setDouble(4, item.getPrice());
			statement.setInt(5, item.getQuantity());
			statement.setInt(6, item.getRating());
			statement.setString(7, item.getColor());
			statement.setString(8, item.getMemorySpecification());
			statement.setInt(9, item.getDiscount());
			statement.execute();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());

				}
			DBConnection.closeconnection();
		}

	}

	public int updateOneItem(int itemId, double price, String memorySpecfication)  {
		String sql = "update Item set price=? ,memoryspecification=? where itemId=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		 int result=0;
		try {
			statement = connection.prepareStatement(sql);
			statement.setDouble(1, price);
			statement.setString(2, memorySpecfication);
			statement.setInt(3, itemId);
			
			result=statement.executeUpdate();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());

				}
			DBConnection.closeconnection();
		}
		return result;

	}

	public int deleteOneItem(int itemId)  {
		String sql = "delete from Item where itemId=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		int result=0;
		try {
			statement = connection.prepareStatement(sql);

			statement.setInt(1, itemId);
			
			result=statement.executeUpdate();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());

				}
			DBConnection.closeconnection();
		}
		 return result;

	}

	public List<Items> findAllItems() {
		String sql = "select * from item";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		List<Items> itemList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int itemId = rs.getInt(1);
				String brand = rs.getString("brand");
				String category = rs.getString("category");
				double price = rs.getDouble("price");
				int quantity = rs.getInt(5);
				int rating = rs.getInt(6);
				String color = rs.getString("color");
				String memoryspecification = rs.getString("memoryspecification");
				int discount = rs.getInt(9);

				Items item = new Items(itemId, brand, category, price, quantity, rating, color, memoryspecification,
						discount);
				itemList.add(item);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();

		}
		return itemList;

	}

	public Items findItemById(int itemId) {
		String sql = "select * from item where itemId=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		Items item = null;
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setInt(1, itemId);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				int itemId1 = rs.getInt(1);
				String brand = rs.getString("brand");
				String category = rs.getString("category");
				double price = rs.getDouble("price");
				int quantity = rs.getInt(5);
				int rating = rs.getInt(6);
				String color = rs.getString("color");
				String memoryspecification = rs.getString("memoryspecification");
				int discount = rs.getInt(9);

				item = new Items(itemId1, brand, category, price, quantity, rating, color, memoryspecification,
						discount);

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();

		}
		return item;

	}

	public List<Items> findItemsByColor(String color) {
		String sql = "select * from item where color=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		List<Items> itemList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, color);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int itemId = rs.getInt(1);
				String brand = rs.getString("brand");
				String category1 = rs.getString("category");
				double price = rs.getDouble("price");
				int quantity = rs.getInt(5);
				int rating = rs.getInt(6);
				String color1 = rs.getString("color");
				String memoryspecification = rs.getString("memoryspecification");
				int discount = rs.getInt(9);

				Items item = new Items(itemId, brand, category1, price, quantity, rating, color1, memoryspecification,
						discount);
				itemList.add(item);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();

		}
		return itemList;
	}

	public List<Items> findItemsByBrand(String brand) {
		String sql = "select * from item where brand=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		List<Items> itemList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, brand);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int itemId = rs.getInt(1);
				String brand1 = rs.getString("brand");
				String category1 = rs.getString("category");
				double price = rs.getDouble("price");
				int quantity = rs.getInt(5);
				int rating = rs.getInt(6);
				String color1 = rs.getString("color");
				String memoryspecification = rs.getString("memoryspecification");
				int discount = rs.getInt(9);

				Items item = new Items(itemId, brand1, category1, price, quantity, rating, color1, memoryspecification,
						discount);
				itemList.add(item);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();

		}
		return itemList;
	}

	public List<Items> findItemsByMemorySpeci(String memoryspecification) {
		String sql = "select * from item where memoryspecification=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		List<Items> itemList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, memoryspecification);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int itemId = rs.getInt(1);
				String brand1 = rs.getString("brand");
				String category1 = rs.getString("category");
				double price = rs.getDouble("price");
				int quantity = rs.getInt(5);
				int rating = rs.getInt(6);
				String color1 = rs.getString("color");
				String memoryspecification1 = rs.getString("memoryspecification");
				int discount = rs.getInt(9);

				Items item = new Items(itemId, brand1, category1, price, quantity, rating, color1, memoryspecification1,
						discount);
				itemList.add(item);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();

		}
		return itemList;

	}

	public List<Items> findItemsByQuantity(Integer quantity) {
		String sql = "select * from item where quantity=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		List<Items> itemList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setInt(1, quantity);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int itemId = rs.getInt(1);
				String brand1 = rs.getString("brand");
				String category1 = rs.getString("category");
				double price = rs.getDouble("price");
				int quantity1 = rs.getInt(5);
				int rating = rs.getInt(6);
				String color1 = rs.getString("color");
				String memoryspecification1 = rs.getString("memoryspecification");
				int discount = rs.getInt(9);

				Items item = new Items(itemId, brand1, category1, price, quantity1, rating, color1,
						memoryspecification1, discount);
				itemList.add(item);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();

		}
		return itemList;

	}

	public List<Items> findItemsByDiscount(Integer discount) {
		String sql = "select * from item where discount=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		List<Items> itemList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setInt(1, discount);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int itemId = rs.getInt(1);
				String brand1 = rs.getString("brand");
				String category1 = rs.getString("category");
				double price = rs.getDouble("price");
				int quantity1 = rs.getInt(5);
				int rating = rs.getInt(6);
				String color1 = rs.getString("color");
				String memoryspecification1 = rs.getString("memoryspecification");
				int discount1 = rs.getInt(9);

				Items item = new Items(itemId, brand1, category1, price, quantity1, rating, color1,
						memoryspecification1, discount1);
				itemList.add(item);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();

		}
		return itemList;

	}

	@Override
	public List<Items> findItemsByCategory(String category) {
		String sql = "select * from item where category=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		List<Items> itemList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, category);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int itemId = rs.getInt(1);
				String brand = rs.getString("brand");
				String category1 = rs.getString("category");
				double price = rs.getDouble("price");
				int quantity = rs.getInt(5);
				int rating = rs.getInt(6);
				String color1 = rs.getString("color");
				String memoryspecification = rs.getString("memoryspecification");
				int discount = rs.getInt(9);

				Items item = new Items(itemId, brand, category1, price, quantity, rating, color1, memoryspecification,
						discount);
				itemList.add(item);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();

		}
		return itemList;
	}

	@Override
	public List<Items> findItemsByWish(String color, String brand, String memoryspecification, int discount,
			double price) {
		String sql = "select * from item where color=? AND brand=? AND memoryspecification=? AND discount=? AND price=?";
		Connection connection = DBConnection.openconnection();
		PreparedStatement statement = null;
		List<Items> itemList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, color);
			statement.setString(2, brand);
			statement.setString(3, memoryspecification);
			statement.setInt(4, discount);
			statement.setDouble(5, price);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int itemId = rs.getInt(1);
				String brand1 = rs.getString("brand");
				String category1 = rs.getString("category");
				double price1 = rs.getDouble("price");
				int quantity = rs.getInt(5);
				int rating = rs.getInt(6);
				String color1 = rs.getString("color");
				String memoryspecification1 = rs.getString("memoryspecification");
				int discount1 = rs.getInt(9);

				Items item = new Items(itemId, brand1, category1, price1, quantity, rating, color1,
						memoryspecification1, discount1);
				itemList.add(item);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();

		}
		return itemList;
	}

}
