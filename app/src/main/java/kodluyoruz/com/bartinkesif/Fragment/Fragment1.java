package kodluyoruz.com.bartinkesif.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kodluyoruz.com.bartinkesif.Adapter.Adapter;
import kodluyoruz.com.bartinkesif.Adapter.Item;
import kodluyoruz.com.bartinkesif.R;


public class Fragment1 extends Fragment {
    CardView cardView;
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Item> itemmListesi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout1, container, false);
        itemListesiniDoldur();
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        adapter = new Adapter(itemmListesi, getActivity(), R.layout.item_card_replik);

        recyclerView.setAdapter(adapter);

        return view;
    }


    private void itemListesiniDoldur() {
        itemmListesi = new ArrayList<Item>();
        itemmListesi.add(new Item(R.drawable.bartin, "Bartın ve Tarihi"));
        itemmListesi.add(new Item(R.drawable.merkez, "Merkez"));
        itemmListesi.add(new Item(R.drawable.bartin, "Amasra"));
        itemmListesi.add(new Item(R.drawable.merkez, "Kurucaşile"));
        itemmListesi.add(new Item(R.drawable.merkez, "Ulus"));
    }

}
