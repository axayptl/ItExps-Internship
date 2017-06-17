package com.itexps.basictutorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tutorial2Activity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial2);

        this.editText= (EditText) findViewById(R.id.editText);

        this.button= (Button) findViewById(R.id.button);

        this.button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, this.editText.getText()+"", Toast.LENGTH_SHORT).show();
    }
}
