package kodluyoruz.com.bartinkesif;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import kodluyoruz.com.bartinkesif.Adapter.Adapter;
import kodluyoruz.com.bartinkesif.Adapter.Item;
import kodluyoruz.com.bartinkesif.Fragment.Fragment1;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    CardView cardView;
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Item> itemmListesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        itemListesiniDoldur();
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        adapter = new Adapter(itemmListesi, this, R.layout.item_card_replik);
        recyclerView.setAdapter(adapter);

    }

    private void itemListesiniDoldur() {
        itemmListesi = new ArrayList<Item>();
        itemmListesi.add(new Item(R.drawable.bartin, "Bartın ve Tarihi"));
        itemmListesi.add(new Item(R.drawable.merkez, "Merkez"));
        itemmListesi.add(new Item(R.drawable.amasra, "Amasra"));
        itemmListesi.add(new Item(R.drawable.kurucasile, "Kurucaşile"));
        itemmListesi.add(new Item(R.drawable.ulus, "Ulus"));
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.ilceler) {

            Fragment1 fragment1 = new Fragment1();
            fragmentTransaction.replace(R.id.content_frame, fragment1);
            fragmentTransaction.commit();
        } else if (id == R.id.goller) {
            //TODO

        } else if (id == R.id.antik) {
            //TODO


        } else if (id == R.id.cami) {
            //TODO


        } else if (id == R.id.halkKultur) {

        } else if (id == R.id.yiyecek) {

        } else if (id == R.id.universite) {

        } else if (id == R.id.diger) {


        } else if (id == R.id.hakkinda) {
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
