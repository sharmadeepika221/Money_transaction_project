package com.sample.demo.repository;

import com.sample.demo.bank.MoneyRoll;

public interface MoneyRepository {

	public void make( MoneyRoll moneyRoll );    // C
	public MoneyRoll find( Long id );           // R
	public void update( MoneyRoll moneyRoll );  // U
	public void takeOut( MoneyRoll moneyRoll ); // D
}
