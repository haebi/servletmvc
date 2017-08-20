package com.haebi.test.service;

import java.util.ArrayList;
import java.util.List;

import com.haebi.test.model.PersonModel;

public class ListDataService {
	
	public List<PersonModel> getListData()
	{
		List<PersonModel> li = new ArrayList<PersonModel>();

		li.add(new PersonModel("È«È«ÀÌ","111-1111-1111","¼­¿ï½Ã"));
		li.add(new PersonModel("Ä²Ä²ÀÌ","222-2222-2222","ºÎ»ê½Ã"));
		li.add(new PersonModel("Å¯Å¯ÀÌ","333-3333-3333","´ë±¸½Ã"));

		
//		PersonModel pm1 = new PersonModel("È«È«ÀÌ","111-1111-1111","¼­¿ï½Ã");
//		PersonModel pm2 = new PersonModel("Ä²Ä²ÀÌ","222-2222-2222","ºÎ»ê½Ã");
//		PersonModel pm3 = new PersonModel("Å¯Å¯ÀÌ","333-3333-3333","´ë±¸½Ã");
//		
//		li.add(pm1);
//		li.add(pm2);
//		li.add(pm3);
				
		return li;
	}
}
