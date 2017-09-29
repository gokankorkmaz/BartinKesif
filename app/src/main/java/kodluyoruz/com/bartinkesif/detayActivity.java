package kodluyoruz.com.bartinkesif;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class detayActivity extends AppCompatActivity {
    CardView cardView;
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Item> replikListesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anasayfa);
        replikListesiniDoldur();
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        adapter = new Adapter(replikListesi, this, R.layout.item_card_replik);
        recyclerView.setAdapter(adapter);


        //ActionBar Ekleme
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Bartın ve Tarihi");
        actionBar.show();


    }

    private void replikListesiniDoldur() {
        replikListesi = new ArrayList<Item>();
        replikListesi.add(new Item(R.drawable.bartin, "Bartın ve Tarihi"));
        replikListesi.add(new Item(R.drawable.merkez, "İLçe 1 "));
        replikListesi.add(new Item(R.drawable.merkez, "İlçe 2 "));
        replikListesi.add(new Item(R.drawable.merkez, "İlçe 3 "));
    }


}
