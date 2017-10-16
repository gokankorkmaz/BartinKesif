package kodluyoruz.com.bartinkesif.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kodluyoruz.com.bartinkesif.R;

/**
 * Created by GokhanKorkmaz on 24.09.2017.
 */

/**
 * RecyclerView.Adapter sınıfından extends ediyoruz
 * Ayrıca bir önceki adımda oluşturduğumuz ItemViewHolder sınıfımızı <> işretleri arasında yazıyoruz.
 * Adapterimizde Item listesine ihtiyacımız var.Daha sonra Adapterimizin constructor’ını ekliyoruz
 * (Sağ tık/Genarate/Generate Constructor)
 * onCreateViewHolder metodu içine LayoutInflater kullanarak bir view objesi oluşturuyoruz.
 * Parametre olarak daha önce oluşturduğumuz layout xml ‘i veriyoruz.
 * ViewHolder sınıfımızdan bir obje oluşturuyoruz ve parametre olarak yukarda yaptığımız view’i veriyoruz.
 * Dikkat ettiyseniz bu metod geriye ItemViewHolder objesi döndüryor bizde türettiğimiz
 * ViewHolder’ı retur itemViewHolder; diyerek döndürüyoruz.
 */
public class SelaleAdapter extends RecyclerView.Adapter<SelaleHolder> {
    ArrayList<Item> itemList;
    Context context;
    int itemLayout;

    public SelaleAdapter(ArrayList<Item> itemList, Context context, int itemLayout) {
        this.itemList = itemList;
        this.context = context;
        this.itemLayout = itemLayout;
    }

    @Override
    public SelaleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_card_replik, parent, false);

        return new SelaleHolder(v);
    }

    @Override
    public void onBindViewHolder(SelaleHolder holder, int position) {
        Item item = itemList.get(position);


        //TODO Farklı boyutlar icin resource dosyaları ayarla. hdpi,mdpi,ldpi,xldpi


        holder.textView.setText(item.getReplik());
        holder.foto.setImageResource(item.getFoto());
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    public int getItemCount() {
        return  itemList.size();
    }
}
