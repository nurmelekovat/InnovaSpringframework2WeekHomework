package com.nurmelekovat.a4.iocli.cdisiz;

public class MainTest {

	public static void main(String[] args) {
		_02_DatabaseManager javaManager = new _02_DatabaseManager(new _02_Mysql());
		javaManager.newDatabaseOption();
		
	}

}
