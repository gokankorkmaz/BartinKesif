package kodluyoruz.com.bartinkesif.ilceler;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import kodluyoruz.com.bartinkesif.MainActivity;
import kodluyoruz.com.bartinkesif.R;


public class Anasayfa extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_recylerview2);


        TextView yourTextview = (TextView)findViewById(R.id.textView);
        //yourTextview.setMovementMethod(new ScrollingMovementMethod());
        //ActionBar Ekleme
//        ActionBar actionBar=getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setTitle("Bartın ve Tarihi");
//
//        actionBar.show();

    }
    @Override
    public void onBackPressed() {
        Intent niyet = new Intent(Anasayfa.this,MainActivity.class);
        startActivity(niyet);
    }

}
