/**
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * This file is licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License. A copy of
 * the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.example.basicapp;


public class App {

    public static void main(String[] args) throws Exception {
        DatabaseAccess dbAccess = new DatabaseAccess();

        dbAccess.createTable("Movies");

        //dbAccess.loadDataFromJSONFile("Movies","moviedata.json");

        dbAccess.addNewItem("Movies",2015,"The Big New Movie","Nothing happens at all.",0);

        dbAccess.readItem("Movies",2015,"The Big New Movie");

        //String[] actors = {"Larry", "Moe", "Curly"};
        //dbAccess.updateItem("Movies",2015,"The Big New Movie",5.5,"Everything happens all at once.", actors);

        //dbAccess.conditionallyUpdateItem("Movies",2015,"The Big New Movie");

        //dbAccess.deleteItem("Movies",2015,"The Big New Movie");

        //dbAccess.itemsQuery("Movies",1985,"A","L");

        //dbAccess.scanTable("Movies",1950,1959);

        //dbAccess.deleteTable("Movies");
    }


}

