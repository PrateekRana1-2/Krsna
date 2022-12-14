package com.estate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Coustmer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoustmerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "active", columnDefinition = "BOOLEAN")
	private Boolean active = true;
	@Column(name = "coustmer_name")
	private String name;

	
	@Column(name = "wallet")
	private String wallet;

	@Column(name = "phone_no")
	private String phoneNo;

	@Column(name = "wallet_history")
	private String walletHistory;

	@Column(name = "isLogin")
	private String isLogin;

	@Column(name = "verified", nullable = false, updatable = true, columnDefinition = "BOOLEAN")
	private boolean verified;
	@Column(name = "reference_token", nullable = false, updatable = true)
	private String referenceToken;
	@Column(name = "login_source", nullable = true, updatable = true)
	private String loginSource;
	@Column(name = "password", columnDefinition = "TEXT", nullable = true, updatable = true)
	private String password;
}