package com.example.fragmanetevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {
    private TextView title;
    private TextView description;
    private TextView startDate;
    private TextView endDate;
    private TextView startTime;
    private TextView endTime;
    private TextView currency;
    private TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initViews();
        getDatafromIntent();
    }

    private void getDatafromIntent() {
        Model model = (Model) getIntent().getSerializableExtra("model");
        title.setText(model.getTitle());
        description.setText(model.getDescription());
        startDate.setText(model.getStartDate());
        endDate.setText(model.getEndDate());
        startTime.setText(model.getStartTime());
        endTime.setText(model.getEndTime());
        currency.setText(model.getCurrency());
        price.setText(model.getPrice());
    }

    private void initViews() {
        title = findViewById(R.id.tvTitle);
        description = findViewById(R.id.tvDescrition);
        startDate = findViewById(R.id.tvStartData);
        endDate = findViewById(R.id.tvEndDate);
        startTime = findViewById(R.id.tvStartTime);
        endTime = findViewById(R.id.tvEndTime);
        currency = findViewById(R.id.tvCurrency);
        price = findViewById(R.id.tvPrice);

    }
}