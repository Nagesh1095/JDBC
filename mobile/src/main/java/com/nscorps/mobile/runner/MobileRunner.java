package com.nscorps.mobile.runner;

import java.util.ArrayList;
import java.util.List;

import com.nscorps.mobile.dao.MobileDAO;
import com.nscorps.mobile.dto.Mobile;

public class MobileRunner {
	
	public static void main(String[] args) {
		

		Mobile mobile = new Mobile();
		mobile.setMobile_name("POCO");
		mobile.setModel("G T 2 Pro");
		mobile.setRam_size((byte)16);
		mobile.setStorage_capacity(1000);
		
		Mobile mobile2 = new Mobile();
		mobile2.setMobile_name("Redme");
		mobile2.setModel("Redme 11 Prime");
		mobile2.setRam_size((byte)8);
		mobile2.setStorage_capacity(128);
		

		Mobile mobile3 = new Mobile();
		mobile3.setMobile_name("MI");
		mobile3.setModel("MI 12 Ultra");
		mobile3.setRam_size((byte)16);
		mobile3.setStorage_capacity(512);

		List<Mobile> list = new ArrayList<Mobile>();
		list.add(mobile);
		list.add(mobile2);
		list.add(mobile3);
		
		MobileDAO dao = new MobileDAO();
		
	//	dao.saveMobileDetails();
//		dao.updateSorageByRamsize();
//		dao.updateStorageByMobilename();
//		dao.deleteByMobileName();
//		dao.getMobileNameByRamandModel();
//		dao.saveMobileDetails();
		dao.saveMobileDetails(list);
	}
}
