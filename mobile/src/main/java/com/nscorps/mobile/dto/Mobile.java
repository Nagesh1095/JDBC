package com.nscorps.mobile.dto;

import java.io.Serializable;

public class Mobile implements Serializable {

	private String mobile_name;
	private String model;
	private byte ram_size;
	private int storage_capacity;

	public String getMobile_name() {
		return mobile_name;
	}

	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public byte getRam_size() {
		return ram_size;
	}

	public void setRam_size(byte ram_size) {
		this.ram_size = ram_size;
	}

	public int getStorage_capacity() {
		return storage_capacity;
	}

	public void setStorage_capacity(int storage_capacity) {
		this.storage_capacity = storage_capacity;
	}

}
