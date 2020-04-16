package com.genZmartInternalProject.repository;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.genZmartInternalProject.modelClasses.OrderModelClass;

@Repository
public interface ProfitRepository extends JpaRepository<OrderModelClass, Long>{
	
	 @Query(value = "SELECT item_class.item_name, sum((orders.cogs-(orders.price-(orders.price*orders.discount_price/100)))) as profits \r\n" + 
	 		"FROM orders INNER JOIN item_class ON orders.item_id=item_class.item_id\r\n" + 
	 		"where (orders.cogs-(orders.price-(orders.price*orders.discount_price/100)))>0\r\n" + 
	 		"group by item_class.item_id \r\n" + 
	 		"order by item_class.item_id; ", nativeQuery = true)
       public List<JSONObject> itemsProfits();

	 
	 
   @Query(value="select geography_class.city,sum((orders.cogs-(orders.price-(orders.price*orders.discount_price/100)))) as profit \r\n" + 
   		"from orders  INNER JOIN geography_class ON orders.city_id=geography_class.city_id\r\n" + 
   		"where (orders.cogs-(orders.price-(orders.price*orders.discount_price/100)))>0\r\n" + 
   		"group by geography_class.city\r\n" + 
   		"order by profit desc;",nativeQuery = true)
   public List<JSONObject> citiesProfits(); 
}
