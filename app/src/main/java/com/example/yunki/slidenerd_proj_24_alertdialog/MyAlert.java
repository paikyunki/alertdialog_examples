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
public class MyAlert extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("AlertDialog with Fragment");
        builder.setMessage("Do you like this dialog?");
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Cancel clicked " + which, Toast.LENGTH_LONG).show();
            }
        });
        builder.setNeutralButton(R.string.maybe, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Maybe clicked" + which, Toast.LENGTH_LONG).show();
            }
        });
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Ok clicked" + which, Toast.LENGTH_LONG).show();
            }
        });
        Dialog dialog = builder.create();
        dialog.setCancelable(false);
        return dialog;
    }
}
