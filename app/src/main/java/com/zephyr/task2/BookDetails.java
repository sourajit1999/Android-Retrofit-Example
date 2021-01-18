package com.zephyr.task2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zephyr.task2.R;
import java.util.Objects;

public class BookDetails extends AppCompatActivity {

    TextView name;
    TextView author;
    TextView category;
    TextView date;
    TextView pages;

    String book_name;
    String author_string;
    String category_string;
    String publish_date;
    String page_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        LinearLayout book_name_layout = findViewById(R.id.book_name_layout);
        LinearLayout author_layout = findViewById(R.id.author_layout);
        LinearLayout category_layout = findViewById(R.id.category_layout);
        LinearLayout publish_date_layout = findViewById(R.id.publish_date_layout);
        LinearLayout page_count_layout = findViewById(R.id.page_count_layout);

        initialize();

        if(book_name != null && !book_name.isEmpty()) {
            name.setText(book_name);
        }
        else {
            book_name_layout.setVisibility(View.GONE);
        }

        if(author_string != null && !author_string.isEmpty()) {
            author.setText(author_string);
        }
        else {
            author_layout.setVisibility(View.GONE);
        }

        if(category_string != null && !category_string.isEmpty()) {
            category.setText(category_string);
        }
        else {
            category_layout.setVisibility(View.GONE);
        }

        if(publish_date != null && !publish_date.isEmpty()) {
            date.setText(publish_date);
        }
        else {
            publish_date_layout.setVisibility(View.GONE);
        }

        if(page_count != null && !page_count.isEmpty()) {
            pages.setText(page_count);
        }
        else {
            page_count_layout.setVisibility(View.GONE);
        }
    }

    private void initialize(){
        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);

        name = findViewById(R.id.book_name);
        author = findViewById(R.id.author);
        category = findViewById(R.id.category);
        date = findViewById(R.id.publish_date);
        pages = findViewById(R.id.page_count);

        book_name = getIntent().getStringExtra("book_name");
        author_string = getIntent().getStringExtra("author");
        category_string = getIntent().getStringExtra("category");
        publish_date = getIntent().getStringExtra("publish_date");
        page_count = getIntent().getStringExtra("page_count");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}