package com.example.yzk3;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
    private TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(TextView) findViewById(R.id.textView);
        registerForContextMenu(editText);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater= new MenuInflater(this);
        inflater.inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.small:
                editText.setTextSize(10);
                break;
            case R.id.large:
                editText.setTextSize(20);
                break;
            case R.id.middle:
                editText.setTextSize(15);
                break;
            case R.id.black:
                editText.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.red:
                editText.setTextColor(Color.parseColor("#FF0000"));
                break;
            case R.id.generous:
                Toast.makeText(this,"您点击了普通菜单",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater= new MenuInflater(this);
        inflater.inflate(R.menu.main,menu);
        menu.setHeaderTitle("菜单");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.small:
                editText.setTextSize(10);
                break;
            case R.id.large:
                editText.setTextSize(20);
                break;
            case R.id.middle:
                editText.setTextSize(15);
                break;
            case R.id.black:
                editText.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.red:
                editText.setTextColor(Color.parseColor("#FF0000"));
                break;
            case R.id.generous:
                Toast.makeText(this,"您点击了普通菜单",Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}