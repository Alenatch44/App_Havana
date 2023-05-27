package com.example.myapplication.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
//import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavControllerVisibleEntries;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavControllerKt;

import com.example.myapplication.LoginActivity;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentSlideshowBinding;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class SlideshowFragment extends Fragment {


    private FragmentSlideshowBinding binding;
    String User;
    TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        if (FirebaseAuth.getInstance().getCurrentUser() != null) {
            SlideshowViewModel slideshowViewModel =
                    new ViewModelProvider(this).get(SlideshowViewModel.class);


            binding = FragmentSlideshowBinding.inflate(inflater, container, false);
            View root = binding.getRoot();

            if ((FirebaseAuth.getInstance().getCurrentUser().getDisplayName().length() == 1) ||
                    (FirebaseAuth.getInstance().getCurrentUser().getDisplayName().length() == 0))
                User = FirebaseAuth.getInstance().getCurrentUser().getPhoneNumber();
            else
                User = FirebaseAuth.getInstance().getCurrentUser().getDisplayName();
            textView = root.findViewById(R.id.text_slideshow);
            textView.setText("" + User);


            Button button_rr = root.findViewById(R.id.button_exit);
            button_rr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FirebaseAuth.getInstance().signOut();
                    Navigation.findNavController(view).navigate(R.id.action_nav_slideshow_to_nav_home);
                }
            });
            Button button_train = root.findViewById(R.id.button_1);
            button_train.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Navigation.findNavController(view).navigate(R.id.action_nav_slideshow_to_nav_train);
                }
            });

            Button button_gallery = root.findViewById(R.id.button_2);
            button_gallery.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Navigation.findNavController(view).navigate(R.id.action_nav_slideshow_to_nav_gallery);
                }
            });

            Button button_ins = root.findViewById(R.id.button_3);
            button_ins.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Navigation.findNavController(view).navigate(R.id.action_nav_slideshow_to_nav_instructor);
                }
            });

            Button button_sport = root.findViewById(R.id.button_4);
            button_sport.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Navigation.findNavController(view).navigate(R.id.action_nav_slideshow_to_nav_call);
                }
            });



            Button button_edit = root.findViewById(R.id.text_2_slideshow);
            button_edit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Navigation.findNavController(view).navigate(R.id.action_nav_slideshow_to_nav_edit_lk);

                }
            });

            final TextView textView = binding.textSlideshow;
            slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
            return root;
        }
        Intent loginIntent = new Intent(getActivity() ,LoginActivity.class);
        startActivity(loginIntent);
        return null;
    }





    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}