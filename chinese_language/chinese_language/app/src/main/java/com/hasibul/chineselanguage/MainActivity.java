package com.hasibul.chineselanguage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes3.dex */
public class MainActivity extends AppCompatActivity {
    private static final long TIMEOUT_DELAY = 3000;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.hasibul.chineselanguage.MainActivity.1
            @Override // java.lang.Runnable
            public void run() {
                MainActivity.this.navigateToListActivity();
            }
        }, TIMEOUT_DELAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void navigateToListActivity() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
        finish();
    }
}
