package com.javamaster.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPool {
	
	
	private ConnectionPool(){
		//private constructor
	}
	
	/**
	 * Connection instance
	 */
	private Connection connection = getConnection();

	private static ConnectionPool instance = null;
	
	public static ConnectionPool getInstance(){
		if (instance==null)
			instance = new ConnectionPool();
		return instance;
	}
	
	/**
	 * Getting connection from connection pool.
	 *
	 * @see ConnectionPool
	 * @throws SQLException
	 */
	Connection getConnection() {

				try {
					Class.forName("org.postgresql.Driver").newInstance();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		String username = "dzsgylzmxyqvku";
		String password = "c1a0edb8448e535b6ce9c83a41f197c795e0b11ac1d30cd853df8074ac85b9d8";
		String dbUrl = "jdbc:postgresql://" + "ec2-23-21-171-249.compute-1.amazonaws.com:5432"
				+ "/dao182c12ie67a?sslmode=require";
		try {
			return DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}
}
