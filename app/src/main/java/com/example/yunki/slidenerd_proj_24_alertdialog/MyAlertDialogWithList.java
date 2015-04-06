package com.example.yunki.slidenerd_proj_24_alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Yunki on 4/3/2015.
 */
public class MyAlertDialogWithList  extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("AlertDialog with List");
        builder.setItems(R.array.list, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "You selected " + which, Toast.LENGTH_LONG).show();
            }
        });
        Dialog dialog = builder.create();
        dialog.setCancelable(false);
        return dialog;
    }
}
