package com.bankapp.model.persitance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDao extends JpaRepository<TransactionEntity,Integer>{

}
