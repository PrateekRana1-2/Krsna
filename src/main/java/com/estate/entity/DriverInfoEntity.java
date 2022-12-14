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
@Table(name = "driver_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverInfoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "active", columnDefinition = "BOOLEAN")
	private Boolean active = true;
	
	@Column(name = "driver_name")
	private String driverName;
	
	@Column(name = "phone_no")
	private String phoneNumber;
	
	
	@Column(name = "profil_pic")
	private String profilePic;
	
	@Column(name = "subscription_model")
	private String subscriptionModel ="free";
	
	@Column(name = "rating")
	private String rating ;
	
	@Column(name = "total_drive")
	private String totalDrive ="0";
	
	@Column(name = "wallet_amount")
	private String walletAmount;
	
	@Column(name = "date")
	private String updateDate;
	
	@Column(name = "total_complet_rides")
	private String totalCompleteRides ="0";
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "dob")
	private String dateOfBirth;
	
	@Column(name = "driving_licence")
	private String drivingLicense ;
	
	@Column(name = "device_info")
	private String deviceInfo;
	
	@Column(name = "total_cancelled_rides")
	private String totalCancelledRides ="0";
	
	
	
	
	
	
	
	
	
//	"1. Id Primery Key
//	2.Driver Name
//	3.Phone No.
//	4.Profile Pic (for later)
//	5.Suscribtion model (free)
//	6.Ratings (0)
//	7.TotalDrives (0)
//	8.Wallet Amount (0)
//	9) updated date
//	10) total_complete_rides(0)
//	11) country
//	12) dob
//	13) driving license number
//	14) device id
//	15) total_cancelled_rides(0)"

}
