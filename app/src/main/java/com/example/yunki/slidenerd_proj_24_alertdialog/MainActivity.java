package com.example.yunki.slidenerd_proj_24_alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * AlertDialog without using fragment.
     */
    public void showAlertDialog(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        // set title
        alertDialogBuilder.setTitle("Your Title");

        // set dialog message
        alertDialogBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }

    /* AlertDialog w/ fragment.
        Note the usage of fragmentmanager.
     */
    public void showAlertDialogFragment(View view) {
        MyAlert myAlert = new MyAlert();
        myAlert.show(getFragmentManager(), "My Alert");
    }

    public void showDialogWithList(View view) {
        MyAlertDialogWithList myAlert = new MyAlertDialogWithList();
        myAlert.show(getFragmentManager(), "My Alert with List");
    }

    public void showDialogWithMultiSelect(View view) {
        MyAlertDialogWithMultiChoice myAlert = new MyAlertDialogWithMultiChoice();
        myAlert.show(getFragmentManager(), "My Alert with multi select");
    }

    public void showDialogWithCustomDesign(View view) {
        MyAlertDialogWithCustomDesign myAlert = new MyAlertDialogWithCustomDesign();
        myAlert.show(getFragmentManager(), "My Alert with Custom design");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
