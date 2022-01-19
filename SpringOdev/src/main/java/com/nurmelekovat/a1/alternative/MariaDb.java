package com.nurmelekovat.a1.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MariaDb implements IDatabaseOption {
	
	@Override
	public String databaseOption(String data) {
		return "Database Option MariaDb";
	}

}
