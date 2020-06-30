package com.company.Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import javax.lang.model.util.Types;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;

public class JsonParserTest {
    private final ArrayList<String> itList = new ArrayList<>();
    private String arrayValues;
    private String searchItem, foundItem;
    private String Map;
    private Object mapAdmin, mapID, mapDept, mapName;

    @Test
    public void assetListStaff() {
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("src/test/java/com/company/Json/test1.json"));
            JSONArray staffArray = (JSONArray) jsonObject.get("staff");
            for (int i = 0; i < staffArray.size(); i++) {
                arrayValues = ("" + staffArray.get(i) + "");
                itList.add(arrayValues);
                System.out.println(arrayValues);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (ParseException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    @Test
    public void assetList() {
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("src/test/java/com/company/Json/test1.json"));
            JSONArray staffArray = (JSONArray) jsonObject.get("assets");
            for (int i = 0; i < staffArray.size(); i++) {
                arrayValues = ("" + staffArray.get(i) + "");
                itList.add(arrayValues);
                System.out.println(arrayValues);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (ParseException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}