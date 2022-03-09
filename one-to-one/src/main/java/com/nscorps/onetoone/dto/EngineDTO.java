package com.nscorps.onetoone.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "engine")
public class EngineDTO {
	@Id
	@Column(name = "engine_id")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int engineID;
	@Column(name = "no_of_strokes")
	private int noOfStrokes;
	@Column(name = "no_of_cylinders")
	private int noOfCylinders;
	private double capacity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "v_id")
	private VehicleDTO vehicle;

	public int getEngineID() {
		return engineID;
	}

	public void setEngineID(int engineID) {
		this.engineID = engineID;
	}

	public int getNoOfStrokes() {
		return noOfStrokes;
	}

	public void setNoOfStrokes(int noOfStrokes) {
		this.noOfStrokes = noOfStrokes;
	}

	public int getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(int noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public VehicleDTO getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleDTO vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "EngineDTO [engineID=" + engineID + ", noOfStrokes=" + noOfStrokes + ", noOfCylinders=" + noOfCylinders
				+ ", capacity=" + capacity + ", vehicle=" + vehicle + "]";
	}

}
