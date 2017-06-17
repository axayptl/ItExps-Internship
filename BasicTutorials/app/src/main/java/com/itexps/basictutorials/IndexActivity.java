package com.itexps.basictutorials;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.itexps.basictutorials.adapter.IndexAdapter;
import com.itexps.basictutorials.data.DataProvider;
import com.itexps.basictutorials.data.TutorialIndexItem;

import java.util.ArrayList;

public class IndexActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


        this.listView= (ListView) findViewById(R.id.listView);
        this.listView.setAdapter(new IndexAdapter(this,DataProvider.getTutorialIndexData()));

        this.listView.setOnItemClickListener(this);
        this.listView.setOnItemLongClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TutorialIndexItem indexItem= (TutorialIndexItem) parent.getItemAtPosition(position);

        if(0==position)
        {
            Intent intent=new Intent(this,Tutorial1Activity.class);
            startActivity(intent);
        }else if(1==position)
        {
            Intent intent=new Intent(this,Tutorial2Activity.class);
            startActivity(intent);
        }

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

        TutorialIndexItem indexItem= (TutorialIndexItem) parent.getItemAtPosition(position);

        AlertDialog alertDialog=new AlertDialog.Builder(this).setTitle(indexItem.getTitle()).setMessage(indexItem.getDescription()).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create();

        alertDialog.show();
        return true;
    }
}
