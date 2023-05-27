package com.example.myapplication.ui.instructor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentInstructorBinding;

public class InstructorFragment extends Fragment {

    private FragmentInstructorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InstructorViewModel instructorViewModel =
                new ViewModelProvider(this).get(InstructorViewModel.class);

        binding = FragmentInstructorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RelativeLayout relative_ins = (RelativeLayout) root.findViewById(R.id.relLayout_ins);
        relative_ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_instructor_to_nav_ins_kris);
            }
        });

        RelativeLayout relative_ins_1 = (RelativeLayout) root.findViewById(R.id.relLayout_ins_1);
        relative_ins_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_instructor_to_nav_ins_olga);
            }
        });

        RelativeLayout relative_ins_2 = (RelativeLayout) root.findViewById(R.id.relLayout_ins_2);
        relative_ins_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_instructor_to_nav_ins_olga_n);
            }
        });

        RelativeLayout relative_ins_3 = (RelativeLayout) root.findViewById(R.id.relLayout_ins_3);
        relative_ins_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_instructor_to_nav_ins_diana);
            }
        });

        RelativeLayout relative_ins_4 = (RelativeLayout) root.findViewById(R.id.relLayout_ins_4);
        relative_ins_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_instructor_to_nav_ins_vladimir);
            }
        });

        RelativeLayout relative_ins_5 = (RelativeLayout) root.findViewById(R.id.relLayout_ins_5);
        relative_ins_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_instructor_to_nav_ins_olga_b);
            }
        });

        RelativeLayout relative_ins_6 = (RelativeLayout) root.findViewById(R.id.relLayout_ins_6);
        relative_ins_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_instructor_to_nav_ins_oxana);
            }
        });

        RelativeLayout relative_ins_7 = (RelativeLayout) root.findViewById(R.id.relLayout_ins_7);
        relative_ins_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_instructor_to_nav_ins_kris_k);
            }
        });

        RelativeLayout relative_ins_8 = (RelativeLayout) root.findViewById(R.id.relLayout_ins_8);
        relative_ins_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_instructor_to_nav_ins_nastya);
            }
        });

        RelativeLayout relative_ins_9 = (RelativeLayout) root.findViewById(R.id.relLayout_ins_9);
        relative_ins_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_instructor_to_nav_ins_roman);
            }
        });

//        final TextView textView = binding.textInstructor;
//        instructorViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
