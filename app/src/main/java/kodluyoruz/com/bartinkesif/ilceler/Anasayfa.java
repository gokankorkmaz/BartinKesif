package kodluyoruz.com.bartinkesif.ilceler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;

import kodluyoruz.com.bartinkesif.MainActivity;
import kodluyoruz.com.bartinkesif.R;

import static java.security.AccessController.getContext;


public class Anasayfa extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_recylerview2);


        TextView yourTextview = (TextView)findViewById(R.id. yourTextview);
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
