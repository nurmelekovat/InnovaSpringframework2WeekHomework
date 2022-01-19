package com.nurmelekovat.a4.iocli.cdisiz;

public class _02_DatabaseManager {
	
	// interface çağır
		private _01_DatabaseOption databaseInterface;
		
		// paramatreli constructor
		public _02_DatabaseManager(_01_DatabaseOption databaseInterface) {
			this.databaseInterface = databaseInterface;
		}
		
		// Metot
		public void newDatabaseOption() {
			databaseInterface.databaseOption();
		}
}
