package com.example.myapplication.ui.info_ins;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentInsOxanaBinding;

public class OxanaFragment extends Fragment {
    private FragmentInsOxanaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        OxanaViewFragment oxanaViewFragment =
                new ViewModelProvider(this).get(OxanaViewFragment.class);

        binding = FragmentInsOxanaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        final TextView textView = binding.textOxanaIns;
        oxanaViewFragment.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}