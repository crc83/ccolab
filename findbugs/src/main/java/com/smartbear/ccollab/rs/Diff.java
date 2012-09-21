package com.smartbear.ccollab.rs;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * @author mamontov
 */
@Path("/diff")
public interface Diff {

    @GET
    String getDiff(@CookieParam(value = "CodeCollaboratorLogin") String login,
                   @CookieParam(value = "CodeCollaboratorTicketId") String ticket,
                   @QueryParam("reviewid") int id);
}
