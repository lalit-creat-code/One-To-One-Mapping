package com.lalit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lalit.entity.Persons;

public interface Personrepo extends JpaRepository<Persons,Integer> {

}
