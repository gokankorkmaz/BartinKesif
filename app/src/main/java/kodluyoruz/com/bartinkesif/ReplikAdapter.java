package kodluyoruz.com.bartinkesif;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import static kodluyoruz.com.bartinkesif.R.id.replik;

/**
 * Created by GokhanKorkmaz on 24.09.2017.
 */

/**
 * RecyclerView.ReplikAdapter sınıfından extends ediyoruz
 * Ayrıca bir önceki adımda oluşturduğumuz ItemViewHolder sınıfımızı <> işretleri arasında yazıyoruz.
 * Adapterimizde Replik listesine ihtiyacımız var.Daha sonra Adapterimizin constructor’ını ekliyoruz
 * (Sağ tık/Genarate/Generate Constructor)
 * <p>
 * onCreateViewHolder metodu içine LayoutInflater kullanarak bir view objesi oluşturuyoruz.
 * Parametre olarak daha önce oluşturduğumuz layout xml ‘i veriyoruz.
 * <p>
 * ViewHolder sınıfımızdan bir obje oluşturuyoruz ve parametre olarak yukarda yaptığımız view’i veriyoruz.
 * Dikkat ettiyseniz bu metod geriye ItemViewHolder objesi döndüryor bizde türettiğimiz
 * ViewHolder’ı retur itemViewHolder; diyerek döndürüyoruz.
 */
public class ReplikAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<Replik> replikListesi;

    Context context;
    int itemLayout;

    public ReplikAdapter(ArrayList<Replik> replikListesi, Context context, int itemLayout) {
        this.replikListesi = replikListesi;
        this.context = context;
        this.itemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_card_replik, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Replik replik = replikListesi.get(position);

        holder.replik.setText(replik.getReplik());
        holder.replik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Buranın normalde bu sekilde calisması lazım cardview icinde resim ve yazı oldugu icin alta gerek yok KONTROL

//                Intent intent = new Intent(view.getContext(), CardRecyclerViewActivity2.class);
//                view.getContext().startActivity(intent);
            }
        });


    }


    //TODO Bu kütüphaneyi navigatordaki resim için indirmistim kaldırınca hata verecek
    //    compile 'de.hdodenhof:circleimageview:2.1.0'


    @Override
    public int getItemCount() {
        return  replikListesi.size();
    }
}
