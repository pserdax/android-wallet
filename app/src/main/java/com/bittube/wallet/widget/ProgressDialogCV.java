package com.bittube.wallet.widget;

import android.app.Activity;
import android.app.ProgressDialog;

import com.bittube.wallet.R;

public class ProgressDialogCV extends ProgressDialog {
    Activity activity;

    public ProgressDialogCV(Activity activity, int msgId) {
        super(activity);
        this.activity = activity;
        setCancelable(false);
        setIndeterminateDrawable(activity.getResources().getDrawable(R.drawable.icon_wallet_grey));
        setMessage(activity.getString(msgId));
    }

    @Override
    public void onBackPressed() {
        // prevent back button
    }
}