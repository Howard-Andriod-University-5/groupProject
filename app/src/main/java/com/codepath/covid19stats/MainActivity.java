package com.codepath.covid19stats;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.codepath.asynchttpclient.AsyncHttpClient;
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler;
import com.codepath.covid19stats.DataAdapter;
import com.codepath.covid19stats.Region;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Headers;

public class MainActivity extends AppCompatActivity {

    public static final String US_DATA = "https://api.covidtracking.com/v1/us/current.json";
    public static final String TAG = "MainActivity";

    List<Region> regions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvStats = findViewById(R.id.rvStats);
        regions = new ArrayList<>();

        // Create Adapter
        final DataAdapter dataAdapter = new DataAdapter(this, regions);

        // Set Adapter on recycler view
        rvStats.setAdapter(dataAdapter);

        // Set Layout manager on recycler view
        rvStats.setLayoutManager(new LinearLayoutManager(this));

        AsyncHttpClient client = new AsyncHttpClient();
        client.get(US_DATA, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Headers headers, JSON json) {
                JSONObject jsonObject = json.jsonObject;
                Log.d(TAG, "onSuccess");
                try {
                    JSONArray results = jsonObject.getJSONArray("");
                    Log.i(TAG, "Results: " + results.toString());
                    regions.addAll(Region.fromJsonArray(results));
                    dataAdapter.notifyDataSetChanged();
                    Log.i(TAG, "Regions " + regions.size());
                } catch (JSONException e) {
                    Log.e(TAG, "Hit JSON exception", e);
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Headers headers, String response, Throwable throwable) {
                Log.d(TAG, "onFailure");
            }
        });
    }

}
