package kodluyoruz.com.bartinkesif.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kodluyoruz.com.bartinkesif.Adapter.Adapter;
import kodluyoruz.com.bartinkesif.Adapter.AntikAdapter;
import kodluyoruz.com.bartinkesif.Adapter.Item;
import kodluyoruz.com.bartinkesif.Adapter.SelaleAdapter;
import kodluyoruz.com.bartinkesif.R;


public class FragmentGoller extends Fragment {
    RecyclerView recyclerView;
    SelaleAdapter selaleAdapter;
    ArrayList<Item> itemmListesi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.goller_home_fragment, container, false);
        itemListesiniDoldur();
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        selaleAdapter = new SelaleAdapter(itemmListesi, getActivity(), R.layout.item_card_replik);

        recyclerView.setAdapter(selaleAdapter);

        return view;
    }


    private void itemListesiniDoldur() {
        itemmListesi = new ArrayList<Item>();
        itemmListesi.add(new Item(R.drawable.ulukaya, "Ulukaya Şelalesi"));
        itemmListesi.add(new Item(R.drawable.golderesi, "Gölderesi Şelalesi"));
        itemmListesi.add(new Item(R.drawable.aksu, "Aksu Şelalesi"));
//        itemmListesi.add(new Item(R.drawable.merkez, "Kurucaşile"));
//        itemmListesi.add(new Item(R.drawable.merkez, "Ulus"));
    }

}
