package com.tungphan.giaiptbacmot;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView kq;
    int a,b;
    Button btnKq;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setTitle("Kết quả giải phương trình bậc nhất");
        Intent intent= getIntent();
        a= intent.getIntExtra("a",1);
        b= intent.getIntExtra("b", 1);

        kq= (TextView) findViewById(R.id.kq);
        if (a!=0) {
            kq.setText(""+(-b/a));
        }

        btnKq= (Button) findViewById(R.id.kq);
        btnKq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(ResultActivity.this, MainActivity.class);
                intent1.putExtra("a", a);
                intent1.putExtra("b", b);
                startActivity(intent1);
            }
        });
    }
}
