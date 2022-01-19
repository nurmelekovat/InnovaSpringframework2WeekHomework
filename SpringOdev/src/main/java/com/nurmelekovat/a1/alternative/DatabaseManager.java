package com.nurmelekovat.a1.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named(value = "alternativeCDI")
@ApplicationScoped
public class DatabaseManager {
	
	@Inject
	private IDatabaseOption iDatabaseOption;
	
	public String getiJavaVersion() {
		return iDatabaseOption.databaseOption("Database Seçenekleri : ");
	}

}
