package com.nurmelekovat.a3.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class _8_QualifierManager {
	
	@Inject
	@_2_EQalifier(_1_EDatabaseOption.Mysql)
	_3_IDatabaseOption iDatabaseOption;
	
	public String getiDatabaseOption() {
		return iDatabaseOption.databaseOption("Seçim");
	}

}
