package com.bankapp.model.persitance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="transaction_table")

public class TransactionEntity {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String from;
	private String to;
	private Double debit;
	private Double credit;
	@ManyToOne()
	Account account;
}
