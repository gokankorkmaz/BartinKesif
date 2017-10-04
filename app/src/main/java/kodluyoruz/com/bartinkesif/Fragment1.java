package kodluyoruz.com.bartinkesif;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by GokhanKorkmaz on 28.09.2017.
 */

public class Fragment1 extends Fragment {
     CardView cardView;
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Item> replikListesi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.layout1,container,false);
        replikListesiniDoldur();
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        adapter=new Adapter(replikListesi,getActivity(),R.layout.item_card_replik);


       // adapter = new Adapter(replikListesi, this, R.layout.item_card_replik);
        recyclerView.setAdapter(adapter);

        return view;
    }



    private void replikListesiniDoldur() {
        replikListesi = new ArrayList<Item>();
        replikListesi.add(new Item(R.drawable.bartin, "Bartın ve Tarihi"));
        replikListesi.add(new Item(R.drawable.merkez, "Merkez"));
        replikListesi.add(new Item(R.drawable.bartin, "Amasra"));
        replikListesi.add(new Item(R.drawable.merkez, "Kurucaşile"));
        replikListesi.add(new Item(R.drawable.merkez, "Ulus"));
    }

}
