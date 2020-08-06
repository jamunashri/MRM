package com.textile.mrm;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int[] image={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.lin);
        TextView textView=(TextView)findViewById(R.id.name);
        ListView listView=(ListView)findViewById(R.id.list);
        BottomNavigationView bottomNavigationView=(BottomNavigationView)findViewById(R.id.navibottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.nav_home:
                        break;

                    case R.id.nav_contact:
                        Intent intent1=new Intent(MainActivity.this,Contact_us.class);
                        startActivity(intent1);
                        break;
                    case R.id.nav_about:
                        Intent intent2=new Intent(MainActivity.this,about.class);
                        startActivity(intent2);
                        break;
                    default:
                        break;
            }
            return true;
        }

        });

    }
}