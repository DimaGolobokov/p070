package com.example.p070;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // добавляем пункты меню
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent =null;

        if (item.getItemId()==R.id.m1){
            intent = new Intent(this, theatre.class);
        } else if (item.getItemId()==R.id.m2){
            intent = new Intent(this, films.class);
        } else if (item.getItemId()==R.id.m3){
            intent = new Intent(this, newtheatre.class);
        } else if (item.getItemId()==R.id.m4){
            intent = new Intent(this, newfilm.class);
        } else if (item.getItemId()==R.id.m5) {
            intent = new Intent(this, updtheatres.class);
        } else if (item.getItemId()==R.id.m6){
            intent = new Intent(this, updfilms.class);
        }
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }



}
