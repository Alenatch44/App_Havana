package com.example.myapplication.ui.edit_lk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.myapplication.LoginActivity;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentEditLkBinding;
import com.example.myapplication.ui.gallery.GalleryViewModel;
import com.example.myapplication.ui.slideshow.SlideshowFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserProfileChangeRequest;

public class Edit_lkFragment extends Fragment {
    private FragmentEditLkBinding binding;
    String User;
    TextView textView;
    EditText fName;
    EditText sName;
    EditText email;
    Button buttonSave;
    private String[] DataName;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        if (FirebaseAuth.getInstance().getCurrentUser() != null) {

            Edit_lkViewModel edit_lkViewModel =
                    new ViewModelProvider(this).get(Edit_lkViewModel.class);

            binding = FragmentEditLkBinding.inflate(inflater, container, false);
            View root = binding.getRoot();



            User = FirebaseAuth.getInstance().getCurrentUser().getPhoneNumber();
            textView = root.findViewById(R.id.phone);
            textView.setText("" + User);
            String sN="";
            String fN="";
            String Em;
            DataName = FirebaseAuth.getInstance().getCurrentUser().getDisplayName().split(" ");
            if (DataName.length>=2) {
                fN = DataName[0];
                sN = DataName[1];
            }
            else if (DataName.length==1)
                fN = DataName[0];
            Em = FirebaseAuth.getInstance().getCurrentUser().getEmail();
            fName = root.findViewById(R.id.name);
            sName = root.findViewById(R.id.surname);
            email = root.findViewById(R.id.email);
            fName.setText("" + fN);
            sName.setText("" + sN);
            email.setText("" + Em);

            buttonSave = root.findViewById(R.id.btn_save);
            buttonSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SaveInf();
                    Navigation.findNavController(view).navigate(R.id.action_nav_edit_lk_to_nav_home);
                }
            });

            final TextView textView = binding.textLp;
            edit_lkViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
            return root;

        }
        return null;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



    private void setContentView(int activity_main) {
    }



    private void SaveInf() {
        String Email = email.getText().toString();
        if (Email.length()>0)
            FirebaseAuth.getInstance().getCurrentUser().updateEmail(Email);
        String sNameStr = sName.getText().toString();
        String fNameStr = fName.getText().toString();
        String Name = fNameStr + " " + sNameStr;

        UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                .setDisplayName(Name)
                .setPhotoUri(Uri.EMPTY)
                .build();
        FirebaseAuth.getInstance().getCurrentUser().updateProfile(profileUpdates);
    }
}
