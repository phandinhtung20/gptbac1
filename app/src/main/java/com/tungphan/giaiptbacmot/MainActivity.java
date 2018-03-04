package com.tungphan.giaiptbacmot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editA, editB;
    Button btn;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Giải phương trình bậc nhất");
        editA= (EditText) findViewById(R.id.edit_a);
        editA.setText("0");
        editB= (EditText) findViewById(R.id.edit_b);
        editB.setText("0");

        btn= (Button) findViewById(R.id.cal);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a= Integer.parseInt(editA.getText().toString());
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "a Sai định dạng", Toast.LENGTH_SHORT).show();
                }

                try {
                    b= Integer.parseInt(editB.getText().toString());
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "b Sai định dạng", Toast.LENGTH_SHORT).show();
                }
                Intent intent= new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("a", a);
                intent.putExtra("b", b);
                startActivity(intent);
            }
        });


    }
}
