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


        TextView yourTextview = (TextView)findViewById(R.id. yourTextview);
        //yourTextview.setMovementMethod(new ScrollingMovementMethod());


    }


}
