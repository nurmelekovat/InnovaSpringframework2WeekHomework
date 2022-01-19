package com.nurmelekovat.a5.iocli.cdili;

public class MainTest {

	public static void main(String[] args) {
		_02_DatabaseManager databaseManager = new _02_DatabaseManager(new _02_Mssql());
		databaseManager.newDatabaseOption();
	}

}
