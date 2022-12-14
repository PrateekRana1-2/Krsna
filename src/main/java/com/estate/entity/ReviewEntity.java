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
@Table(name = "review")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "active", columnDefinition = "BOOLEAN")
	private Boolean active = true;
	
	@OneToOne
	@JoinColumn(name = "ride_detail_id")
	private RideDetailsEntity rideDetailId;
	
	@Column(name = "rating")
	private String rating;
	
	
	@Column(name = "review")
	private String review;

//	"1.RideDetailsID
//	2.ID(PrimeryKey)
//	3.Review(string)
//	4.Rating"
}
