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
@Table(name = "rides_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RideDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "active", columnDefinition = "BOOLEAN")
	private Boolean active = true;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "price")
	private String price;
	
	
	@Column(name = "redeemed")
	private String redeemed;
	
	@OneToOne
	@JoinColumn(name = "coustmer_id")
	private CoustmerEntity coustmerId;
	
	@OneToOne
	@JoinColumn(name = "driver_id")
	private DriverInfoEntity driverId;

	
	
	
	
	
	
	
	
	
//	"1 .DriverID
//	2. CoustmerId
//	3. status
//	4. startdate/time
//	5. price
//	6. review (another table)
//	7. redeemed(0)"
}
