package com.acusgazerock.hitungluas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtLuas = (TextView) findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();
                if (panjang.matches("")) {
                    Toast.makeText(MainActivity.this, "You did not enter a panjang", Toast.LENGTH_SHORT).show();
                } else if (lebar.matches("")) {
                    Toast.makeText(MainActivity.this, "You did not enter a lebar", Toast.LENGTH_SHORT).show();
                } else  if (panjang.equals(".")) {
                    Toast.makeText(MainActivity.this, "panjang must have value", Toast.LENGTH_SHORT).show();
                } else if (lebar.equals(".")) {
                    Toast.makeText(MainActivity.this, "lebar must have value", Toast.LENGTH_SHORT).show();
                } else {

                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);

                    double luas = p * l;

                    txtLuas.setText("Luas : " + luas);
                }
            }
        });
    }
}