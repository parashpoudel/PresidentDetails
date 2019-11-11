package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    private int image_id;
    private String name;
    private String details;
    private CircleImageView image;
    private TextView tvName;
    private TextView presidentDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        image = findViewById(R.id.imgProfileDetails);
        tvName = findViewById(R.id.tvNameDetails);
        presidentDetails = findViewById(R.id.presidentDetails);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            name = bundle.getString("name");
            image_id = bundle.getInt("image_id");
            details= bundle.getString("details");

            tvName.setText(name);
            image.setImageResource(image_id);
            presidentDetails.setText(details);
        }
    }
}
