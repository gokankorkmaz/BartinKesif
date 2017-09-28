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
    ReplikAdapter adapter;
    ArrayList<Replik> replikListesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detay);
        replikListesiniDoldur();
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        adapter = new ReplikAdapter(replikListesi, this, R.layout.item_card_replik);
        recyclerView.setAdapter(adapter);


        //ActionBar Ekleme
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Bartın ve Tarihi");
        actionBar.show();


    }

    private void replikListesiniDoldur() {
        replikListesi = new ArrayList<Replik>();
        replikListesi.add(new Replik(R.drawable.bartin, "Bartın ve Tarihi"));
        replikListesi.add(new Replik(R.drawable.merkez, "İLçe 1 "));
        replikListesi.add(new Replik(R.drawable.merkez, "İlçe 2 "));
        replikListesi.add(new Replik(R.drawable.merkez, "İlçe 3 "));
    }


}
