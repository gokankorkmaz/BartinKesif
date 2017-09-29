package kodluyoruz.com.bartinkesif;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;

import kodluyoruz.com.bartinkesif.ilceler.Amasra;
import kodluyoruz.com.bartinkesif.ilceler.Anasayfa;
import kodluyoruz.com.bartinkesif.ilceler.Kurucasile;
import kodluyoruz.com.bartinkesif.ilceler.Merkez;
import kodluyoruz.com.bartinkesif.ilceler.Ulus;

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
    TextView textView;
    CardView cardView;

    public ViewHolder(final View itemView) {
        super(itemView);


        //Burada yukarıda tanımladıgım ve layout dosyamda olan ogelere erisiyorum

        textView = (TextView) itemView.findViewById(R.id.textView);
        foto = (RoundedImageView) itemView.findViewById(R.id.foto);
        cardView = (CardView) itemView.findViewById(R.id.cardView);
        cardView.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        //Adaptörün pozisyonunu aldım.Hangi cardview'a tıklandıgını anlayıp ona gore islem yaptırıyorum
        int position = getAdapterPosition();
        switch (position) {
            case 0:
                Intent niyet0 = new Intent(view.getContext(), Anasayfa.class);
                view.getContext().startActivity(niyet0);
                break;
            case 1:
                Intent niyet1 = new Intent(view.getContext(), Merkez.class);
                view.getContext().startActivity(niyet1);
                break;
            case 2:
                Intent niyet2 = new Intent(view.getContext(), Amasra.class);
                view.getContext().startActivity(niyet2);
                break;
            case 3:
                Intent niyet3 = new Intent(view.getContext(), Kurucasile.class);
                view.getContext().startActivity(niyet3);

                break;
            case 4:
                Intent niyet4 = new Intent(view.getContext(), Ulus.class);
                view.getContext().startActivity(niyet4);
                break;

        }
//        Intent niyet=new Intent(view.getContext(),Anasayfa.class);
//        view.getContext().startActivity(niyet);
    }
}
