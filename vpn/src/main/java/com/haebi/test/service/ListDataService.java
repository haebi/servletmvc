package com.haebi.test.service;

import java.util.ArrayList;
import java.util.List;

import com.haebi.test.model.PersonModel;

public class ListDataService {
	
	public List<PersonModel> getListData()
	{
		List<PersonModel> li = new ArrayList<PersonModel>();

		li.add(new PersonModel("ȫȫ��","111-1111-1111","�����"));
		li.add(new PersonModel("ĲĲ��","222-2222-2222","�λ��"));
		li.add(new PersonModel("ůů��","333-3333-3333","�뱸��"));

		
//		PersonModel pm1 = new PersonModel("ȫȫ��","111-1111-1111","�����");
//		PersonModel pm2 = new PersonModel("ĲĲ��","222-2222-2222","�λ��");
//		PersonModel pm3 = new PersonModel("ůů��","333-3333-3333","�뱸��");
//		
//		li.add(pm1);
//		li.add(pm2);
//		li.add(pm3);
				
		return li;
	}
}
