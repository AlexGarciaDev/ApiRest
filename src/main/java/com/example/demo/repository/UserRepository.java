package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entities.User;


public interface UserRepository extends CrudRepository<User, Long>, 
PagingAndSortingRepository<User, Long>, 
JpaSpecificationExecutor<User>, 
JpaRepository<User, Long>{

}
