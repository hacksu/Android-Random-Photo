package me.isaacpark.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Random random = new Random();

    private int random_image() {
        int images[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.e, R.drawable.f};

        return images[random.nextInt(images.length)];
    };

    private void update_image() {
        imageView.setImageResource(random_image());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image);
        Button button = (Button) findViewById(R.id.another);
        update_image();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update_image();
            }
        });
    }


}
