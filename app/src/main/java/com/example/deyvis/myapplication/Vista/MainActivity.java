package com.example.deyvis.myapplication.Vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.deyvis.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login=(Button)findViewById(R.id.registrar);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Home.class));
                finish();
            }
        });

        //instaciamos la clase Conexion y le pasamos el nombre de la base de datos, y la version y el parametro factori va ser null

        ConexionSQLiteHelper conexionSQLiteHelper = new ConexionSQLiteHelper(this,"BDAgenda",null,1);
    }
}
