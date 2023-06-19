package com.example.randomimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        img=findViewById(R.id.imageView6);
        Drawable rmg[]=new Drawable[3];
        Resources res=getResources();
        rmg[0]=res.getDrawable(R.drawable.image1);
        rmg[1]=res.getDrawable(R.drawable.image2);
        rmg[2]=res.getDrawable(R.drawable.image3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNum=new Random();
                int rand=randomNum.nextInt(3-0)+0;
                img.setImageDrawable(rmg[rand]);
            }
        });
    }
}