package com.example.samuyu.lolipop;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.samuyu.lolipop.adapters.ImageListAdapter;
import com.example.samuyu.lolipop.entities.Star;
import com.example.samuyu.lolipop.entities.StartContainer;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MyActivity extends Activity {

    @InjectView(R.id.my_image_list)
    RecyclerView mImageRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ButterKnife.inject(this);

        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setActionBar(toolbar);*/

        setupRecyclerView();
    }

    private void setupRecyclerView() {

        List<Star> list = StartContainer.getList();

        ImageListAdapter adapter = new ImageListAdapter(this, list, new ImageListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Star star, View imageView) {

                String transtionName = getString(R.string.image);
                ActivityOptions options = ActivityOptions.
                        makeSceneTransitionAnimation(MyActivity.this, imageView, transtionName);

                Intent intent = DetailActivity.createIntent(getApplicationContext(), star);
                startActivity(intent, options.toBundle());

            }
        });

        mImageRecyclerView.setHasFixedSize(true);
        //mImageRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //mImageRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, 3));
        mImageRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        mImageRecyclerView.setAdapter(adapter);
        mImageRecyclerView.setItemAnimator(null);
    }

    /*
    @OnClick(R.id.imageView)
    public void onClickImageView() {
        String transtionName = getString(R.string.image);
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this, mImageView, transtionName);

        Intent intent = DetailActivity.createIntent(this);
        startActivity(intent, options.toBundle());
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
