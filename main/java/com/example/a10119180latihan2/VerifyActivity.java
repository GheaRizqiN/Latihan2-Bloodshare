package com.example.a10119180latihan2;
/* Tanggal Pengerjaan : 25 April 2022
 * NIM                 : 10119180
 * Nama                : Ghea Rizqi Nabilla
 * Kelas               : IF5
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void submitCode(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}

