package com.ty.shoping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.shoping.dto.User;
import com.ty.shoping.util.ConnectionObject;

public class UserDao {

	public int saveUser(User user) {
		String sql = "INSERT INTO user VALUES(?,?,?,?,?)";
		Connection connection = ConnectionObject.getConnection();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, user.getId());
			preparedStatement.setString(2, user.getName());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setLong(5, user.getMobile());
			
			return preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}
