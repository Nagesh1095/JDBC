package com.nscorps.onetoone.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "vehicle")
public class VehicleDTO {

	@Id
	@Column(name = "vehicle_id")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int vehicleID;
	private String company;
	private String model;
	private int price;
	
	@OneToOne(mappedBy = "vehicle" , cascade = CascadeType.ALL)
	private EngineDTO engine;

	public EngineDTO getEngine() {
		return engine;
	}

	public void setEngine(EngineDTO engine) {
		this.engine = engine;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "VehicleDTO [vehiclID=" + vehicleID + ", company=" + company + ", model=" + model + ", price=" + price
				+ "]";
	}

}
