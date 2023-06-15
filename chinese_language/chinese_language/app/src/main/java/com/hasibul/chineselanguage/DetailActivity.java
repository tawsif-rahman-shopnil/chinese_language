package com.hasibul.chineselanguage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes3.dex */
public class DetailActivity extends AppCompatActivity {
    private String itemDescription;
    private int itemId;
    private String itemTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        this.itemId = intent.getIntExtra("item_id", 0);
        this.itemTitle = intent.getStringExtra("item_title");
        this.itemDescription = intent.getStringExtra("item_description");
        ImageView itemImageView = (ImageView) findViewById(R.id.item_image_view);
        TextView itemTitleTextView = (TextView) findViewById(R.id.item_title_text_view);
        TextView itemDescriptionTextView = (TextView) findViewById(R.id.item_description_text_view);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        Button backButton = (Button) findViewById(R.id.back_button);
        int itemThumbnail = getItemThumbnail(this.itemTitle, this.itemDescription);
        itemImageView.setImageResource(itemThumbnail);
        itemTitleTextView.setText(this.itemTitle);
        itemDescriptionTextView.setText(this.itemDescription);
        final SharedPreferences preferences = getSharedPreferences("ratings", 0);
        float savedRating = preferences.getFloat("item_" + this.itemId + "_rating", 0.0f);
        ratingBar.setRating(savedRating);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: com.hasibul.chineselanguage.DetailActivity.1
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public void onRatingChanged(RatingBar ratingBar2, float rating, boolean fromUser) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putFloat("item_" + DetailActivity.this.itemId + "_rating", rating);
                editor.apply();
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() { // from class: com.hasibul.chineselanguage.DetailActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                DetailActivity.this.finish();
            }
        });
    }

    private int getItemThumbnail(String title, String description) {
        if (title.equals("Oracle Bone Script (甲骨文)")) {
            return R.drawable.pic1;
        }
        if (title.equals("Bronze Inscriptions (金文)")) {
            return R.drawable.pic2;
        }
        if (title.equals("Qin Dynasty Standardization (秦朝的文字标准化)")) {
            return R.drawable.pic3;
        }
        if (title.equals("Birth of Seal Script (篆书的诞生)")) {
            return R.drawable.pic4;
        }
        if (title.equals("Development of Clerical Script (隶书的发展)")) {
            return R.drawable.pic5;
        }
        if (title.equals("Kaishu and the Sui-Tang Calligraphers (楷书和隋唐书法家)")) {
            return R.drawable.pic6;
        }
        if (title.equals("Running Script and Cursive Script (行书和草书)")) {
            return R.drawable.pic7;
        }
        if (title.equals("Wei-Liang Calligraphy (魏梁书法)")) {
            return R.drawable.pic8;
        }
        if (title.equals("Yongzheng Dictionary (《康熙字典》)")) {
            return R.drawable.pic9;
        }
        if (title.equals("Early Printing Technology (古代印刷技术)")) {
            return R.drawable.pic10;
        }
        if (title.equals("Zhong Yuanzhong and Calligraphy in the Yuan Dynasty (钟元忠和元代书法)")) {
            return R.drawable.pic11;
        }
        if (title.equals("Ming-Qing Calligraphy (明清书法)")) {
            return R.drawable.pic12;
        }
        if (title.equals("Revolutionary Calligraphy (革命书法)")) {
            return R.drawable.pic13;
        }
        return 0;
    }
}
