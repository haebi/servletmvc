package com.haebi.test.service;

import java.util.ArrayList;
import java.util.List;

import com.haebi.test.model.PersonModel;

public class ListDataService {
	
	public List<PersonModel> getListData()
	{
		List<PersonModel> li = new ArrayList<PersonModel>();

		li.add(new PersonModel("홍홍이","111-1111-1111","서울시"));
		li.add(new PersonModel("캉캉이","222-2222-2222","부산시"));
		li.add(new PersonModel("킁킁이","333-3333-3333","대구시"));
				
		return li;
	}
}
