package com.example.root.animationexample;

import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imv;
    Button start;
    boolean flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= 21) {
            StatusBar.statusBarColorChange(MainActivity.this,android.R.color.black);
        }
        imv =(ImageView)findViewById(R.id.imv);
        start =(Button)findViewById(R.id.starttranisiton);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag){
                    imv.setImageResource(R.drawable.transoff);
                    ((TransitionDrawable)imv.getDrawable()).startTransition(5000);
                    flag= false;
                }
                else {
                    imv.setImageResource(R.drawable.transon);
                    ((TransitionDrawable)imv.getDrawable()).startTransition(5000);
                    flag= true;
                }

            }
        });
    }
}
