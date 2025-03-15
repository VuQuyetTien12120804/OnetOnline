package com.example.onetonlinev2;

import android.content.Context;
import android.media.MediaParser;
import android.media.MediaPlayer;

public class MusicHelper {
    private MediaPlayer mediaPlayer;
    private boolean isMusicOn = true; // trạng thaí nhạc mặc định bật

    // Constructor: Khởi tạo MediaPlayer
    public MusicHelper(Context context, int musicResId) {
        mediaPlayer = MediaPlayer.create(context, musicResId);
        mediaPlayer.setLooping(true); // Phát nhạc lặp lại
    }

    // Bắt đầu phát nhạc
    public void startMusic() {
        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
            isMusicOn = true;
        }
    }

    // Tạm dừng nhạc
    public void pauseMusic() {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            isMusicOn = false;
        }
    }

    // Bật/tắt nhạc
    public void toggleMusic() {
        if (isMusicOn) {
            pauseMusic();
        } else {
            startMusic();
        }
    }

    // Kiểm tra trạng thái nhạc
    public boolean isMusicPlaying() {
        return isMusicOn;
    }

    // Giải phóng tài nguyên khi không dùng nữa
    public void release() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
