package com.sample.demo.service;

import com.sample.demo.bank.MoneyRoll;


public interface MoneyMakingBusinessService {

	public void makeMoney( MoneyRoll money );
	
	public MoneyRoll withdrawMoney( Long moneyRollId );	
}
