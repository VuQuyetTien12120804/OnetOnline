package com.example.onetonlinev2;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DialogHelper {

    public static void showCustomAlertDialog(Context context) {
        // Tạo View tùy chỉnh cho AlertDialog
        View dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_custom, null);

        // Tạo AlertDialog Builder
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(dialogView);

        // Khởi tạo Dialog
        AlertDialog dialog = builder.create();

        // Ánh xạ các thành phần trong Dialog
        TextView tvTitle = dialogView.findViewById(R.id.tvTitle);
        TextView tvContent = dialogView.findViewById(R.id.tvContent);
        ImageView ivIllustration = dialogView.findViewById(R.id.ivIllustration);
        Button btnClose = dialogView.findViewById(R.id.btnClose);

        // Thiết lập nội dung
        tvTitle.setText("Help");
        tvContent.setText("The objective of this game is to eliminate all icon cards by selecting 2 same icons. " +
                "To be able to eliminate these cards, you must follow these rules:\n" +
                "1. The connection path between those cards must not exceed 3 straight lines.\n" +
                "2. The connection path must not be blocked by other cards.");
        //ivIllustration.setImageResource(R.drawable.rules_image);

        // Áp dụng viền cho AlertDialog
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.dialog_border);

        // Xử lý nút đóng
        btnClose.setOnClickListener(view -> dialog.dismiss());

        // Hiển thị Dialog
        dialog.show();
    }
}
