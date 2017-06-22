# WS-User-Name-Token-Profile-Authentication

https://www.udemy.com/java-web-services/learn/v4/t/lecture/5465604?start=0

WS-security
http://cxf.apache.org/docs/ws-security.html
jaxws:inInterceptors
org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor


UTPasswordCallback.java
https://docs.oracle.com/javase/7/docs/api/javax/security/auth/callback/CallbackHandler.html
in constructor, the set of userid and password can be from database, so we use map instead

in handle(), there is a array of callback
then cxf validate/check the userid and password, if valid then send to the endpoint,else send error
