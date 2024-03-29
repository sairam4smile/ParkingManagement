package com.parking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Setter @Getter @ToString @AllArgsConstructor @NoArgsConstructor
public class ParkingSpots {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long parkingId;
	private Long parkingName;

	@OneToOne @JoinColumn(name = "employeeId")
	EmployeeDetails employeeDetails;
}
