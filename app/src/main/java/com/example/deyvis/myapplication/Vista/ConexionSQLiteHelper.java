package com.example.deyvis.myapplication.Vista;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {



    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    //ejecuto la consulta
        db.execSQL("create table usuarios(_iduser integer primary key autoincrement, "
                +"nombre text not null, user not null, clave text not null,telefono text not null)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Usuarios");
        onCreate(db);

    }



    public static class usuarios{
        //agrego las costantes a cada variable
        public  static  final String table="usuarios";
        public  static  final String ID="_idUser";
        public  static  final String NOMBRE="nombre";
        public static final String USER="user";
        public  static final String CLAVE="clave";
        public static final String TELEFONO="telefono";
        public static final String[] COLUMNAS= new  String[]{
                ID,NOMBRE,USER,CLAVE,TELEFONO
        };
    }

}
