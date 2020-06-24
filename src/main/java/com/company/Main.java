package com.company;

import com.company.Json.AssetRegister;
import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Loading items....");
        deserializeAssetRegister();
    }

    private static void deserializeAssetRegister(){
        Gson gson = new Gson();
        gson.fromJson(, AssetRegister.class);

    }
    }

