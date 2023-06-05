package com.juangabriel.singletonpattern;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (toolbar!=null){
            setSupportActionBar(toolbar);

            toolbar.setTitle(R.string.toolbar_title);
            toolbar.setSubtitle(R.string.toolbar_subtitle);

        }


        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){

            public void onDrawerOpened(View v){
                super.onDrawerOpened(v);
                Log.d(TAG, "onDrawerOpened: ");

                User u = User.getUser();
                u.setName("Jotabé");
                Log.d(TAG, "onDrawerOpened: "+u);

            }

            public void onDrawerClosed(View v){
                super.onDrawerClosed(v);

                User u = User.getUser();
                Log.d(TAG, "onDrawerClosed: "+u);
                Log.d(TAG, "onDrawerClosed: ");
            }
        };
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();


        NavigationView navView = (NavigationView) findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                drawerLayout.closeDrawers();

                switch (item.getItemId()){
                    case R.id.drama:
                        ContentFragment fragment = new ContentFragment();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment, fragment);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        Log.d(TAG, "onNavigationItemSelected: drama");
                        return  true;
                    case R.id.comedy:
                        Log.d(TAG, "onNavigationItemSelected: comedia");
                        return true;
                    case R.id.mistery:
                        Log.d(TAG, "onNavigationItemSelected: misterio");
                        return true;
                    default:
                        return false;
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }
}
