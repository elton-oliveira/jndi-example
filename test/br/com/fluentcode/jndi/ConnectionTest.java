package br.com.fluentcode.jndi;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import javax.naming.Context;
import javax.naming.NamingException;

import org.junit.Test;

public class ConnectionTest {

	@Test
	public void shoudOpenConnectionWithTheServiceName() {
		Context context = null;
		try {
			context = Connection.open();
		} catch (NamingException e) {
			fail(e.getMessage());
		}

		assertNotNull(context);

	}

}
