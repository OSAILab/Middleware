package com.osai.dependencies;

import android.app.Activity;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbDevice;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;


public class A extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        Log.e("TTTT",event.toString());
        return super.dispatchKeyEvent(event);
    }
}
