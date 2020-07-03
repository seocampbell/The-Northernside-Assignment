package com.company.Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

//The JsonParson class will read in the Json file from the locally stored json file IT_Assets,
// looping the list and mapping into object on the search criteria provided in the itItem string
public class JsonParser {
    private final ArrayList<String> itList = new ArrayList<>();
    private String arrayValues;
    private String searchItem, foundItem;
    private String Map;
    private Object mapAdmin, mapID, mapDept, mapName;

    //json parser object to parse read the IT staff files - sc
        public void assetList(String departmentSelector, String fileName) {
        JSONParser jsonParser = new JSONParser();
        try {
            //Parsing the contents of the JSON file - sc
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(fileName));
            //The itSelector will define between the Staff list or the Asset list - sc
            JSONArray staffArray = (JSONArray) jsonObject.get(departmentSelector);
            for (int i = 0; i < staffArray.size(); i++) {
                //loop through the staffArray count to format a usable itList - sc
                arrayValues = ("" + staffArray.get(i) + "");
                //Add the ArrayValues to ITList - sc
                itList.add(arrayValues);
                //System.out.println(ArrayValues);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (ParseException e) {
            e.printStackTrace();
            //stop the application on error
            System.exit(0);
        }
    }

    //A search to find the matching name with then Json string - sc
    public String itItem(String selectNumber) {
        for (int i = 0; i < this.itList.size(); i++) {
            searchItem = this.itList.get(i);
            if (this.searchItem.contains(selectNumber)) {
                foundItem = this.searchItem;
            }
        }return foundItem;
    }
    //The foundItem record is then passed to the itElements - sc
    public void itElements() {
        Gson staffElem = new GsonBuilder().setPrettyPrinting().create();
        try {
            JsonElement json = staffElem.fromJson(foundItem, JsonElement.class);
            this.foundItem = staffElem.toJson(json);
            //System.out.println(jsonInString);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
    //
    //the findItem is mapped out into objects
    public void itMapping() {
        try {
            // JSON string
            Map = foundItem;
            // convert JSON string to Java Map
            Map<String, Object> map = new Gson().fromJson(Map, Map.class);

            // print map keys and values as a complete set but this can
            // be mapped out to individual entities, no benefit at this stage. - sc
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                //Comment left in to show how to map to individual ket sets.
                //if (entry.getKey().equals("server_admin")) {
                //this.mapAdmin = entry.getValue();}
            }

        } catch (Exception ex) {
            System.out.println("Asset Number is unavailable, please check the number and try again. ");
            //cLose the application on failed selection - sc
            System.exit(0);
            ex.printStackTrace();
              }
    }
}
