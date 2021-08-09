package com.shweta.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shweta.entity.Gender;

public interface GenderRepo extends JpaRepository<Gender,Serializable>{

}
