package com.example.myapplication;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.google.ar.sceneform.ux.ArFragment;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final double MIN_OPENGL_VERSION = 3.0;

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private Button button_r;
    private Button btnCabinet;
    private Button button_sc;
    private Button button_3d;
    private String uri;

    private FirebaseAuth mAuth;
    FirebaseDatabase db;
    DatabaseReference users;

    private FirebaseUser mCurrentUser;
    private FragmentManager mFragmentManager;

    private Button btn;
    private WebView webView;

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;

    FirebaseDatabase pDB = FirebaseDatabase.getInstance("https://my-application-78cd2-default-rtdb.europe-west1.firebasedatabase.app");
    TextView People;

    ArFragment arFragment;


//    VideoView videoPlayer;



    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.fragment_train);
//
//        videoPlayer = findViewById(R.id.videoPlayer);
//        Uri myVideoUri= Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.video_sport);
//        videoPlayer.setVideoURI(myVideoUri);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


//        web = (WebView) findViewById(R.id.webview);
//        web.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
//                return super.shouldOverrideKeyEvent(view, event);
//            }
//
//            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//                return false;
//            }
//        });
//
//        button_3d.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                web.loadUrl("https://my.matterport.com/show/?m=85yfULzGgJa&hl=1&back=1");
//            }
//        });

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("http://api.whatsapp.com/send?phone=79681186130"));
                sendIntent.setPackage("com.whatsapp");
                try
                {
                    startActivity(sendIntent);
                } catch (Exception e) {
//                    Snackbar.make(view, "Whatsapp not found", Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
                    String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                    appPackageName = "com.whatsapp";
                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                    } catch (android.content.ActivityNotFoundException anfe) {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                    }
                }
            }
        });


        db = FirebaseDatabase.getInstance();
        mAuth = FirebaseAuth.getInstance();
        mCurrentUser = mAuth.getCurrentUser();
        users = db.getReference("Users");
        btnCabinet = findViewById(R.id.button_lk);
        btnCabinet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (FirebaseAuth.getInstance().getCurrentUser() == null)
                    sendUserToLogin();
                else
                    Navigation.findNavController(view).navigate(R.id.action_nav_home_to_nav_slideshow);;
            }
        });

        FragmentManager fragmentManager = getSupportFragmentManager();
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.nav_instructor, R.id.nav_us, R.id.nav_call, R.id.nav_train)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        People = findViewById(R.id.text_home_down);
        DatabaseReference dbPeople = pDB.getReference("/People");
        dbPeople.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String pT = snapshot.getValue(String.class);
               People.setText(""+ pT);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });


        button_r = findViewById(R.id.button_call);
        int requestCode = 0;
        button_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button_call && ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    Log.d("STATE", "Call Button DOES NOT WORK");
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, requestCode);
                    return;
                }
                Log.d("STATE", "Call Button DOES WORK");
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+79681186130"));
                startActivity(callIntent);
            }

            
        });


        button_3d = findViewById(R.id.button_3d);
//        button_3d.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String web = "https://my.matterport.com/show/?m=85yfULzGgJa&hl=1&back=1";
//                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
//                startActivity(intent1);
//            }
//        });


//        webView=(WebView) findViewById(R.id.webview);
//        btn=(Button)findViewById(R.id.btn);
//
//        webView.getSettings().setJavaScriptEnabled(true);
////        webView.loadUrl("https://my.matterport.com/show/?m=85yfULzGgJa&hl=1");
//        webView.setWebViewClient(new WebViewController());
//
//        button_3d.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                webView.loadUrl("https://my.matterport.com/show/?m=85yfULzGgJa&hl=1");
//            }
//        });






        button_sc = findViewById(R.id.button);
        button_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_nav_gallery);
            }
        });



//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int itemId = item.getItemId();
//                replaceFragment(FRAGMENT_GAL);
//                drawer.closeDrawers();
//                return true;
//            }
//        });
    }

//        public <view> void play(View view){
//            videoPlayer.start();
//        }
//        public void pause(View view){
//            videoPlayer.pause();
//        }
//        public void stop(View view){
//            videoPlayer.stopPlayback();
//            videoPlayer.resume();
//        }


//    private void replaceFragment(String neededToShowFragmentTag) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        Fragment neededToShowFragment = fragmentManager.findFragmentByTag(neededToShowFragmentTag);
//
//        if (neededToShowFragment == null) {
//            switch (neededToShowFragmentTag) {
//                case "fragment_gal":
//                neededToShowFragment = new GalleryFragment();
//                break;
//            }
//            if (fragmentManager.getFragments() == null) {
//                fragmentTransaction.add(R.id.fragment_container, neededToShowFragment, neededToShowFragmentTag);
//
//            } else {
//                fragmentTransaction.replace(R.id.fragment_container, neededToShowFragment, neededToShowFragmentTag);
//            }
//            fragmentTransaction.hide(neededToShowFragment);
//            fragmentTransaction.commit();
//        }
//    }



//    public void addListenerOnButton () {
//        button_r = (Button) findViewById(R.id.button_id);
//        button_r.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Navigation.findNavController(view).navigate(androidx.fragment.R.id.button_id);
//                    }
//                }
//        );
//    }

//    private void showLoginWindow() {
//        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//        dialog.setTitle("Sign In");
//        dialog.setMessage("Enter the phone number");
//
//        LayoutInflater inflater = LayoutInflater.from(this);
//        View login_window = inflater.inflate(R.layout.login_window, null);
//        dialog.setView(login_window);
//
//        final EditText phone = login_window.findViewById(R.id.phoneField);
//
//        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                dialogInterface.dismiss();
//            }
//        });
//
//        dialog.setPositiveButton("Log In", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                if (TextUtils.isEmpty(phone.getText().toString())) {
//                    //Snackbar.make(root, "Enter the phone number", Snackbar.LENGTH_SHORT).show();
//                    return;
//                }
//
//            }
//            PhoneAuthOptions options =
//                    PhoneAuthOptions.newBuilder(mAuth)
//                        .setPhoneNumber(phone.getText().toString())
//                        .setTimeout(60L, TimeUnit.SECONDS)
//                        .setActivity(MainActivity.this)
//                       .setCallbacks(mCallbacks)
//                        .build();
//
//
//
//
//        });
//
//        dialog.show();
//    }

    private void sendUserToLogin() {
        Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        finish();
    }
    private void sendUserToAr() {
        Intent arIntent = new Intent(MainActivity.this, ArActivity.class);
        startActivity(arIntent);
    }

    ViewGroup container;

    private void sendToSc() {
//        GalleryFragment scFragment = new GalleryFragment();
//        scFragment.getView().findViewById(R.id.nav_gallery);
//        FragmentTransaction trans = getFragmentManager().beginTransaction();
//        trans.add();
//        trans.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }

    private boolean appInstalledOrNot(String uri) {
        PackageManager pm = getPackageManager();
        boolean app_installed;
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            app_installed = true;
        }
        catch (PackageManager.NameNotFoundException e) {
            app_installed = false;
        }
        return app_installed;
    }

}