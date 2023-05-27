package com.example.myapplication.ui.info_ins;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.WebViewController;
import com.example.myapplication.databinding.Fragment3dBinding;

public class DFragment extends Fragment {
    private Fragment3dBinding binding;
//    private Button btn;
    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DViewFragment dViewFragment =
                new ViewModelProvider(this).get(DViewFragment.class);

        binding = Fragment3dBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        webView=(WebView) root.findViewById(R.id.webview);
//        btn=(Button) root.findViewById(R.id.btn);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://my.matterport.com/show/?m=85yfULzGgJa&hl=1");
        webView.setWebViewClient(new WebViewController());

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                webView.loadUrl("https://my.matterport.com/show/?m=85yfULzGgJa&hl=1");
//            }
//        });
        final TextView textView = binding.textWeb;
        dViewFragment.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}