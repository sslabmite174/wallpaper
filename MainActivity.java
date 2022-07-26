package com.varshith.exam_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends AppCompatActivity {
    Button change;
    Button stop;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        change=(Button) findViewById(R.id.change);
        stop=(Button) findViewById(R.id.stop);
        final WallpaperManager wallpaperManager= WallpaperManager.getInstance(getApplicationContext());
       // Timer timer =new Timer();
        Handler handler = new Handler();
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.removeMessages(0);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    @SuppressLint("ResourceType")
                    @Override
                    public void run() {
                        handler.postDelayed(this,3000);
                        Random r = new Random();
                        int rand = r.nextInt(4);
                        if (rand == 0) {
                            try {
                                wallpaperManager.setResource(R.drawable.b);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } else if (rand == 1) {
                            try {
                                wallpaperManager.setResource(R.drawable.c);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } else if (rand == 2) {
                            try {
                                wallpaperManager.setResource(R.drawable.d);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } else if (rand == 3) {
                            try {
                                wallpaperManager.setResource(R.drawable.d);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                wallpaperManager.setResource(R.drawable.b);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                },3000);
            }
        });

    }


}
