package com.example.customdialogs.Dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.customdialogs.R;

public class CustomInfoDialog {

    private ImageView info_IMG_close, info_IMG_icon;
    private TextView info_TXT_title, info_TXT_message;


    public void show(Activity activity, String message) {
        final Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.custom_info_alert_dialog);

        findVies(dialog);
        info_TXT_message.setText(message);
        info_IMG_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }

    private void findVies(Dialog dialog) {
        info_IMG_close = dialog.findViewById(R.id.info_IMG_close);
        info_IMG_icon = dialog.findViewById(R.id.info_IMG_icon);
        info_TXT_title = dialog.findViewById(R.id.info_TXT_title);
        info_TXT_message = dialog.findViewById(R.id.info_TXT_message);

    }

}
