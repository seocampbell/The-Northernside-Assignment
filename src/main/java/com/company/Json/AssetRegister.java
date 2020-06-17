package com.company.Json;

import com.google.gson.Gson;

public class AssetRegister {
        private long id;
        private String name;

        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User [id=" + id + ", name=" + name + "]";
        }

public static void jasoncall () {
    String userJson = "[{'name': 'Alex','id': 1}, "
            + "{'name': 'Brian','id':2}, "
            + "{'name': 'Charles','id': 3}]";

    Gson gson = new Gson();

    AssetRegister[] assetRegisterArray = gson.fromJson(userJson, AssetRegister[].class);

    for (AssetRegister assetRegister : assetRegisterArray) {
        System.out.println(assetRegister);
    }


}
}
