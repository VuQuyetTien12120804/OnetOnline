package com.example.onetonlinev2;

import android.app.AlertDialog;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.nio.BufferUnderflowException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Khai báo biến
    Button ButtonClassic, ButtonRandom, ButtonCOntinue, ButtonOnline, Button1, Button2, Button3, Button4;
    Button ButtonMusic;
    TabHost mytab;
    private MusicHelper musicHelper;

    //Khai báo listView cho tap selector
    ListView lv1, lv2, lv3;
    ArrayList<String> danhsach1, danhsach2, danhsach3;
    ArrayAdapter<String> adapter1, adapter2, adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Tham chiếu ID
        ButtonClassic = findViewById(R.id.ButonClassic);
        ButtonRandom = findViewById(R.id.ButtonRandom);
        ButtonCOntinue = findViewById(R.id.ButtonContinue);
        ButtonOnline = findViewById(R.id.ButtonOnline);
        Button1 = findViewById(R.id.Button1);
        Button2 = findViewById(R.id.Button2);
        Button3 = findViewById(R.id.Button3);
        Button4 = findViewById(R.id.Button4);
        ButtonMusic = findViewById(R.id.ButtonMusic);

        // Khởi tạo MusicHelper với nhạc từ res/raw
        musicHelper = new MusicHelper(this, R.raw.game_music);
        musicHelper.startMusic(); // Tự động phát nhạc khi mở ứng dụng

        // Xử lý khi nhấn ButtonMusic
        ButtonMusic.setOnClickListener(v -> {
            musicHelper.toggleMusic(); // bật , tắt nhạc
            //updateButtonText(); // Cập nhật nội dung nút
        });
        //updateButtonText();

        // Cập nhật nội dung nút dựa trên trạng thái nhạc
//        private void updateButtonText() {
//            if (musicHelper.isMusicPlaying()) {
//                ButtonMusic.setText("Tắt nhạc");
//            } else {
//                ButtonMusic.setText("Bật nhạc");
//            }
//        }

        // Giải phóng MusicHelper khi Activity bị hủy
//        @Override
//        protected void onDestroy() {
//            super.onDestroy();
//            if (musicHelper != null) {
//                musicHelper.release();
//            }
//        }
        // Sử lý Click
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogHelper1.showScrollableAlertDialog(MainActivity.this);
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogHelper2.showScrollableAlertDialog(MainActivity.this);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogHelper3.showScrollableAlertDialog(MainActivity.this);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogHelper4.showScrollableAlertDialog(MainActivity.this);
            }
        });

        //addControl();
    }

//    private void addControl() {
//        // xử lý listView
//        lv1 = findViewById(R.id.lv1);
//        lv2 = findViewById(R.id.lv2);
//        lv3 = findViewById(R.id.lv3);
//
//        danhsach1 = new ArrayList<>();
//        danhsach2 = new ArrayList<>();
//        danhsach3 = new ArrayList<>();
//
//        //them du lieu tam thời
//        danhsach1.add("Người chơi 1");
//        danhsach1.add("Người chơi 2");
//        danhsach1.add("Người chơi 3");
//        danhsach1.add("Người chơi 4");
//        danhsach1.add("Người chơi 5");
//        danhsach1.add("Người chơi 6");
//        danhsach1.add("Người chơi 7");
//
//        danhsach2.add("Người chơi 1");
//        danhsach2.add("Người chơi 2");
//        danhsach2.add("Người chơi 3");
//        danhsach2.add("Người chơi 4");
//        danhsach2.add("Người chơi 5");
//        danhsach2.add("Người chơi 6");
//        danhsach2.add("Người chơi 7");
//
//        danhsach3.add("Người chơi 1");
//        danhsach3.add("Người chơi 2");
//        danhsach3.add("Người chơi 3");
//        danhsach3.add("Người chơi 4");
//        danhsach3.add("Người chơi 5");
//        danhsach3.add("Người chơi 6");
//        danhsach3.add("Người chơi 7");
//
//        adapter1 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1);
//        adapter2 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1);
//        adapter3 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1);
//
//        lv1.setAdapter(adapter1);
//        lv2.setAdapter(adapter2);
//        lv3.setAdapter(adapter3);
//
//        // Xử lý TabHost
//        mytab = findViewById(R.id.mytab);
//        mytab.setup();
//        //Khai bao tab con(TapSpec)
//        TabHost.TabSpec spec1, spec2, spec3;
//
//        //Tab1
//        spec1 = mytab.newTabSpec("t1"); // tạo mới tab
//        spec1.setContent(R.id.tab1); //Tham chiếu id cho tab1
//        //spec1.setIndicator("", getResources().getDrawable(R.drawable.cong)); //Thiet lap icon cho tab
//        mytab.addTab(spec1);
//
//        //Tab2
//        spec2 = mytab.newTabSpec("t2"); // tạo mới tab
//        spec2.setContent(R.id.tab2); //Tham chiếu id cho tab1
//        //spec2.setIndicator("", getResources().getDrawable(R.drawable.cong)); //Thiet lap icon cho tab
//        mytab.addTab(spec2);
//
//        //Tab1
//        spec3 = mytab.newTabSpec("t3"); // tạo mới tab
//        spec3.setContent(R.id.tab3); //Tham chiếu id cho tab1
//        //spec3.setIndicator("", getResources().getDrawable(R.drawable.cong)); //Thiet lap icon cho tab
//        mytab.addTab(spec3);
//    }
}
