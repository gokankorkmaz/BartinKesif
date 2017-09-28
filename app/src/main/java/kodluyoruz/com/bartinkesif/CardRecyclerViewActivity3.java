package kodluyoruz.com.bartinkesif;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;


public class CardRecyclerViewActivity3 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_recylerview3);


        //ActionBar Ekleme
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Bartın ve Tarihi");

        actionBar.show();

//TODO TextViewların adını degistir


        TextView yourTextview = (TextView)findViewById(R.id. yourTextview);
        yourTextview.setMovementMethod(new ScrollingMovementMethod());


// TODO Imageview sabit olmayaak oda yazıyla beraber alta inecek




    }






}
