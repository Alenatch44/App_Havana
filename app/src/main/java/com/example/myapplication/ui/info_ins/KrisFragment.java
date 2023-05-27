package com.example.myapplication.ui.info_ins;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentInsKrisBinding;
import com.example.myapplication.ui.edit_lk.Edit_lkViewModel;

public class KrisFragment extends Fragment {
    private FragmentInsKrisBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        KrisViewModel krisViewModel =
                new ViewModelProvider(this).get(KrisViewModel.class);

        binding = FragmentInsKrisBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        final TextView textView = binding.textKrisIns;
        krisViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}