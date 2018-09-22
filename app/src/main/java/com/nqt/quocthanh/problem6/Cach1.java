package com.nqt.quocthanh.problem6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Cach1 extends AppCompatActivity {
    private EditText edtSoA, edtSoB;
    private TextView tvKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Tong(View view) {
        edtSoA = findViewById(R.id.edt_soA);
        edtSoB = findViewById(R.id.edt_soB);
        int a = Integer.parseInt(edtSoA.getText()+"");
        int b = Integer.parseInt(edtSoB.getText()+"");
        tvKetqua = findViewById(R.id.tv_ketqua);
        tvKetqua.setText((a+b)+"");
    }
    public void Clean(View view){
        edtSoA.setText("");
        edtSoB.setText("");
    }
}
