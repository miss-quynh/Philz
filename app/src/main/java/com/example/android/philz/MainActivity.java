package com.example.android.philz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView facebookIcon;
    TextView twitterIcon;
    TextView instagramIcon;
    TextView linkedinIcon;
    TextView pinterestIcon;
    TextView googleplusIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface iconFont = FontManager.getTypeface(getApplicationContext(), FontManager.FONTAWESOME);

        facebookIcon = findViewById(R.id.facebook_icon);
        twitterIcon = findViewById(R.id.twitter_icon);
        instagramIcon = findViewById(R.id.instagram_icon);
        linkedinIcon = findViewById(R.id.linkedin_icon);
        pinterestIcon = findViewById(R.id.pinterest_icon);
        googleplusIcon = findViewById(R.id.googleplus_icon);

        facebookIcon.setTypeface(iconFont);
        twitterIcon.setTypeface(iconFont);
        instagramIcon.setTypeface(iconFont);
        linkedinIcon.setTypeface(iconFont);
        pinterestIcon.setTypeface(iconFont);
        googleplusIcon.setTypeface(iconFont);

    }
}
