package com.example.lindapokorny.exercisedatamanipulation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LINDA";
    private String colorKey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // here we made a json string, and added our json to it
        try{
            String JSONString =
                    " \"colors\": [\n" +
                    "   {\n" +
                    "     \"color\": \"black\",\n" +
                    "     \"category\": \"hue\",\n" +
                    "     \"type\": \"primary\",\n" +
                    "     \"code\": {\n" +
                    "       \"rgba\": [255,255,255,1],\n" +
                    "       \"hex\": \"#000\"\n" +
                    "     }\n" +
                    "   },\n" +
                    "   {\n" +
                    "     \"color\": \"white\",\n" +
                    "     \"category\": \"value\",\n" +
                    "     \"code\": {\n" +
                    "       \"rgba\": [0,0,0,1],\n" +
                    "       \"hex\": \"#FFF\"\n" +
                    "     }\n" +
                    "   },\n" +
                    "   {\n" +
                    "     \"color\": \"red\",\n" +
                    "     \"category\": \"hue\",\n" +
                    "     \"type\": \"primary\",\n" +
                    "     \"code\": {\n" +
                    "       \"rgba\": [255,0,0,1],\n" +
                    "       \"hex\": \"#FF0\"\n" +
                    "     }\n" +
                    "   },\n" +
                    "   {\n" +
                    "     \"color\": \"blue\",\n" +
                    "     \"category\": \"hue\",\n" +
                    "     \"type\": \"primary\",\n" +
                    "     \"code\": {\n" +
                    "       \"rgba\": [0,0,255,1],\n" +
                    "       \"hex\": \"#00F\"\n" +
                    "     }\n" +
                    "   },\n" +
                    "   {\n" +
                    "     \"color\": \"yellow\",\n" +
                    "     \"category\": \"hue\",\n" +
                    "     \"type\": \"primary\",\n" +
                    "     \"code\": {\n" +
                    "       \"rgba\": [255,255,0,1],\n" +
                    "       \"hex\": \"#FF0\"\n" +
                    "     }\n" +
                    "   },\n" +
                    "   {\n" +
                    "     \"color\": \"green\",\n" +
                    "     \"category\": \"hue\",\n" +
                    "     \"type\": \"secondary\",\n" +
                    "     \"code\": {\n" +
                    "       \"rgba\": [0,255,0,1],\n" +
                    "       \"hex\": \"#0F0\"\n" +
                    "     }\n" +
                    "   }\n" +
                    " ]\n" +
                    "}";
            JSONObject object = new JSONObject(JSONString);
            //here we made a json object and passed our json string into it
            JSONArray array = object.getJSONArray("color");

            List<Color> colorList = new ArrayList<>();

            for (int i = 0; i < array.length() ; i++) {
                colorKey = array.getJSONObject(i).get("color").toString();
                Color firstColor = new Color();
                firstColor.setColor((String) array.getJSONObject(i).get("color"));
                firstColor.setCategory((String) array.getJSONObject(i).get("category"));
                firstColor.setType((String) array.getJSONObject(i).get("type"));

                colorList.add(firstColor);

            }
            JSONObject object2 = array.getJSONObject(array.length());

            System.out.println(object2);

        }  catch (JSONException e) {
            e.printStackTrace();
        }

        Log.d(TAG, "TO CHECK: " + colorKey );


    }
}
