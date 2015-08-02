package com.example.suman.recyclerviewdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.suman.recyclerviewdemo.adapter.MyAdapter;

import com.example.suman.recyclerviewdemo.pojo.Mypojo;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        ArrayList<Mypojo> pojos = new ArrayList<Mypojo>();
        for(int i=0; i<20 ; i++){
            pojos.add(new Mypojo(
                    "Bipul Chettri ",
                    "Educated musician with P.H.D in music sector. His songs influenced all the Nepalese people.  'Asar'  album made him popular throughout Nepal as well as Nepalese people around the Globe..",
                    R.drawable.bipul

            ));
        }

        mAdapter = new MyAdapter(pojos);
        mRecyclerView.setAdapter(mAdapter);
    }



}
