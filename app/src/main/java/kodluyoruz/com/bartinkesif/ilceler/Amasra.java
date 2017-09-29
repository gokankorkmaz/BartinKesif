package kodluyoruz.com.bartinkesif.ilceler;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import kodluyoruz.com.bartinkesif.MainActivity;
import kodluyoruz.com.bartinkesif.R;


public class Amasra extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amasra);


        TextView textView = (TextView)findViewById(R.id.textView);


    }
    @Override
    public void onBackPressed() {
        Intent niyet = new Intent(Amasra.this,MainActivity.class);
        startActivity(niyet);
    }


}
