package domain;

import json.*;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class Student extends BasicStudent {
	private String name;
	private String surname;
	private Integer year;
	private Tuple tArr[];
    public Student(String name, String surname, Integer year, Tuple<String, Integer>... exams) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        int i = 0;
        for(Tuple tup: exams){
        	i++;
        }
        tArr = new Tuple[i];
        i = 0;
        for(Tuple tup: exams){
        	tArr[i] = tup;
        	i++;
        }
        
    }

    @Override
    public JsonObject toJsonObject() {
    	JsonObject jsonObject = new JsonObject(
    			new JsonPair("name", new JsonString(name)),
    			new JsonPair("surname", new JsonString(surname)),
    			new JsonPair("year", new JsonNumber(year)),
    			new JsonPair("exams",new JsonArray(new JsonObject()))
    			);
        return jsonObject;
    }
}