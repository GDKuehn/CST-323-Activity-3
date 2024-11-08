package com.gcu.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService {

	Logger logger = LogManager.getLogger(SecurityBusinessService.class);


	public SecurityBusinessService() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean authenticate(String username, String password) {
		logger.info("Message coming from the SecurityBusinessService");
		return true;
	}

}
