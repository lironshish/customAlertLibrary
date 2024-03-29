package com.example.customdialogs.Dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.customdialogs.R;

public class CustomErrorDialog {

    private ImageView error_IMG_close, error_IMG_icon;
    private TextView error_TXT_title, error_TXT_message;


    public void show(Activity activity, String message) {
        final Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.custom_error_alert_dialog);
        findVies(dialog);
        error_TXT_message.setText(message);
        error_IMG_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }

    private void findVies(Dialog dialog) {
        error_IMG_close = dialog.findViewById(R.id.error_IMG_close);
        error_IMG_icon = dialog.findViewById(R.id.error_IMG_icon);
        error_TXT_title = dialog.findViewById(R.id.error_TXT_title);
        error_TXT_message = dialog.findViewById(R.id.error_TXT_message);

    }

}
