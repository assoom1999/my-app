package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
Button b;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        b=(Button)findViewById(R.id.button);
        t=(TextView) findViewById(R.id.tv);
b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
        String x=t.getText()+"";
        i.putExtra(x,1);
        startActivity(i);
    }
});
    }
}
