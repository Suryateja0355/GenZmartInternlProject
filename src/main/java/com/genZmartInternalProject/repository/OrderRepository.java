package com.genZmartInternalProject.repository;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.genZmartInternalProject.modelClasses.OrderModelClass;


@Repository
public interface OrderRepository extends JpaRepository<OrderModelClass, Long> {
	
	
	 @Query(value = "SELECT item_class.item_name,count(orders.order_no),sum(orders.qty)\r\n" + 
	 		        "FROM orders INNER JOIN item_class ON orders.item_id=item_class.item_id \r\n" + 
	 		        "group by item_class.item_name order by count(orders.order_no) asc; ", nativeQuery = true)
	     public List<JSONObject> ItemsWithLessOrders();

	 @Query(value = "SELECT item_class.item_name,count(orders.order_no),sum(orders.qty)\r\n" + 
		        "FROM orders INNER JOIN item_class ON orders.item_id=item_class.item_id \r\n" + 
		        "group by item_class.item_name order by count(orders.order_no) desc; ", nativeQuery = true)
  public List<JSONObject> ItemsWithMoreOrders();
	 
}
