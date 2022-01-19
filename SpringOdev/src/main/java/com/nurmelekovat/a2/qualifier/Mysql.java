package com.nurmelekovat.a2.qualifier;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mysql implements IDatabaseOption {
	
	@Override
	public String databaseOption(String data) {
		return "Opsiyonel Database Mysql";
	}

}
