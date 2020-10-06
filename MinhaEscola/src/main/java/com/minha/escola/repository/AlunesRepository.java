package com.minha.escola.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minha.escola.model.Alunes;

@Repository
public interface AlunesRepository extends JpaRepository<Alunes, Long>{
	
	
}
