package com.fullcreative.login.test;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.sql.*;

public class SqlConnectionTest {

	@Test
	public void testConnection() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "tiger";

		ResultSet rs = null;
		Connection con = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, user, password);

			String dbName = "User";

			if (con != null) {

				System.out.println("check if a database exists using java");

				rs = con.getMetaData().getCatalogs();

				while (rs.next()) {
					String catalogs = rs.getString(1);
					if (dbName.equals(catalogs)) {
						assertTrue(dbName, dbName.equals(catalogs));
					}
				}
			}
		} finally {

			rs.close();
			con.close();
		}

	}

}
