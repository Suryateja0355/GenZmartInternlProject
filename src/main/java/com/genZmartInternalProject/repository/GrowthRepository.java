package com.genZmartInternalProject.repository;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.genZmartInternalProject.modelClasses.OrderModelClass;

@Repository
public interface GrowthRepository extends JpaRepository<OrderModelClass, Long>{
	
	@Query(value="select date_class.month_year,count(orders.order_no)\r\n" + 
			"from orders inner join date_class on orders.sales_date=date_class.ddate\r\n" + 
			"group by date_class.month_year\r\n" + 
			"order by date_class.month_year;", nativeQuery=true)
	 public List<JSONObject> growthInMonths();
	

}
