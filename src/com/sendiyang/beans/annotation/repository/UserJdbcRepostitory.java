package com.sendiyang.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcRepostitory implements UserRepository {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserJdbcRepostitory save...");
		
	}

	
}
