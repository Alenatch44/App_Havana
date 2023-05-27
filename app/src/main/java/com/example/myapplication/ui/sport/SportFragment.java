package com.example.myapplication.ui.sport;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.ArActivity;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentSportBinding;
import com.example.myapplication.ui.video.ChestbenchActivity;
import com.example.myapplication.ui.video.LegpressActivity;
import com.example.myapplication.ui.video.LegrackActivity;
import com.example.myapplication.ui.video.ScottActivity;
import com.example.myapplication.ui.video.StaticsActivity;
import com.example.myapplication.ui.video.VideoActivity;

public class SportFragment extends Fragment {

    private FragmentSportBinding binding;
    private Button button_ar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SportViewModel callViewModel =
                new ViewModelProvider(this).get(SportViewModel.class);

        binding = FragmentSportBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//Кнопки для ar
        Button button_ar_1 = root.findViewById(R.id.button_sport_ar_1);
        button_ar_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int arModel = 1;
                sendUserToAr(arModel);
            }
        });

        Button button_ar_2 = root.findViewById(R.id.button_sport_ar_2);
        button_ar_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int arModel = 2;
                sendUserToAr(arModel);
            }
        });

        Button button_ar_3 = root.findViewById(R.id.button_sport_ar_3);
        button_ar_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int arModel = 3;
                sendUserToAr(arModel);
            }
        });

        Button button_ar_4 = root.findViewById(R.id.button_sport_ar_4);
        button_ar_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int arModel = 4;
                sendUserToAr(arModel);
            }
        });


//Кнопки для видео
        Button button_video_1 = root.findViewById(R.id.button_sport_video_1);
        button_video_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendUserToScott();
            }
        });

        Button button_video_2 = root.findViewById(R.id.button_sport_video_2);
        button_video_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendUserToChestbench();
            }
        });

        Button button_video_3 = root.findViewById(R.id.button_sport_video_3);
        button_video_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendUserToLegpress();
            }
        });

        Button button_video_4 = root.findViewById(R.id.button_sport_video_4);
        button_video_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendUserToLegrack();
            }
        });

//        final TextView textView = binding.textCall;
//        callViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    //Функции для ar

    private void sendUserToAr(int arModel) {
        Intent arIntent = new Intent(getActivity(), ArActivity.class);
        arIntent.putExtra("Model", arModel);
        startActivity(arIntent);
    }

    //Функции для видео

    private void sendUserToScott() {
        Intent scottIntent = new Intent(getActivity(), ScottActivity.class);
        scottIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        scottIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(scottIntent);
    }

    private void sendUserToChestbench() {
        Intent ChestbenchIntent = new Intent(getActivity(), ChestbenchActivity.class);
        ChestbenchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        ChestbenchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(ChestbenchIntent);
    }

    private void sendUserToLegpress() {
        Intent LegpressIntent = new Intent(getActivity(), LegpressActivity.class);
        LegpressIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        LegpressIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(LegpressIntent);
    }

    private void sendUserToLegrack() {
        Intent LegrackIntent = new Intent(getActivity(), LegrackActivity.class);
        LegrackIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        LegrackIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(LegrackIntent);
    }
}



