package com.example.myapplication.ui.train;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.ui.video.BottomActivity;
import com.example.myapplication.ui.video.StaticsActivity;
import com.example.myapplication.ui.video.UpActivity;
import com.example.myapplication.ui.video.VideoActivity;
import com.example.myapplication.databinding.FragmentTrainBinding;

public class TrainFragment extends Fragment {

    private FragmentTrainBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TrainViewModel instructorViewModel =
                new ViewModelProvider(this).get(TrainViewModel.class);

        binding = FragmentTrainBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RelativeLayout relative_ins_1 = (RelativeLayout) root.findViewById(R.id.relLayout_train_1);
        relative_ins_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.action_nav_train_to_nav_video);
                sendUserToVideo();

            }
        });

        RelativeLayout relative_ins_2 = (RelativeLayout) root.findViewById(R.id.relLayout_train_2);
        relative_ins_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserToVideoBottom();

            }
        });

        RelativeLayout relative_ins_3 = (RelativeLayout) root.findViewById(R.id.relLayout_train_3);
        relative_ins_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserToVideoUp();

            }
        });

        RelativeLayout relative_ins_4 = (RelativeLayout) root.findViewById(R.id.relLayout_train_4);
        relative_ins_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserToVideoStatics();

            }
        });

//        final TextView textView = binding.textTrain;
//        instructorViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void sendUserToVideo() {
        Intent videoIntent = new Intent(getActivity(), VideoActivity.class);
        videoIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        videoIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(videoIntent);
    }

    private void sendUserToVideoBottom() {
        Intent BottomIntent = new Intent(getActivity(), BottomActivity.class);
        BottomIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        BottomIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(BottomIntent);
    }

    private void sendUserToVideoUp() {
        Intent UpIntent = new Intent(getActivity(), UpActivity.class);
        UpIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        UpIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(UpIntent);
    }

    private void sendUserToVideoStatics() {
        Intent StaticsIntent = new Intent(getActivity(), StaticsActivity.class);
        StaticsIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        StaticsIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(StaticsIntent);
    }
}

