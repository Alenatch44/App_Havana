package com.example.myapplication.ui.us;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.ViewPagerAdapter;
import com.example.myapplication.databinding.FragmentUsBinding;

public class UsFragment extends Fragment {

    private FragmentUsBinding binding;
    private ViewPager viewPager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UsViewModel instructorViewModel =
                new ViewModelProvider(this).get(UsViewModel.class);

        binding = FragmentUsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        viewPager = (ViewPager) root.findViewById(R.id.viewPager);


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getContext());

        viewPager.setAdapter(viewPagerAdapter);


//        final TextView textView = binding.textUs;
//        instructorViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    public Object getSystemService(String layoutInflaterService) {
        return null;
    }
}