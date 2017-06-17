package com.itexps.basictutorials;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Tutorial3Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    private CheckBox checkBox;
    private ToggleButton toggleButton;
    private Switch aSwitch;

    private Spinner  spinner1;

    private Spinner spinner2;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial3);

        this.checkBox= (CheckBox) findViewById(R.id.checkBox);
        this.toggleButton= (ToggleButton) findViewById(R.id.toggleButton);
        this.aSwitch= (Switch) findViewById(R.id.switch1);

        this.spinner1= (Spinner) findViewById(R.id.spinner1);
        this.spinner2= (Spinner) findViewById(R.id.spinner2);

        this.radioGroup= (RadioGroup) findViewById(R.id.radioGroup);

        String[] selectionItems=new String[]{"Schaumburg IL","Niles IL", "Chicago IL","Desplain IL","Mt Prospect IL",};
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,selectionItems);
        this.spinner2.setAdapter(adapter);


        this.checkBox.setOnCheckedChangeListener(this);
        this.toggleButton.setOnCheckedChangeListener(this);
        this.aSwitch.setOnCheckedChangeListener(this);


        this.spinner1.setOnItemSelectedListener(this);
        this.spinner2.setOnItemSelectedListener(this);

        this.radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId()==R.id.spinner1)
        {
            String item= (String) parent.getSelectedItem();
            Toast.makeText(this,item,Toast.LENGTH_SHORT).show();
        }else if(parent.getId()==R.id.spinner2)
        {
            String item= (String) parent.getSelectedItem();
            Toast.makeText(this,item,Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


        if(buttonView.getId()==R.id.checkBox)
        {
            Toast.makeText(this,"Checkbox Status= "+isChecked,Toast.LENGTH_SHORT).show();

        }else if(buttonView.getId()==R.id.toggleButton)
        {
            Toast.makeText(this,"Toggle button Status= "+isChecked,Toast.LENGTH_SHORT).show();

        }else if(buttonView.getId()==R.id.switch1)
        {
            Toast.makeText(this,"Switch button Status= "+isChecked,Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        if (R.id.radioButton_1==checkedId) {

            Toast.makeText(this,"Yay You checked Yes",Toast.LENGTH_SHORT).show();

        } else if (R.id.radioButton_2==checkedId)
        {
            Toast.makeText(this,"Why!!! Why You Checked No",Toast.LENGTH_SHORT).show();
        }else if (R.id.radioButton_3==checkedId)
        {

            Toast.makeText(this,"You are still confused??",Toast.LENGTH_SHORT).show();
        }
    }
}
