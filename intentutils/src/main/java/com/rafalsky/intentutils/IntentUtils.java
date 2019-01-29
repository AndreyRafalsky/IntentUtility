package com.rafalsky.intentutils;

import android.content.Intent;

public class IntentUtils {
    //first intent method
    public static Intent getSendIntent(String message, String subject){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        return intent;
    }
}
