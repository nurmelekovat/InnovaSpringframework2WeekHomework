package com.nurmelekovat.a3.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class _4_DefaultDatabaseVersion implements _3_IDatabaseOption {
	
	@Override
	public String databaseOption(String data) {
		return "Default java version 11";
	}

}
