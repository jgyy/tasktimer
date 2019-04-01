package com.timbuchalka.tasktimer;

import android.app.DatePickerDialog;
import android.content.Context;

/**
 * Created by Jeffrey for Android Oreo with Java
 * Replacing tryNotifyDateSet() with nothing - this is a workaround for Android bug in API 4.x
 */

public class UnbuggyDatePickerDialog extends DatePickerDialog {

    public UnbuggyDatePickerDialog(Context context, OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth) {
        super(context, callBack, year, monthOfYear, dayOfMonth);
    }

    @Override
    protected void onStop() {
        // do nothing - do NOT call super method.
    }
}
