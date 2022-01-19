package com.nurmelekovat.a2.qualifier;

import javax.enterprise.inject.Default;

@Default
public class MariaDb implements IDatabaseOption {
	
	@Override
	public String databaseOption(String data) {
		return "Opsiyonel Database MariaDb";
	}

}
