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
@Table(name = "status_driver")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverStatusEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "active", columnDefinition = "BOOLEAN")
	private Boolean active = true;
	
	@OneToOne
	@JoinColumn(name = "driver_id")
	private DriverInfoEntity driverId;

	@Column(name = "current_location")
	private String currentLocation;
	
	
	@Column(name = "available_for_booking")
	private String availableForBooking;
	
	@Column(name = "one_way_to_way")
	private String oneWayTwoWay;
	
	@Column(name = "from_to")
	private String fromTo;
	
	@Column(name = "permanent_location")
	private String permanentLocation;
	
	
//	"1) driver id
//	2.CurrentLocation(if possible)
//	3.AvailableForBooking
//	4. One way/two ways
//	5. One way (from-to)
//	6. permanent location"
}
