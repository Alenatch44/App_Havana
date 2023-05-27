package com.example.myapplication.ui.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.myapplication.R;

public class UpActivity extends AppCompatActivity {
    VideoView videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_up);

        String SrcPath = "https://rr4---sn-q4flrnl6.googlevideo.com/videoplayback?expire=1654683011&ei=IyGgYpqWCbHXigSYuLe4Cg&ip=209.107.216.178&id=o-AOcnWsjBgLN5kZdfhFWGe8lqzfY2brFN0b-7zZjUmRwe&itag=22&source=youtube&requiressl=yes&mh=OW&mm=31%2C26&mn=sn-q4flrnl6%2Csn-5ualdn76&ms=au%2Conr&mv=m&mvi=4&pl=24&initcwndbps=1063750&spc=4ocVCxLLvzLLn6BfFzI3xn7-Kf6CnDo&vprv=1&mime=video%2Fmp4&ns=h5G0DZEBJZlRg7tB_utJ8DYG&cnr=14&ratebypass=yes&dur=946.259&lmt=1639429534951839&mt=1654661104&fvip=6&fexp=24001373%2C24007246&c=WEB&txp=5432434&n=5PKYt8X5mf2tEg&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIgSmWRfaCd77ZUkS9dbMEv4blHx9KeWSe2eFVlBY3l1SYCIQC98zZTsCLNOy4YoxltzHRJF7NrA8-9rYA4djNLFYVZhA%3D%3D&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRQIhAPP65qr9EZVDRT8C5X2fPS-nMroKwc9pu3_tXwEaC6cnAiAjCLI8m9-H9IhgcFkJmsjTKqmk_In7-LaoK6xsBaqT-Q%3D%3D&title=15%20МИНУТНАЯ%20ТРЕНИРОВКА%20ГРУДИ%20И%20ПЛЕЧ%20с%20гантелями%20%23АдскаяТренировка%20с%2022X22%20%20%7C%20%20В%20Домашних%20Условиях";
        videoPlayer = findViewById(R.id.videoPlayer);
        videoPlayer.setVideoURI(Uri.parse(SrcPath));
        videoPlayer.setMediaController(new MediaController(this));
        videoPlayer.requestFocus();
        videoPlayer.start();

//        videoPlayer = findViewById(R.id.videoPlayer);
//
//        videoPlayer.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.train_up));
//
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        videoPlayer.setMediaController(new MediaController(this));
//        videoPlayer.requestFocus(0);
//        videoPlayer.start();
    }

    public void play(View view){
        videoPlayer.start();
    }
    public void pause(View view){
        videoPlayer.pause();
    }
    public void stop(View view){
        videoPlayer.stopPlayback();
        videoPlayer.resume();
    }
}