package app.uangkas.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Lazday Indonesia
 * www.lazday.com
 * on 5/18/2017.
 */

public class SqliteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "uangKas";
    private static final int DATABASE_VERSION = 1;

    public SqliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "CREATE TABLE transaksi (transaksi_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, status TEXT," +
                        "jumlah DOUBLE, keterangan TEXT, tanggal DATE DEFAULT CURRENT_DATE );"
        );
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS transaksi");
    }
}
