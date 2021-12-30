package com.shmugen.app.legends;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.shmugen.app.legends.common.Shared;
import com.shmugen.app.legends.engine.ScreenController;
import com.shmugen.app.legends.fragments.MenuFragment;
import com.shmugen.app.legends.fragments.LevelFragment;
import com.shmugen.app.legends.utils.Utils;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView pics = findViewById(R.id.pics_container);
        ImageView text = findViewById(R.id.text_container);

        InputStream ims = null;
        try {
            ims = getAssets().open("pics_1.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // загружаем как Drawable
        Drawable d = Drawable.createFromStream(ims, null);
        // выводим картинку в ImageView
        pics.setImageDrawable(d);

        //pics.setImageResource(getApplicationContext().getResources().getIdentifier("pics_1", "drawable", getApplicationContext().getPackageName()));
        text.setImageResource(getApplicationContext().getResources().getIdentifier("text_1", "drawable", getApplicationContext().getPackageName()));
        */

        ImageView pics = findViewById(R.id.pics_container);
        ImageView text = findViewById(R.id.text_container);

        pics.setImageResource(getApplicationContext().getResources().getIdentifier("pics_1", "drawable", getApplicationContext().getPackageName()));
        text.setImageResource(getApplicationContext().getResources().getIdentifier("text_1", "drawable", getApplicationContext().getPackageName()));


        /*mBackgroundImage = findViewById(R.id.background_image);

        Shared.context = getApplicationContext();
        Shared.activity = this;

        //параметры utils для обработки растовых изображений высчитать и получить сразу, чтобы каждую картинку подгонять под готовые
        //параметры

        setBackGroungImage();
        ScreenController.getInstance().openScreen(ScreenController.Screen.MENU);*/

        /*
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(Shared.context.getResources(), R.drawable.background);
        options.inJustDecodeBounds = false;
        Bitmap bitmap = BitmapFactory.decodeResource(Shared.context.getResources(), R.drawable.background, options);
        mBackgroundImage.setImageBitmap(bitmap);*/


    }


/*    private void setBackGroungImage(){
        Bitmap bitmap = Utils.scaleDown(R.drawable.background, Utils.screenWidth(), Utils.screenHeight());
        bitmap = Utils.crop(bitmap, Utils.screenHeight(), Utils.screenWidth());
        bitmap = Utils.downscaleBitmap(bitmap, 2);
        mBackgroundImage.setImageBitmap(bitmap);
    }*/

    /*
    private Bitmap getBitmap(int width, int height){
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = calculeteSampleSize(options, width, height);
        return BitmapFactory.decodeResource(getResources(), R.drawable.background3, options);
    }

    private int calculeteSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight){
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            // Calculate ratios of height and width to requested height and
            // width
            final int heightRatio = Math.round((float) height / (float) reqHeight);
            final int widthRatio = Math.round((float) width / (float) reqWidth);

            // Choose the smallest ratio as inSampleSize value, this will
            // guarantee
            // a final image with both dimensions larger than or equal to the
            // requested height and width.
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
        }

        return inSampleSize;

    }*/
}