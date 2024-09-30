/**
 * 
 */
package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.gcu.business.*;


/**
 * @author Gavin Kuehn
 *
 */
@Configuration
public class SpringConfig {

	public SpringConfig() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean(name="OrdersBusinessService", initMethod="init", destroyMethod="destroy")
	//@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		
		return new OrdersBusinessService();
	}

}
