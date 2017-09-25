package kodluyoruz.com.bartinkesif;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

public class ViewHolder extends RecyclerView.ViewHolder {
    RoundedImageView foto;
    TextView replik;



    public ViewHolder(View itemView) {
        super(itemView);

        //Burada yukarıda tanımladıgım ve layout dosyamda olan ogelere erisiyorum

        replik=(TextView)itemView.findViewById(R.id.replik);
        foto=(RoundedImageView) itemView.findViewById(R.id.foto);
    }


}
