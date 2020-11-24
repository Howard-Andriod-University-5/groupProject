package com.codepath.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register Parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6zBLmDbqgIMp3uf4m3CtOZ2VIQ9mp9ij73xCBh3W")
                .clientKey("dXaWJetaiONCWltBIdmz8K24kfiMMZ8B9RHwJRKW")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
