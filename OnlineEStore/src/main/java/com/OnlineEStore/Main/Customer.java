package com.OnlineEStore.Main;

import com.OnlineEStore.Exceptions.BrandNotFoundException;
import com.OnlineEStore.Exceptions.CategoryNotFoundException;
import com.OnlineEStore.Exceptions.ColorNotFoundException;
import com.OnlineEStore.Exceptions.DiscountNotFoundException;
import com.OnlineEStore.Exceptions.IDNotFoundException;
import com.OnlineEStore.Exceptions.QuantityNotFoundException;
import com.OnlineEStore.Exceptions.SpeciNotFoundException;
import com.OnlineEStore.Exceptions.WishListNotFound;
import com.OnlineEStore.Models.Items;
import com.OnlineEStore.Service.ElecItems;
import com.OnlineEStore.Service.ElectItemImpl;

public class Customer {
	public static void main(String[] args) {
		ElecItems service= new ElectItemImpl();
		service.getAllItems().forEach(System.out::println);
		try {
			Items item=service.getItemById(3);
			System.out.println(item);
		} catch (IDNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			service.getItemsByColor("blue").forEach(System.out::println);
		} catch (ColorNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			service.getItemsByBrand("Oppo").forEach(System.out::println);
		} catch (BrandNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			service.getItemsByMemorySpeci("4Gb,64Gb").forEach(System.out::println);
		} catch (SpeciNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			service.getItemsByQuantity(35).forEach(System.out::println);
		} catch (QuantityNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			service.getItemsByDiscount(0).forEach(System.out::println);
		} catch (DiscountNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			service.getItemsByCategory("mobile").forEach(System.out::println);
		} catch (CategoryNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			service.getItemsByWish("blue","Vivo","4Gb,64Gb",500,18999).forEach(System.out::println);
		} catch (WishListNotFound e) {
			System.out.println(e.getMessage());
		}
	}

}
