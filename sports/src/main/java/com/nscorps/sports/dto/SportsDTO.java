package com.nscorps.sports.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports_details")
public class SportsDTO {
	@Id
	private int id;
	@Column(name="sports_type")
	private String type;
	@Column(name="sports_name")
	private String name;
	@Column(name="no_of_players")
	private int noOfPlayers;
	@Column(name="country_of_origin")
	private String countryOfOrigin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

}
