package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Morten
 */
@Path("scores")
public class ScoresResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ScoresResource
     */
    public ScoresResource() {
    }

    /**
     * Retrieves representation of an instance of rest.ScoresResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "Helle World 2";
    }

    /**
     * PUT method for updating or creating an instance of ScoresResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
