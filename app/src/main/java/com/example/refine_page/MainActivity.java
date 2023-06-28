package com.example.refine_page;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,main_sliderTV;
    EditText et;
    String[] item1={"Available| Hey Let Us Connect","Away| Stay Discreet And Watch","Busy| Do Not Disturb| Will Catch Up Later","SOS| Emergency! Need Assistance! HELP"};
    Slider main_slider;
    Button b1,b2,b3,b4,b5,button;

    AutoCompleteTextView autoCompleteTextView,autoCompleteTextView2;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        et=findViewById(R.id.et);
        autoCompleteTextView=findViewById(R.id.auto_complete_textview);
        adapterItems=new ArrayAdapter<String>(this,R.layout.list_item1,item1);
        main_slider=findViewById(R.id.main_slider);
        main_sliderTV=findViewById(R.id.main_sliderTV);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        button=findViewById(R.id.button);
        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String item = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "item "+item , Toast.LENGTH_SHORT).show();
            }
        });

        main_slider.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                    main_sliderTV.setText(Float.toString(value));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "item saved", Toast.LENGTH_SHORT).show();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "item clicked", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "item clicked", Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "item clicked", Toast.LENGTH_SHORT).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "item clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}