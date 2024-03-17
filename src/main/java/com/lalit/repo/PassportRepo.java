package com.lalit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lalit.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport,Integer> {

}
