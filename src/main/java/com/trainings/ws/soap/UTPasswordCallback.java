
package com.trainings.ws.soap;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;



public class UTPasswordCallback implements CallbackHandler {

	private Map<String, String> passwords = new HashMap<String, String>();

	public UTPasswordCallback() {
		
		passwords.put("Bharath", "Bharath");
		passwords.put("cxf", "cxf");
	}

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

			String pass = passwords.get(pc.getIdentifier());
			System.out.println("pass:"+pass);
			if (pass != null) {
				System.out.println("pcpass:"+pc.getPassword());
				pc.setPassword(pass);
				return;
			}
		}
	}


}
