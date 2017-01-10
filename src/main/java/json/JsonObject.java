package json;

import java.util.ArrayList;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
	private JsonPair jArr[] = new JsonPair[2];
    public JsonObject(JsonPair... jsonPairs) {
    	int i = 0;
    	for(JsonPair jpair : jsonPairs){
    		if(jpair != null){
    			jArr[i] = jpair;
    			i++;
    		}
    	}
    }

    @Override
    public String toJson() {
    	String jpairsStr = "";
        for(JsonPair jpair : jArr){
        	if(jpair != null){
        		jpairsStr += jpair;
        	}
        }
    	String jsonString = "{" + jpairsStr + "}"; 
        return jsonString;
    }

    public void add(JsonPair jsonPair) {
    	int i = 0;
        for(JsonPair jpair : jArr){
        	if(jpair != null){
        		jArr[i] = jsonPair;
        	}else{
        		i++;
        	}
        }
    }

    public Json find(String name) {
        for(JsonPair jpair : jArr){
        	
        }
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}
