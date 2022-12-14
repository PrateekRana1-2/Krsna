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
@Table(name = "driving_licence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DrivingLicenceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "active", columnDefinition = "BOOLEAN")
	private Boolean active = true;
	@Column(name = "front_photo")
	private String frontPhoto;
	@Column(name = "back_photo")
	private String backPhoto;
	@Column(name = "licence_no")
	private String licenceNumber;
	
	
//	"1) primary key
//	2) front photo
//	3) back photo
//	4) license number (unique)"
}
