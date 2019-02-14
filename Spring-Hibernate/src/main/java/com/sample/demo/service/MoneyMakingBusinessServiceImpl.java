package com.sample.demo.service;

import com.sample.demo.bank.MoneyRoll;
import com.sample.demo.repository.MoneyRepository;

public class MoneyMakingBusinessServiceImpl implements MoneyMakingBusinessService {

	private MoneyRepository moneyRepository;
	
	public void makeMoney( MoneyRoll money )  {
		moneyRepository.make( money );
	}

	public MoneyRoll withdrawMoney( Long moneyRollId ) {
		return moneyRepository.find( moneyRollId );
	}

	public void setMoneyRepository( MoneyRepository moneyRepository ) {
		this.moneyRepository = moneyRepository;
	}
}
