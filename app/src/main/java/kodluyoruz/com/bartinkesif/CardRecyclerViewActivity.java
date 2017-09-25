package kodluyoruz.com.bartinkesif;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardRecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ReplikAdapter adapter;
    //ArrayList<Replik>replikListesi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_recylerview);

       // replikListesiniDoldur();
        recyclerView=(RecyclerView)findViewById(R.id.my_recycler_view) ;
        adapter=new ReplikAdapter(this,R.layout.item_card_replik);
        recyclerView.setAdapter(adapter);


        //ActionBar Ekleme
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Bartın ve Tarihi");

        actionBar.show();



    }



//    private void replikListesiniDoldur() {
//        replikListesi=new ArrayList<Replik>();
//        replikListesi.add(new Replik(R.drawable.bartin,"BEn varya benn"));
//        replikListesi.add(new Replik(R.drawable.bartin,"BU 2 BEn varya benn"));
//    }


}
