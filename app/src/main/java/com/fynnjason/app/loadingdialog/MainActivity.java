package com.fynnjason.app.loadingdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.fynnjason.app.lib.LoadingDialog;

public class MainActivity extends AppCompatActivity {

    private LoadingDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadingDialog.Builder loadBuilder = new LoadingDialog.Builder(this)
                .setCancelable(true)
                .setCancelOutside(false);
        mDialog = loadBuilder.create();
        mDialog.show();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        mDialog.cancel();
        return super.onKeyDown(keyCode, event);
    }
}
