package com.example.subasta.Datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexion extends SQLiteOpenHelper {


    public Conexion(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_OFERTANTE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int vantigua, int vnueva) {
        db.execSQL("DROP TABLE if exists OFERTANTE");
        onCreate(db);
    }


}
