package com.nurmelekovat.a1.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mysql implements IDatabaseOption {
	
	@Override
	public String databaseOption(String data) {
		return "Database Option Mysql";
	}

}
