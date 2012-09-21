package com.smartbear.ccollab.rs;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * @author mamontov
 */
@Path("/data/server")
public interface Files {

    @GET
    byte[] downloadFiles(@CookieParam(value = "CodeCollaboratorLogin") String login,
                         @CookieParam(value = "CodeCollaboratorTicketId") String ticket,
                         @QueryParam("reviewid") int id,
                         @QueryParam("changelist") String changelist);
}
