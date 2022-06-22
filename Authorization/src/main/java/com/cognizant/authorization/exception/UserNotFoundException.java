package com.cognizant.authorization.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.authorization.AuthorizationServiceApplication;

import lombok.NoArgsConstructor;

/**
 * A User defined exception to throw an exception when an user is not found in
 * the database.
 */

@NoArgsConstructor
public class UserNotFoundException extends RuntimeException {
	
	private static final Logger log = LoggerFactory.getLogger(AuthorizationServiceApplication.class);

	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
		super(message);
		log.info("START");
		log.debug("message{}:", message);
		log.info("END");
	}

}
