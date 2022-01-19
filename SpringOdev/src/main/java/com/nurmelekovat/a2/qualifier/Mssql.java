package com.nurmelekovat.a2.qualifier;


@QualifierCokluSecim
public class Mssql implements IDatabaseOption {
	
	@Override
	public String databaseOption(String data) {
		return "Opsiyonel Database Mssql";
	}


}
