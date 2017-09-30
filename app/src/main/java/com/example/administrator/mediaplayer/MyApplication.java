package com.example.administrator.mediaplayer;

import android.app.Application;
import android.media.MediaPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/26.
 */

public class MyApplication extends Application {

    public static final String UPDATE_ACTION = "org.crazyit.action.UPDATE_ACTION";
    public static final String CAL_ACTION = "org.crazyit.action.CTL_ACTION";

    int status = 0;//表示音乐当前的状态
    int current = 0;//当前播放的歌曲在链表中的位置

    MediaPlayer mediaPlayer;

    List<Map<String,Object>> contactListItem = new ArrayList<>();

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        mediaPlayer = new MediaPlayer();

    }

}
