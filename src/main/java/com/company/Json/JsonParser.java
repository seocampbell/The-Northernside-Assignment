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
    private final ArrayList<String> assetList = new ArrayList<>();
    private String itSelector = "staff";
    private String ArrayValues;
    private String searchItem, foundItem;
    String Map;
    //StaffObject Mapping
    Object mapAdmin, mapID, mapDept, mapName;
    //AssetObject Mapping

        //json parser object to parse read the IT staff files - SC
        public void assetList() {
        JSONParser jsonParser = new JSONParser();
        try {
            //Parsing the contents of the JSON file - SC
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("src/IT_Assets.json"));
            //Retrieving the array and writing to a staff list - SC
            //The itSelector will define between the Staff list or the Asset list - SC
            JSONArray staffArray = (JSONArray) jsonObject.get(itSelector);
            for (int i = 0; i < staffArray.size(); i++) {
                //loop through the staffArray count to format a usable itList - SC
                ArrayValues = ("" + staffArray.get(i) + "");
                //Add the ArrayValues to ITList
                itList.add(ArrayValues);
                //System.out.println(ArrayValues);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //A search to find the matching name with then Json string
    public String itItem(String selectNumber) {
        assetList();

        for (int i = 0; i < this.itList.size(); i++) {
            searchItem = this.itList.get(i);
            if (this.searchItem.contains(selectNumber)) {
                foundItem = this.searchItem;
                //System.out.println(this.searchItem);
            }
        }return foundItem;
    }
    public void itElements() {
        Gson staffElem = new GsonBuilder().setPrettyPrinting().create();
        try {
            JsonElement json = staffElem.fromJson(foundItem, JsonElement.class);
            this.foundItem = staffElem.toJson(json);
            //System.out.println(jsonInString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void itMapping() {
        try {
            // JSON string
            Map = foundItem;
            // convert JSON string to Java Map
            Map<String, Object> map = new Gson().fromJson(Map, Map.class);

            // print map keys and values
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getKey().equals("server_admin")) {
                    this.mapAdmin = entry.getValue();
                }
                if (entry.getKey().equals("name")) {
                    this.mapName = entry.getValue();
                }
                if (entry.getKey().equals("id")) {
                    this.mapID = entry.getValue();
                } else if (entry.getKey().equals("department")) {
                    this.mapDept = entry.getValue();
                }
                //System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Server Administrator: " + this.mapAdmin);
            System.out.println("Name: " + this.mapName);
            System.out.println("Asset ID: " + this.mapID);
            System.out.println("Department: " + this.mapDept);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
