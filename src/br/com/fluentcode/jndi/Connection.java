package br.com.fluentcode.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Connection {
	
	/**
	 * Open the connection with the service name and  return the initial context
	 * 
	 * @return The Initial Context
	 * @throws NamingException
	 */
	public static Context open() throws NamingException{
		return new InitialContext();
	}

}
