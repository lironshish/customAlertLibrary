package com.example.assignment2.Dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment2.R;

public class CustomWarningDialog {

    private ImageView warning_IMG_close, warning_IMG_icon;
    private TextView warning_TXT_title, warning_TXT_message;


    public void show(Activity activity, String message) {
        final Dialog dialog = new Dialog(activity);
        findVies(dialog);
        warning_TXT_message.setText(message);
        warning_IMG_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }

    private void findVies(Dialog dialog) {
        warning_IMG_close = dialog.findViewById(R.id.warning_IMG_close);
        warning_IMG_icon = dialog.findViewById(R.id.warning_IMG_icon);
        warning_TXT_title = dialog.findViewById(R.id.warning_TXT_title);
        warning_TXT_message = dialog.findViewById(R.id.warning_TXT_message);

    }

}
