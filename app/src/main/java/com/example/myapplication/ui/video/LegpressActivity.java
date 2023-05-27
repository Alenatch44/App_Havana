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

public class LegpressActivity extends AppCompatActivity {
    VideoView videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_legpress);

        String SrcPath = "https://rr1---sn-c0an5u-nv4l.googlevideo.com/videoplayback?expire=1654683957&ei=1CSgYpLKOtWMgAej-pPABg&ip=46.40.79.160&id=o-AGSP5RESJI1Zt4yf8hfdRYLk19weeHjeLSv6wStuMzwu&itag=22&source=youtube&requiressl=yes&mh=sp&mm=31%2C29&mn=sn-c0an5u-nv4l%2Csn-nv47lnly&ms=au%2Crdu&mv=m&mvi=1&pl=22&initcwndbps=1262500&spc=4ocVCzothUBBI1lQNOogCpk9ec4qRJM&vprv=1&mime=video%2Fmp4&ns=oFc6ELpaH9qvEqhj6b9IWBQG&cnr=14&ratebypass=yes&dur=227.253&lmt=1471011179489258&mt=1654662057&fvip=1&fexp=24001373%2C24007246&c=WEB&n=US7tHoTsxJ_1Lw&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRgIhANKH_XyYAa8sU8FMKZ4adV0aRpYOJsz8F55zQ9uIoQrnAiEA5jMnSedfo4fJaub-gtZEmWiqzJhYOx8w0lzptUxZBrg%3D&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRgIhAMjfxhTfsI8oNnY5k1aRIIZqp2EqyGoNTACx8oYGUEV5AiEAn1Ax4bYJENElC9yCvri-GkHpSinChLvfA1LA4HciekM%3D&title=Упражнения%20для%20ног.%20Жим%20ногами.";
        videoPlayer = findViewById(R.id.videoPlayer);
        videoPlayer.setVideoURI(Uri.parse(SrcPath));
        videoPlayer.setMediaController(new MediaController(this));
        videoPlayer.requestFocus();
        videoPlayer.start();


//        videoPlayer = findViewById(R.id.videoPlayer);
//
//        videoPlayer.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.train_legpress));
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