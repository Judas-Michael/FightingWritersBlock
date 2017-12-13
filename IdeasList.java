package com.judas.fightingwritersblock;

import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by judas on 11/29/2017.
 */

public class IdeasList extends AppCompatActivity {

    ListView IdeasLV;
    ArrayList<String> idLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ideaview);


        IdeasLV = (ListView) findViewById(R.id.ideas_lv);


        final ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, idLV);
        IdeasLV.setAdapter(adapter);

}
    }