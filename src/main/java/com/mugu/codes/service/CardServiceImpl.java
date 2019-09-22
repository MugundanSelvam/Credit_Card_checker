package com.mugu.codes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mugu.codes.dao.CardDao;

@Service

public class CardServiceImpl implements CardService {
	
	@Autowired
	private CardDao cd;
	
	@Override
	@Transactional
	public int checking(String x)
	{
		return cd.checking(x);
	}

}
