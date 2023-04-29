package com.example.customdialogs.Dialogs;

import android.app.Activity;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomDialogProvider extends ContentProvider {
    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }


    public void showDialog(eType type, Activity activity, String message) {
        switch (type) {
            case ERROR:
                CustomErrorDialog customErrorDialog = new CustomErrorDialog();
                customErrorDialog.show(activity, message);
                break;
            case WARNING:
                CustomWarningDialog customWarningDialog = new CustomWarningDialog();
                customWarningDialog.show(activity, message);
                break;
            case INFO:
                CustomInfoDialog customInfoDialog = new CustomInfoDialog();
                customInfoDialog.show(activity, message);
                break;
            case SUCCESS:
                CustomSuccessDialog customSuccessDialog = new CustomSuccessDialog();
                customSuccessDialog.show(activity, message);
                break;

        }

    }

    public enum eType {
        ERROR,
        WARNING,
        INFO,
        SUCCESS
    }


}
