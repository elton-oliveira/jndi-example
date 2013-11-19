package br.com.fluentcode.jndi;

import java.awt.HeadlessException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JOptionPane;

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
	
	public static void main(String[] args) {
		try {
			JOptionPane.showMessageDialog(null, open());
		} catch (HeadlessException | NamingException e) {
			JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
		}
	}

}
