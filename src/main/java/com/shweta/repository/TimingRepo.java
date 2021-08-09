package com.shweta.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shweta.entity.Timing;

public interface TimingRepo extends JpaRepository<Timing,Serializable>{

}
