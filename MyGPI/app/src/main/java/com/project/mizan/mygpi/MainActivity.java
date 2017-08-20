package com.project.mizan.mygpi;

import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PersistableBundle;
import android.provider.Settings;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Handler;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout)findViewById(R.id.ID_NavigationLayout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);

        drawerLayout.setDrawerListener(actionBarDrawerToggle);

//        ---Geu user information from GetUserInformation.java Class by Shared Preference-----------------------------------------------------------------------------------------

        SharedPreferences userInformation = getSharedPreferences("UserInformation", Context.MODE_PRIVATE);
        String userDept = userInformation.getString("UserDept","");
        String userSemester = userInformation.getString("UserSemester","");
        String userShift = userInformation.getString("UserShift","");
//
//        Toast.makeText(MainActivity.this, "UserDept is: "+userDept, Toast.LENGTH_SHORT).show();
//        Toast.makeText(MainActivity.this, "UserSemester is: "+userSemester, Toast.LENGTH_SHORT).show();
//        Toast.makeText(MainActivity.this, "UserShift is: "+userShift, Toast.LENGTH_SHORT).show();


//---------------------------------------------------------------------------------------------------------------------------------
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.ID_Main_Continer,new TodayClass());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Today Class");




//---------------------Navigation View Code Here-------------------------
        navigationView = (NavigationView) findViewById(R.id.ID_Navigation_View);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ID_todayClassItem:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.ID_Main_Continer,new TodayClass());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Today Class");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.ID_allClassRutineItem:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.ID_Main_Continer,new AllClassRutine());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("All Class Rutine");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.ID_TeacherListItem:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.ID_Main_Continer,new TeacherList());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("All Teacher List");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.ID_myScheduleItem:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.ID_Main_Continer,new MySchedule());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("My Schedule");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.ID_aboutGpiItem:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.ID_Main_Continer,new AboutGPI());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("About GPI");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;
                }


                return false;
            }
        });

    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            AlertDialog.Builder exitAlert = new AlertDialog.Builder(this);
            exitAlert.setMessage("Comming Soon");
            //exitAlert.setTitle("Goplogonj Polytechnic Institute");
            exitAlert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    System.exit(0);

                }
            });
//            exitAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                }
//            });

            AlertDialog ad = exitAlert.create();
            ad.show();
            return true;
        }
        if (id == R.id.action_about) {
            Intent intent = new Intent(MainActivity.this,Developer.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder exitAlert = new AlertDialog.Builder(this);
        exitAlert.setMessage("Are you sure you want to exit?");
        //exitAlert.setTitle("Goplogonj Polytechnic Institute");
        exitAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);

            }
        });
        exitAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        AlertDialog ad = exitAlert.create();
        ad.show();


    }
}
