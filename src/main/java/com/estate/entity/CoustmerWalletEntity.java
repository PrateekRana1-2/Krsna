package com.estate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "coustmer_wallet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoustmerWalletEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;
	@OneToOne
	@JoinColumn(name = "coustmer_id")
	private CoustmerEntity coustmerId;
	@Column(name = "amount")
	private String amount;
	@Column(name = "date_time")
	private String dateTime;
	@Column(name = "trnx")
	private String transaction;
	
	
//	"1.customer_id
//	2.amount
//	3.Date&Time
//	4.WDR_Add"
}
