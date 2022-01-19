package com.nurmelekovat.a2.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualiferCDI")
@ApplicationScoped
public class QualiferManagerDatabase implements Serializable{
	private static final long serialVersionUID = 3097860167944776376L;
	
	@Inject
	@QualifierCokluSecim
	private IDatabaseOption iDatabaseOption;
	
	public String getiDatabaseOption() {
		return iDatabaseOption.databaseOption(" Veritabanı Seçimi ");
	}

}
