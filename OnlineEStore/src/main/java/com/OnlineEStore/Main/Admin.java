package com.OnlineEStore.Main;

import com.OnlineEStore.Exceptions.IDNotFoundException;
import com.OnlineEStore.Models.Items;
import com.OnlineEStore.Service.ElectItemImpl;

public class Admin {
	public static void main(String[] args) throws IDNotFoundException {
		
		  //Items item = new Items(6, "Oppo", "Mobile", 10000, 20, 4, "black","3Gb,632Gb",100); 
		  ElectItemImpl service = new ElectItemImpl();
		  //service.addItem(item);
		 service.updateItem(1, 18999, "4Gb,64Gb");
		  //service.deletItem(6);
		 
	}

}
