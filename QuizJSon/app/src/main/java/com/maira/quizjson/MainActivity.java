package com.maira.quizjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JSONObject obj;
        Gson gson = new Gson(); // Or use new GsonBuilder().create();

        try {
            obj = new JSONObject(readJSONFromAsset());
            Log.i("Maira", obj.toString());

            JSONArray results = obj.getJSONArray("questions");
            Log.i("Maira", "results=" + results.length());

            for (int i = 0; i < results.length(); i++) {
                JSONObject obj2 = results.getJSONObject(i);
                Question q2 = gson.fromJson(obj2.toString(), Question.class); // deserializes json into target2
                Log.i("Maira", q2.toString());
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


        Log.i("Maira", "finished");
    }


    public String readJSONFromAsset() {
            String json = null;
            try {
                InputStream is = getAssets().open("questions.json");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                json = new String(buffer, "UTF-8");
            } catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            return json;
        }
    }

