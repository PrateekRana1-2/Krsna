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
@Table(name = "notification_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "date_and_time")
	private String DateTime;
	
	@Column(name = "message")
	private String message;
	
	@OneToOne
	@JoinColumn(name ="driver_id" )
	private DriverInfoEntity driverId;
	
	
	@OneToOne
	@JoinColumn(name = "coustmer_id")
	private CoustmerEntity coustmerId;
	
	
//	"1.Date&Time
//	2.message
//	3. driver id/customer id"
	
//	private Long DateTime;
//	private String message;
//	private DriverInfoEntity driverId;
//	private CoustmerEntity coustmerId;
}
