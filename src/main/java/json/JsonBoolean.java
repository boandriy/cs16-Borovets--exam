package json;

/**
 * Created by Andrii_Rodionov on 1/4/2017.
 */
public class JsonBoolean extends Json {
	private boolean jbool;
	
    public JsonBoolean(Boolean bool) {
        jbool = bool;
    }

    @Override
    public String toJson() {
        if(jbool){
        	return "true";
        }else{
        	return "false";
        }
    }
}
