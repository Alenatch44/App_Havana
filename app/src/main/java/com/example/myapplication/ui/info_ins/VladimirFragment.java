package com.example.myapplication.ui.info_ins;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentInsVladimirBinding;

public class VladimirFragment extends Fragment {
    private FragmentInsVladimirBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VladimirViewFragment vladimirViewFragment =
                new ViewModelProvider(this).get(VladimirViewFragment.class);

        binding = FragmentInsVladimirBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        final TextView textView = binding.textVladimirIns;
        vladimirViewFragment.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
