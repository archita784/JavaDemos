package com.OnlineEStore.Dao;


import java.util.List;

import com.OnlineEStore.Exceptions.BrandNotFoundException;
import com.OnlineEStore.Exceptions.CategoryNotFoundException;
import com.OnlineEStore.Exceptions.ColorNotFoundException;
import com.OnlineEStore.Exceptions.DiscountNotFoundException;
import com.OnlineEStore.Exceptions.IDNotFoundException;
import com.OnlineEStore.Exceptions.QuantityNotFoundException;
import com.OnlineEStore.Exceptions.SpeciNotFoundException;
import com.OnlineEStore.Exceptions.WishListNotFound;
import com.OnlineEStore.Models.Items;
public interface ElecItemDao {
	


		void addOneItem(Items item) ;
		int updateOneItem(int itemId,double price,String memorySpecfication) throws IDNotFoundException;
		int deleteOneItem(int itemId)throws IDNotFoundException;
		List<Items> findAllItems();
		Items findItemById(int itemId) ;	
		List<Items> findItemsByCategory(String category);
		List<Items> findItemsByColor(String category);
		List<Items> findItemsByBrand(String category);
		List<Items> findItemsByMemorySpeci(String category);
		List<Items> findItemsByQuantity(Integer quantity);
		List<Items> findItemsByDiscount(Integer discount);
		List<Items> findItemsByWish(String color,String brand ,String memoryspecification,int discount ,double price);
		
		
	


}
