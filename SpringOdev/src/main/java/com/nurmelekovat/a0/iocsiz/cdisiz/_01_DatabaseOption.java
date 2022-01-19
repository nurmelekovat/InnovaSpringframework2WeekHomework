package com.nurmelekovat.a0.iocsiz.cdisiz;

public class _01_DatabaseOption {
	
	public void databaseOption(String version) {
		if (version.equals("Mysql")) {
			System.out.println("Database: Mysql");
		} else if (version.equals("MariaDb")) {
			System.out.println("Database:MariaDb");
		} else if (version.equals("Mssql")) {
			System.out.println("Database:Mssql");
		} else {
			System.out.println("Farklı bir veritabanı seçtiniz.");
		}
	}

}