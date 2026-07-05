package id.blackbear.vulnapk;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

/* loaded from: classes3.dex */
public class MainActivity extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle toggle;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.navigationView = (NavigationView) findViewById(R.id.navigation_view);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, this.drawerLayout, R.string.open, R.string.close);
        this.toggle = actionBarDrawerToggle;
        this.drawerLayout.addDrawerListener(actionBarDrawerToggle);
        this.toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: id.blackbear.vulnapk.MainActivity.1
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_item1 /* 2131231000 */:
                        Intent menu = new Intent(MainActivity.this, (Class<?>) MainActivity.class);
                        MainActivity.this.startActivity(menu);
                        break;
                    case R.id.menu_item2 /* 2131231001 */:
                        Intent storage = new Intent(MainActivity.this, (Class<?>) InsecureStorageActivity.class);
                        MainActivity.this.startActivity(storage);
                        break;
                    case R.id.menu_item3 /* 2131231002 */:
                        Intent crypto = new Intent(MainActivity.this, (Class<?>) InsecureCryptoActivity.class);
                        MainActivity.this.startActivity(crypto);
                        break;
                    case R.id.menu_item4 /* 2131231003 */:
                        Intent web = new Intent(MainActivity.this, (Class<?>) VulnWeb.class);
                        MainActivity.this.startActivity(web);
                        break;
                    case R.id.menu_item5 /* 2131231004 */:
                        Intent settings = new Intent(MainActivity.this, (Class<?>) SettingsActivity.class);
                        MainActivity.this.startActivity(settings);
                        break;
                    case R.id.menu_item6 /* 2131231005 */:
                        Intent root = new Intent(MainActivity.this, (Class<?>) RootActivity.class);
                        MainActivity.this.startActivity(root);
                        break;
                }
                MainActivity.this.drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        if (this.toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
