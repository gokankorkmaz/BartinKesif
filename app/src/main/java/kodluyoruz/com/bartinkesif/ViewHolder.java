package kodluyoruz.com.bartinkesif;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.makeramen.roundedimageview.RoundedImageView;

import org.w3c.dom.Text;

/**
 * Created by GokhanKorkmaz on 24.09.2017.
 */

/**
 * RecyclerView.ViewHolder sınıfından extends ediyoruz
 * alt+enter tuşlarıyla süper metodunu ekliyoruz ve hata mesajı gidiyor.
 * ImageView ve TextView objelerimi ekliyorum ve itemView.findViewById() diyip ogeleri baglıyoruz.
 * Sonraki Adım:Adaptor olusturma
 */

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        RoundedImageView foto;
        TextView replik;
CardView cardView;

    public ViewHolder(final View itemView) {
        super(itemView);


        //Burada yukarıda tanımladıgım ve layout dosyamda olan ogelere erisiyorum

        replik = (TextView) itemView.findViewById(R.id.replik);
        foto = (RoundedImageView) itemView.findViewById(R.id.foto);
        cardView=(CardView) itemView.findViewById(R.id.cardView);
        cardView.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent niyet=new Intent(view.getContext(),CardRecyclerViewActivity2.class);
        view.getContext().startActivity(niyet);
     }
}
