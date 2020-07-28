package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.ScoreAlgoritmn;
import model.Scores;
import model.Total;
import utils.JSONBuilder;

/**
 * REST Web Service
 *
 * @author Morten Feldt
 */
@Path("scores")
public class ScoresResource {

    @Context
    private UriInfo context;
    
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    JSONBuilder jsonBuilder = new JSONBuilder();
    Scores scores = new Scores();
    Total total = new Total();
    ScoreAlgoritmn sa = new ScoreAlgoritmn();

    /**
     * Retrieves representation of an instance of rest.ScoresResource
     * @return an instance of java.lang.String
     */
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getTotals() {
//        System.out.println(scores.getScores());
//        return Response.ok().entity(gson.toJson(sa.scoreAlgoritmn(scores.getScores()))).build();
//        //return jsonBuilder.getResultOfScoreAsJSON(sa.scoreAlgoritmn(scores.getScores()));
//        
//    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postTotals(String content) {
        Scores newScores = gson.fromJson(content, Scores.class);
        scores.setScores(newScores.getScores());
        return Response.ok().entity(gson.toJson(sa.scoreAlgoritmn(scores.getScores()))).build();
        //return Response.ok().entity(gson.toJson(newScores)).build();
        //return Response.ok().entity(gson.toJson(newScores)).build();
    }
}
