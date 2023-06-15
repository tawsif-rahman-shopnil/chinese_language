package com.hasibul.chineselanguage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ListActivity extends AppCompatActivity {
    private List<ListItem> itemList;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList arrayList = new ArrayList();
        this.itemList = arrayList;
        arrayList.add(new ListItem(1, R.drawable.pic1, "Oracle Bone Script (甲骨文)", "The Oracle Bone Script, dating back to the Shang Dynasty (1600–1046 BCE), is considered the earliest known form of systematic Chinese writing. Used primarily for divination, this pictographic script was carved into animal bones and turtle shells, hence its name. These ancient inscriptions provide a fascinating window into the concerns and beliefs of the earliest literate Chinese civilization, dealing with topics like warfare, weather, crop yields, and royal births. Oracle Bone Script's complexity indicates a well-developed writing system even in these ancient times. It is the forebearer of modern Chinese characters and remains a symbol of China's rich cultural heritage."));
        this.itemList.add(new ListItem(2, R.drawable.pic2, "Bronze Inscriptions (金文)", "As we move into the Zhou Dynasty (1046–256 BCE), we find the advent of Bronze Inscriptions. These characters, sometimes called \"Bronzeware script,\" were cast into ritual bronze vessels, representing the status and power of the nobility. More formal and standardized than Oracle Bone Script, Bronze Inscriptions bear a closer resemblance to modern Chinese characters. These inscriptions reveal a lot about the social structure, religious practices, and political ceremonies of the time. The bronzes carrying these inscriptions are highly valued, both as works of art and as historical documents."));
        this.itemList.add(new ListItem(3, R.drawable.pic3, "Qin Dynasty Standardization (秦朝的文字标准化)", "With the unification of China under the First Emperor, Qin Shi Huang, in 221 BCE, the written language also needed unification. Until then, regional scripts varied significantly, causing confusion and inefficiency. Li Si, the Prime Minister, undertook the task of standardizing the script, known as the Small Seal Script. The standardization had a significant impact, promoting communication and administration across the vast empire. The move set a precedent for the central control of written language in China, a principle that has endured till today."));
        this.itemList.add(new ListItem(4, R.drawable.pic4, "Birth of Seal Script (篆书的诞生)", "The Birth of Seal Script (also known as Large Seal Script) was an important event in the evolution of Chinese writing. This happened around the same time as Bronze Inscriptions in the Zhou Dynasty, but Seal Script was more formal and artistic. Characterized by its intricate and aesthetically pleasing form, it was used primarily for inscriptions on seals - hence the name. The Small Seal Script, standardized during the Qin Dynasty, was derived from it. Despite its complexity, Seal Script is still appreciated for its beauty and used for artistic purposes, embodying a crucial aspect of the artistic nature of Chinese writing."));
        this.itemList.add(new ListItem(5, R.drawable.pic5, "Development of Clerical Script (隶书的发展)", "The Clerical Script emerged during the Han Dynasty (202 BCE – 220 CE) as a more concise and efficient form of writing. It was the result of simplifying the complex Seal Script to facilitate faster writing with a brush. The Clerical Script was widely used for official documents and bureaucratic purposes, showing the influence of efficient administration during this period. Despite its intended practicality, the script's flowing and elegant style made it popular for artistic expression, and it continues to inspire calligraphers to this day."));
        this.itemList.add(new ListItem(6, R.drawable.pic6, "Kaishu and the Sui-Tang Calligraphers (楷书和隋唐书法家)", "Kaishu, also known as Regular Script, originated during the late Han Dynasty and became the standard script during the Sui and Tang Dynasties (581–907 CE). This script marked a shift towards simpler and more standardized characters, making it easier to read and write. It set the foundation for modern Chinese characters. The Sui-Tang period saw the rise of renowned calligraphers like Yan Zhenqing and Ouyang Xun, who perfected the art of Kaishu calligraphy, influencing generations of calligraphers in later eras."));
        this.itemList.add(new ListItem(7, R.drawable.pic7, "Running Script and Cursive Script (行书和草书)", "Running Script, also known as Semi-Cursive Script, was developed during the Eastern Jin Dynasty (317–420 CE). It strikes a balance between the precise Regular Script and the fluidity of Cursive Script. This style allows for faster writing while retaining legibility. Cursive Script, or Grass Script, took this concept further, emphasizing speed and freedom of expression. It is highly cursive and challenging to read. Running Script and Cursive Script provided calligraphers with more artistic flexibility, allowing personal style and individuality to shine through."));
        this.itemList.add(new ListItem(8, R.drawable.pic8, "Wei-Liang Calligraphy (魏梁书法)", "Wei-Liang Calligraphy refers to the calligraphic style developed during the Wei and Liang Dynasties (220–589 CE) in China. This period saw the emergence of distinct regional styles of calligraphy, with Wei and Liang representing the northern and southern traditions, respectively. The Wei-Liang calligraphy encompasses various scripts, including Regular Script, Running Script, and Cursive Script, showcasing the diversity and richness of Chinese calligraphic art during this time."));
        this.itemList.add(new ListItem(9, R.drawable.pic9, "Yongzheng Dictionary (《康熙字典》)", "The Yongzheng Dictionary, also known as the Kangxi Dictionary, is a comprehensive Chinese dictionary compiled during the reign of the Kangxi Emperor (1661–1722) of the Qing Dynasty. It contains over 47,000 characters, including ancient, rare, and variant forms. The dictionary served as a standard reference for Chinese characters and their meanings, providing valuable insights into the historical development of the Chinese writing system. Its meticulous compilation and authoritative status made it an indispensable tool for scholars and language enthusiasts alike."));
        this.itemList.add(new ListItem(10, R.drawable.pic10, "Early Printing Technology (古代印刷技术)", "China has a long history of printing technology, with early examples dating back to the Tang Dynasty (618–907 CE). The invention of woodblock printing revolutionized the dissemination of knowledge and culture. Woodblock printing involved carving characters into wooden blocks, which were then inked and pressed onto paper. This technique enabled the mass production of books, religious texts, and artworks, contributing to the preservation and transmission of Chinese literature and art. The development of printing technology in China laid the foundation for future advancements in the printing industry worldwide."));
        this.itemList.add(new ListItem(11, R.drawable.pic11, "Zhong Yuanzhong and Calligraphy in the Yuan Dynasty (钟元忠和元代书法)", "Zhong Yuanzhong was a prominent calligrapher during the Yuan Dynasty (1271–1368 CE) in China. He excelled in different calligraphic styles, including Regular Script, Running Script, and Cursive Script. Zhong's calligraphy exemplified the characteristics of the Yuan Dynasty, combining elegance, simplicity, and a touch of boldness. His influential works influenced later generations and left a lasting impact on Chinese calligraphic art."));
        this.itemList.add(new ListItem(12, R.drawable.pic12, "Ming-Qing Calligraphy (明清书法)", "The Ming and Qing Dynasties (1368–1912 CE) witnessed a flourishing period of calligraphy in China. The calligraphic styles of this era were diverse, with prominent calligraphers such as Wen Zhengming, Dong Qichang, and Wang Duo. Calligraphy during the Ming and Qing Dynasties emphasized a balance between tradition and innovation, drawing inspiration from ancient scripts while incorporating personal expressions and innovations. The calligraphy of this period reflects the cultural and artistic developments of the time, leaving behind a rich legacy."));
        this.itemList.add(new ListItem(13, R.drawable.pic13, "Revolutionary Calligraphy (革命书法)", "Revolutionary Calligraphy refers to the calligraphic art produced during the Chinese Revolution and the subsequent periods of political upheaval in the 20th century. Calligraphers during this time used their artistic skills to express revolutionary ideals and patriotic sentiments. Revolutionary Calligraphy became a powerful tool for propaganda and mobilization, promoting the revolutionary spirit and rallying the masses. This form of calligraphy played a significant role in shaping the socio-political landscape of modern China."));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ListAdapter adapter = new ListAdapter(this.itemList);
        recyclerView.setAdapter(adapter);
    }

    public void onItemClick(View view) {
        int position = ((Integer) view.getTag()).intValue();
        ListItem item = this.itemList.get(position);
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("item_id", item.getId());
        intent.putExtra("item_title", item.getTitle());
        intent.putExtra("item_description", item.getDescription());
        startActivity(intent);
    }
}
