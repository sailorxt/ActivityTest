package com.example.tao.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo){
        getMenuInflater().inflate(R.menu.main, menu);        ;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "Add selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "Remove selected", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.first_layout);
        Button button1 = (Button)findViewById(R.id.button1);
        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FirstActivity.this, "Button1 clicked!", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                Intent intent = new Intent("com.example.tao.activitytest.ACTION_START");
                intent.addCategory("com.example.tao.activitytest.MY_CATEGORY");
                startActivity(intent);
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });
        registerForContextMenu(findViewById(R.id.button1));
    }

}
