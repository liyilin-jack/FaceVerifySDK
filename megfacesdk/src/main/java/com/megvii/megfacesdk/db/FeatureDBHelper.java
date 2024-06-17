package com.megvii.megfacesdk.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FeatureDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "FaceRecognition.db";
    private static final int DATABASE_VERSION = 1;

    public FeatureDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE IF NOT EXISTS Groups (" +
                        "groupName TEXT PRIMARY KEY)"
        );
        db.execSQL(
                "CREATE TABLE IF NOT EXISTS Features (" +
                        "featureId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "groupName TEXT, " +
                        "tag TEXT, " +
                        "feature TEXT, " +
                        "FOREIGN KEY(groupName) REFERENCES Groups(groupName))"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Handle database version upgrades here
    }

    public void addFeature(SQLiteDatabase db, String groupName, String tag, String feature) {
        ContentValues groupValues = new ContentValues();
        groupValues.put("groupName", groupName);
        long groupId = db.insertWithOnConflict("Groups", null, groupValues, SQLiteDatabase.CONFLICT_IGNORE);

        ContentValues featureValues = new ContentValues();
        featureValues.put("groupName", groupName);
        featureValues.put("tag", tag);
        featureValues.put("feature", feature);
        long featureId = db.insert("Features", null, featureValues);
    }

    public void removeFeatureById(SQLiteDatabase db, int featureId) {
        db.delete("Features", "featureId = ?", new String[]{String.valueOf(featureId)});
    }

    public void updateFeature(SQLiteDatabase db, int featureId, String newFeature) {
        ContentValues values = new ContentValues();
        values.put("feature", newFeature);
        db.update("Features", values, "featureId = ?", new String[]{String.valueOf(featureId)});
    }

    public Cursor queryFeatureById(SQLiteDatabase db, int featureId) {
        return db.query("Features", null, "featureId = ?", new String[]{String.valueOf(featureId)}, null, null, null);
    }


}
