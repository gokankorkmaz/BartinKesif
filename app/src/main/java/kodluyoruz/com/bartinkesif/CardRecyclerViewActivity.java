package kodluyoruz.com.bartinkesif;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;


public class CardRecyclerViewActivity extends AppCompatActivity  {
    CardView cardView;
    RecyclerView recyclerView;
    ReplikAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_recylerview);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        adapter = new ReplikAdapter(this, R.layout.item_card_replik);
        recyclerView.setAdapter(adapter);



        //ActionBar Ekleme
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Bartın ve Tarihi");
        actionBar.show();



    }



}
