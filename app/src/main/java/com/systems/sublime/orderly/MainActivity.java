package com.systems.sublime.orderly;

import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;



public class MainActivity extends AppCompatActivity {

    //MenuDrawable menuDrawable;
    ImageView imageView;

    //Bitmap bitmap = Bitmap.createBitmap(100,100, Bitmap.Config.ARGB_8888);
    //Canvas orderlyMenu = new Canvas(bitmap);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menuDrawable = new MenuDrawable(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.orderly_toolbar);
        setSupportActionBar(toolbar);

        imageView = (ImageView) findViewById(R.id.orderly_menu_circle);
        

    }

}
