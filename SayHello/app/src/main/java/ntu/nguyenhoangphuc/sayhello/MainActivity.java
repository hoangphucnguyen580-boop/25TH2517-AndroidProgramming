package ntu.nguyenhoangphuc.sayhello;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ham_Xin_Chao(View v) {
        // Tạo một thông báo Toast và hiển thị nó lên
        Toast.makeText(MainActivity.this, "Xin chào, Tôi là Nguyễn Hoàng Phúc", Toast.LENGTH_LONG).show();
    }
}