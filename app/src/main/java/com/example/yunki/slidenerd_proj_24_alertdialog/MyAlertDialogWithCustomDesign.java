package com.example.yunki.slidenerd_proj_24_alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Yunki on 4/3/2015.
 */
public class MyAlertDialogWithCustomDesign extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.custom_dialog, null);
        builder.setView(view);
        builder.setMessage("Do you like this custom desigtn dialog?");
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
        return dialog;
    }
}
