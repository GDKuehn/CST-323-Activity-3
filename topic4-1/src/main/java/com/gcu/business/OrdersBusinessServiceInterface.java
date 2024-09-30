/**
 * 
 */
package com.gcu.business;
import java.util.List;
import com.gcu.model.*;


/**
 * @author Gavin Kuehn
 *
 */

public interface OrdersBusinessServiceInterface {

	public void init();
	public void destroy();
	public List<OrderModel> getOrders();
	
}
