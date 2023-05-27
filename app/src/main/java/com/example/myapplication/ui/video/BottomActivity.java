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

public class BottomActivity extends AppCompatActivity {
    VideoView videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bottom);

        String SrcPath = "https://rr6---sn-hpa7kn7l.googlevideo.com/videoplayback?expire=1654683043&ei=QyGgYq3rK4PugQeXgYSQDQ&ip=95.181.233.10&id=o-AKlJFn-RqJpWVSMDBugWjXGOaeIhOjCeaEPDvyK-e_L8&itag=22&source=youtube&requiressl=yes&mh=wN&mm=31%2C29&mn=sn-hpa7kn7l%2Csn-hpa7znz6&ms=au%2Crdu&mv=m&mvi=6&pl=24&initcwndbps=1992500&spc=4ocVC6V-dKZYm9AyvVoPQjhp9xz7kxk&vprv=1&mime=video%2Fmp4&ns=OcFEGiTbjI6KrapJRn8rutsG&cnr=14&ratebypass=yes&dur=1157.073&lmt=1585912512969643&mt=1654661104&fvip=3&fexp=24001373%2C24007246&c=WEB&txp=5535432&n=UzGxZYciXRtSfQ&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIgZ1m04R2BBwv8gV1nnCwmaE22YAXwDuMXRz4V6surtSACIQC6_PE1gaVIi291zr_kduyOK-rjhqjoLucPgTzZUytWBw%3D%3D&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRgIhAJN09XI9kEvLgdLlwu2en00ojgl8gcx2RiVwV5fjBgICAiEAgsObk-q6qZyt-WmPJckTCwaXP_L7QToPIwM7rej9-1Y%3D&title=АДСКАЯ%20ТРЕНИРОВКА%20НА%20ЯГОДИЦЫ%20ДОМА%20ЗА%2020%20МИНУТ%20%2F%20онлайн%20марафон";
        videoPlayer = findViewById(R.id.videoPlayer);
        videoPlayer.setVideoURI(Uri.parse(SrcPath));
        videoPlayer.setMediaController(new MediaController(this));
        videoPlayer.requestFocus();
        videoPlayer.start();

//        videoPlayer = findViewById(R.id.videoPlayer);
//
//        videoPlayer.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.train_botton));
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