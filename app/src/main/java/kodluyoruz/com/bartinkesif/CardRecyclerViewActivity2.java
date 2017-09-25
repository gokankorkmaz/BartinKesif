package kodluyoruz.com.bartinkesif;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;


public class CardRecyclerViewActivity2 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_recylerview2);


        //ActionBar Ekleme
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Bartın ve Tarihi");

        actionBar.show();




        TextView yourTextview = (TextView)findViewById(R.id. yourTextview);
        yourTextview.setMovementMethod(new ScrollingMovementMethod());


//                <RoundedImageView
//        android:id="@+id/foto"
//        android:layout_width="match_parent"
//        android:layout_height="200dp"
//        android:scaleType="centerCrop"
//        android:src="@drawable/bartin"
//        app:riv_corner_radius_bottom_left="16dp"
//        app:riv_corner_radius_bottom_right="16dp" />
//





    }






}
