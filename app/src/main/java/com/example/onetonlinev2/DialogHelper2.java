package com.example.onetonlinev2;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DialogHelper2 {
    public static void showScrollableAlertDialog(Context context) {
        // Tạo View từ layout
        View dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_scrollable, null);

        // Khởi tạo AlertDialog Builder
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(dialogView);

        // Tạo AlertDialog
        AlertDialog dialog = builder.create();

        // Áp dụng hiệu ứng cho dialog
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogBounceAnimation;

        // Ánh xạ các thành phần
        TextView tvTitle = dialogView.findViewById(R.id.tvTitle);
        TextView tvContent = dialogView.findViewById(R.id.tvContent);
        Button btnClose = dialogView.findViewById(R.id.btnClose);

        // Cài đặt nội dung
        tvTitle.setText("Helper");
        tvContent.setText("Đây là nội dung hướng dẫn chi tiết.\n\n"
                + "1. Bước đầu tiên: Làm điều này.\n"
                + "2. Bước thứ hai: Tiếp tục với điều kia.\n"
                + "3. Bước thứ ba: Hoàn thành quy trình.\n\n"
                + "Bạn có thể thêm nhiều thông tin vào đây mà không bị giới hạn.\n"
                + "Cảm ơn bạn đã sử dụng ứng dụng!" +
                "Đây là nội dung hướng dẫn chi tiết.\\n\\n\"\n" +
                "                + \"1. Bước đầu tiên: Làm điều này.\\n\"\n" +
                "                + \"2. Bước thứ hai: Tiếp tục với điều kia.\\n\"\n" +
                "                + \"3. Bước thứ ba: Hoàn thành quy trình.\\n\\n\"\n" +
                "                + \"Bạn có thể thêm nhiều thông tin vào đây mà không bị giới hạn.\\n\"\n" +
                "                + \"Cảm ơn bạn đã sử dụng ứng dụng!" +
                "Đây là nội dung hướng dẫn chi tiết.\\n\\n\"\n" +
                "                + \"1. Bước đầu tiên: Làm điều này.\\n\"\n" +
                "                + \"2. Bước thứ hai: Tiếp tục với điều kia.\\n\"\n" +
                "                + \"3. Bước thứ ba: Hoàn thành quy trình.\\n\\n\"\n" +
                "                + \"Bạn có thể thêm nhiều thông tin vào đây mà không bị giới hạn.\\n\"\n" +
                "                + \"Cảm ơn bạn đã sử dụng ứng dụng!");

        // Áp dụng viền cho AlertDialog
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.dialog_border);

        // Xử lý nút đóng
        btnClose.setOnClickListener(view -> dialog.dismiss());

        // Hiển thị AlertDialog
        dialog.show();
    }
}
