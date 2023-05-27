package com.example.myapplication.ui.home;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.myapplication.LoginActivity;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private Button button_lk;
    private Button button_sc;
    private Button button_call;
    private Button button_3d;
    private WebView webView;
    FirebaseDatabase pDB = FirebaseDatabase.getInstance("https://my-application-78cd2-default-rtdb.europe-west1.firebasedatabase.app");
    TextView People;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        button_lk = root.findViewById(R.id.button_lk);
        button_lk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (FirebaseAuth.getInstance().getCurrentUser() == null)
                    sendUserToLogin();
                else
                    Navigation.findNavController(view).navigate(R.id.action_nav_home_to_nav_slideshow);
            }
        });

        button_sc = root.findViewById(R.id.button);
        button_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_nav_gallery);

            }
        });

        People = root.findViewById(R.id.text_home_down);
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

        button_call = root.findViewById(R.id.button_call);
        button_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "tel:+79681186130";
//                String web = "https://my.matterport.com/show/?m=85yfULzGgJa&hl=1&back=1";
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(phone));
//                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
                startActivity(intent);
            }
        });

//        button_3d = root.findViewById(R.id.button_3d);
//        button_3d.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String web = "https://my.matterport.com/show/?m=85yfULzGgJa&hl=1&back=1";
//                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
//                startActivity(intent1);
//            }
//        });

//        Button button_3d = root.findViewById(R.id.button_3d);
//        button_3d.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                webView.loadUrl("https://my.matterport.com/show/?m=85yfULzGgJa&hl=1");
//            }
//        });

        Button button_3d = root.findViewById(R.id.button_3d);
        button_3d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_nav_web);
            }
        });

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;


    }
//@Override
//public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//    super.onViewCreated(view, savedInstanceState);
//
//    view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            getFragmentManager().beginTransaction().replace(R.id.container,
//                    new button()).addToBackStack(null).commit();
//
//        }
//    });

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void sendUserToLogin() {
        Intent loginIntent = new Intent(getActivity() ,LoginActivity.class);
//        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);;
    }


}