package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_CATEGORY_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WorkDetailFragment frag = (WorkDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);

        int categoryId = (int) getIntent().getExtras().get(EXTRA_CATEGORY_ID);
        frag.setCategory(categoryId);
    }

}
