package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn1);


        String[] from = {"Indian Rupees"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"Euro","Sri Lankan Rupees","Japanese Yen","Pound Sterling","Australian Dollar","Russsian Ruble"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());
                if (sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amount * 0.0123;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Sri Lankan Rupees")
                {
                    tot = amount * 4.6177;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Japanese Yen")
                {
                    tot = amount * 1.661;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Pound Sterling")
                {
                    tot = amount * 0.0105;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Australian Dollar")
                {
                    tot = amount * 0.0185;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString() == "Indian Rupees" && sp2.getSelectedItem().toString() == "Russsian Ruble")
                {
                    tot = amount * 0.8305;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}