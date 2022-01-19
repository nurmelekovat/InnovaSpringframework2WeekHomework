package com.nurmelekovat.a6.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class _01_Named implements Serializable {
	private static final long serialVersionUID = -1806256027076814974L;
	private String computerName;
	
	// parametresiz constructor
	public _01_Named() {
		this.computerName = "Bilgisayar Adı 544515MXCCCR";
	}
	
	// parametreli constructor
	public _01_Named(String computerName) {
		this.computerName = computerName;
	}
	
}
