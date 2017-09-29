package kodluyoruz.com.bartinkesif;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
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
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    CardView cardView;
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Item> replikListesi;
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

        replikListesiniDoldur();
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        adapter = new Adapter(replikListesi, this, R.layout.item_card_replik);
        recyclerView.setAdapter(adapter);



    }

    private void replikListesiniDoldur() {
        replikListesi = new ArrayList<Item>();
        replikListesi.add(new Item(R.drawable.bartin, "Bartın ve Tarihi"));
        replikListesi.add(new Item(R.drawable.merkez, "İLçe 1 "));
        replikListesi.add(new Item(R.drawable.merkez, "İlçe 2 "));
        replikListesi.add(new Item(R.drawable.merkez, "İlçe 3 "));
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

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.ilceler) {
            Intent niyet = new Intent(MainActivity.this, MainActivity.class);
            startActivity(niyet);
        } else if (id == R.id.goller) {
            Fragment1 fragment1=new Fragment1();
            fragmentTransaction.replace(R.id.content_frame,fragment1);
            fragmentTransaction.commit();
        } else if (id == R.id.antik) {
            Fragment2 fragment2=new Fragment2();
            fragmentTransaction.replace(R.id.content_frame,fragment2);
            fragmentTransaction.commit();
        } else if (id == R.id.cami) {
            Fragment3 fragment3=new Fragment3();
            fragmentTransaction.replace(R.id.content_frame,fragment3);
            fragmentTransaction.commit();
        } else if (id == R.id.halkKultur) {

        }else if (id == R.id.yiyecek) {

        }else if (id == R.id.universite) {

        }else if (id == R.id.diger) {

        }else if (id == R.id.iletisim) {

        }else if (id == R.id.hakkinda) {
            Toast.makeText(this, "asdfasfaf", Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
