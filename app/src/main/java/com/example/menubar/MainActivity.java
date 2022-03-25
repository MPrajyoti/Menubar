package com.example.menubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.call:
                Toast.makeText(getApplicationContext(), "Call", Toast.LENGTH_LONG).show();
                break;

            case R.id.sms:
                Toast.makeText(getApplicationContext(), "sms", Toast.LENGTH_LONG).show();
                break;

            case R.id.setting:
                Toast.makeText(getApplicationContext(), "settings", Toast.LENGTH_LONG).show();
                break;
                case R.id.add:
                Toast.makeText(getApplicationContext(), "add", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }}