package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facade.ScoreFacade;
import model.Scores;

/**
 * REST Web Service
 * @author Morten Feldt
 */
@Path("scores")
public class ScoresResource {    
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private final ScoreFacade sf = new ScoreFacade();
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postTotals(String content) {
        Scores scores = gson.fromJson(content, Scores.class);
        return Response.ok().entity(gson.toJson(sf.getTotals(scores.getScores()))).build();
    }
}
