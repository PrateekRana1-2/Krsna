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
@Table(name = "vechical_document")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VechicleDocumentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "active", columnDefinition = "BOOLEAN")
	private Boolean active = true;

	@Column(name = "vehical_number")
	private String vehicleNumber;
	@Column(name = "rc_photo_front")
	private String rcPhotoFront;
	@Column(name = "rc_photo_back")
	private String rcPhotoBack;
	
	@Column(name = "insurance")
	private String insurance;
	@Column(name = "vechical_model_name")
	private String vehicleModelName;
	@Column(name = "licence_holder_name")
	private String licenceHolderName;
	@Column(name = "vehical_photo")
	private String vehiclePhoto;
	@Column(name = "min_price_per_km")
	private String minPricePerKm;
	@Column(name = "max_price_per_km")
	private String maxPericePerKm;
	@OneToOne
	@JoinColumn(name = "driver_id")
	private DriverInfoEntity driverId;

//	"1.id
//	2.Vehicle_number
//	3.RC & phots of front & back
//	4.Insurance
//	5.Driver_id
//	6.VehicalModel_Name
//	7.Licence Holder name
//	8.Vehicle Photo(needToSearch)
//	9.MinPricePerKm
//	10.MaxPricePerKm"
}
