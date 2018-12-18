package com.neo.mapatm.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;


import com.neo.mapatm.data.Model.ATM;
import com.neo.mapatm.data.Model.BANK;
import com.neo.mapatm.data.Model.DISTRICT;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {
    private static final String DB_NAME = "database.db";
    private static final String DB_PATH = "/data/data/com.neo.mapatm/";
    private Context mcontext=null;
    private SQLiteDatabase mDatabase;

    public Database(Context context) {
        super(context, DB_NAME, null, 1);
       mcontext = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



    public void OpenDatabase() {
        String dbPath = mcontext.getDatabasePath(DB_NAME).getPath();
        if (mDatabase != null && mDatabase.isOpen()) {
            return;
        }
        mDatabase = SQLiteDatabase.openDatabase(dbPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    public synchronized void CloseDatabase() {
        if (mDatabase != null) {
            mDatabase.close();
        }
    }


    public List<ATM> getListATM() {
        ATM atm = null;
        List<ATM> atmList = new ArrayList<>();
        OpenDatabase();
        Cursor cursorATM = mDatabase.rawQuery("SELECT * FROM ATM", null);
        cursorATM.moveToFirst();
        while (!cursorATM.isAfterLast()) {
            atm = new ATM(cursorATM.getInt(0), cursorATM.getInt(1), cursorATM.getInt(2), cursorATM.getString(3), cursorATM.getFloat(4), cursorATM.getFloat(5), cursorATM.getString(6));
            atmList.add(atm);
            cursorATM.moveToNext();
        }
        cursorATM.close();
        CloseDatabase();
        return atmList;
    }

    public List<BANK> getListBANK() {
        BANK bank = null;
        List<BANK> bankList = new ArrayList<>();
        OpenDatabase();
        Cursor cursorBANK = mDatabase.rawQuery("SELECT * FROM BANK", null);
        cursorBANK.moveToFirst();
        while (!cursorBANK.isAfterLast()) {
            bank = new BANK(cursorBANK.getInt(0), cursorBANK.getString(1));
            bankList.add(bank);
            cursorBANK.moveToNext();
        }
        cursorBANK.close();
        CloseDatabase();
        return bankList;
    }

    public List<DISTRICT> getListDICTRICT() {
        DISTRICT district = null;
        List<DISTRICT> districtList = new ArrayList<>();
        OpenDatabase();
        Cursor cursorDISTRICT = mDatabase.rawQuery("SELECT * FROM DISTRICT", null);
        cursorDISTRICT.moveToFirst();
        while (!cursorDISTRICT.isAfterLast()) {
            district = new DISTRICT(cursorDISTRICT.getInt(0), cursorDISTRICT.getInt(1), cursorDISTRICT.getString(2));
            districtList.add(district);
            cursorDISTRICT.moveToNext();
        }
        cursorDISTRICT.close();
        CloseDatabase();
        return districtList;
    }

}
