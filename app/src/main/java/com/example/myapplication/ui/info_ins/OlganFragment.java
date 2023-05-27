package com.example.myapplication.ui.info_ins;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentInsOlgaNBinding;

public class OlganFragment extends Fragment {
    private FragmentInsOlgaNBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        OlganViewFragment olganViewFragment =
                new ViewModelProvider(this).get(OlganViewFragment.class);

        binding = FragmentInsOlgaNBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        final TextView textView = binding.textOlgaNIns;
        olganViewFragment.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}