package com.muhammet;

import com.muhammet.entity.Hizmetli;
import com.muhammet.entity.Mudur;

public class Runner {

	public static void main(String[] args) {
		Mudur mudur =new Mudur();
		mudur.ad = "Kenan";
		mudur.tc = "15489587456";
		mudur.mudurDerecesi = "GenelMüdür";
		mudur.maaskatsayisi = 43;
		
		Hizmetli hizmetli = new Hizmetli();
		hizmetli.katGorevAlanlari = new int[]{2,5,18};
		hizmetli.ad = "Deniz";
		hizmetli.yas = 23;
		hizmetli.maaskatsayisi = 21;
	}

}
