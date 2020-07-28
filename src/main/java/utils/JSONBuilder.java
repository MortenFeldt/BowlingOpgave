package utils;

import org.json.simple.JSONObject; 

/**
 * The purpose of JSONBuilder: Building JSON files for REST service
 * @author Morten
 * @version 1.0
 * @since 28-07-2020
 */

public class JSONBuilder {
    
    public String getResultOfScoreAsJSON(int[] totalScores){
        
        JSONObject json = new JSONObject();
        
        json.put("total", totalScores);
        
        return json.toJSONString();
    }

}
