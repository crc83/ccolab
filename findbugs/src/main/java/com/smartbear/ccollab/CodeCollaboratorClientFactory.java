package com.smartbear.ccollab;

import com.smartbear.ccollab.service.api.v7001.CodeCollaborator;
import com.smartbear.ccollab.service.api.v7001.ServerNotInitializedException_Exception;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Sample of getting Action Items from the server in Java with CXF:
 * Follows http://cxf.apache.org/docs/a-simple-jax-ws-service.html
 */
public class CodeCollaboratorClientFactory {

    public static CodeCollaborator create(String username, String password) {
        // So, let's authenticate:
        username = "yc14im2";
        password = "xenu4btpp3";

        // Request an implementation of the interface CodeCollaborator from CXF:
        JaxWsProxyFactoryBean clientFactory = new JaxWsProxyFactoryBean();
        clientFactory.setServiceClass(CodeCollaborator.class);
        // Point to your server, obviously. :)
        clientFactory.setAddress("http://11.120.102.48/services/CodeCollaborator_7001");
        CodeCollaborator client = (CodeCollaborator) clientFactory.create();
        // Code Collaborator uses ticket-based authentication so that you don't have
        // to send username/pass w/ every request.
        // More savvy clients should SAVE the login ticket (not the password)
        // and re-use it across invocations .
        // Here, we just call getLoginTicket() every time CodeCollaboratorClientFactory is run.
        String ticket = null;
        try {
            ticket = client.getLoginTicket(username, password);
        } catch (ServerNotInitializedException_Exception e) {
            throw new RuntimeException(e);
        }
        if (ticket == null) {
            throw new IllegalArgumentException("Username/password incorrect.");
        }
        // Methods that require authentication expect to find username/ticket in HTTP basic auth.
        // We'll create a new client that sends those with each request:
        clientFactory.setUsername(username);
        clientFactory.setPassword(ticket); // (Yep, ticket!  Not password.)
        return (CodeCollaborator) clientFactory.create();
    }

}
 