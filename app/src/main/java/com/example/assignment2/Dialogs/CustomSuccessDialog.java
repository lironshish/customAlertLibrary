package com.example.assignment2.Dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment2.R;

public class CustomSuccessDialog {

    private ImageView success_IMG_close, success_IMG_icon;
    private TextView success_TXT_title, success_TXT_message;


    public void show(Activity activity, String message) {
        final Dialog dialog = new Dialog(activity);
        findVies(dialog);
        success_TXT_message.setText(message);
        success_IMG_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }

    private void findVies(Dialog dialog) {
        success_IMG_close = dialog.findViewById(R.id.success_IMG_close);
        success_IMG_icon = dialog.findViewById(R.id.success_IMG_icon);
        success_TXT_title = dialog.findViewById(R.id.success_TXT_title);
        success_TXT_message = dialog.findViewById(R.id.success_TXT_message);

    }


}
