package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Dy1v2RdzWiqKLxZs4GpFtJ7hRHldm5Uaw2Git7z0")
                .clientKey("4foHc4YpsHbRDpXybQdI0BYgvrLWz5u0NBpa2oOL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
