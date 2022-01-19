package com.nurmelekovat.a5.iocli.cdili;

import javax.inject.Inject;

public class _02_DatabaseManager {

	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject
	private _01_DatabaseOption databaseInterface;
	
	public _02_DatabaseManager(_01_DatabaseOption databaseInterface) {
		this.databaseInterface = databaseInterface;
	}
	
	// Metot
	public void newDatabaseOption() {
		databaseInterface.databaseOption();
	}
}
