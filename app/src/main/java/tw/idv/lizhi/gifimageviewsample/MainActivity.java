package tw.idv.lizhi.gifimageviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GifImageView gifImageView = findViewById(R.id.imageView);
        try {
            GifDrawable gifDrawable = new GifDrawable(getResources(), R.drawable.sample_image);
            gifImageView.setImageDrawable(gifDrawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
