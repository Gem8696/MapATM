package com.neo.mapatm;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.neo.mapatm.data.Database;



public class Manhinhnen extends AppCompatActivity {

    Database dbhelper;
    private ListView listView;

   @Override
   protected void onCreate(Bundle saveInstanState) {
       super.onCreate(saveInstanState);
       setContentView(R.layout.listview_catologe);
       dbhelper = new Database(getApplicationContext());
       dbhelper.OpenDatabase();
   }

     public  void timatm(View v) {

         Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_SHORT).show();
     }
    public  void timbank(View v)
    {
        Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_SHORT).show();
    }
    public  void place(View v)
    {
        
    }
    public  void information(View v)
    {
        Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_SHORT).show();
    }

}
