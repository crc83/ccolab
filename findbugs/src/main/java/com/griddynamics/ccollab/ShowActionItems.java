package com.griddynamics.ccollab;

import com.smartbear.ccollab.service.api.v7001.ActionItem;
import com.smartbear.ccollab.service.api.v7001.CodeCollaborator;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.List;

/**
 * Sample of getting Action Items from the server in Java with CXF:
 * Follows http://cxf.apache.org/docs/a-simple-jax-ws-service.html
 */
public class ShowActionItems {

    public static void main(String[] args) throws Exception {

        // So, let's authenticate:
        String username = args[0];
        String password = args[1];

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
        // Here, we just call getLoginTicket() every time ShowActionItems is run.
        String ticket = client.getLoginTicket(username, password);
        if (ticket == null) {
            System.out.println("Username/password incorrect.");
            return;
        }
        // Methods that require authentication expect to find username/ticket in HTTP basic auth.
        // We'll create a new client that sends those with each request:
        clientFactory.setUsername(username);
        clientFactory.setPassword(ticket); // (Yep, ticket!  Not password.)
        client = (CodeCollaborator) clientFactory.create();

        final List<ActionItem> actionItems = client.getActionItems();
        final ActionItem actionItem = actionItems.get(0);
        final int latestVersion = client.findLatestVersion(654, "");
    }
}
 