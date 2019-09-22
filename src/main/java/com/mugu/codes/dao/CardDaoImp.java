package com.mugu.codes.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mugu.codes.entity.PanDetails;

@Repository
public class CardDaoImp implements CardDao{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public int checking(String x)
	{
		Session ses = sf.getCurrentSession();
		String fin = x.toUpperCase();
		PanDetails pd =(PanDetails) ses.get(PanDetails.class,fin);
		if(pd!=null)
		{
		
			if(pd.getCreditScore()<5)
			{
				return 1;
			}
			
			return 0;
		
		}else 
		{
			return 2;
		}
	}
	
}
