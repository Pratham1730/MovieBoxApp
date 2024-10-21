package com.example.moviesbox.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.moviesbox.R;
import com.example.moviesbox.databinding.ActivityMoviesViewBinding;
import com.example.moviesbox.model.Movie;

public class MoviesViewActivity extends AppCompatActivity {
    private Movie movie;
    private ActivityMoviesViewBinding activityMoviesViewBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_view);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        activityMoviesViewBinding = DataBindingUtil.setContentView(this, R.layout.activity_movies_view);

        Intent i = getIntent();

        if (i.hasExtra("movie")){
            movie = getIntent().getParcelableExtra("movie");
            activityMoviesViewBinding.setMovie(movie);
//            getSupportActionBar().setTitle(movie.getTitle());
        }

    }
}