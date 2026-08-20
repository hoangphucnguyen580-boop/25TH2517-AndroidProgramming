package ntu.nguyenhoangphuc.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Khai báo biến
    EditText edtWeight, edtHeight, edtAge; // Thêm biến cho Tuổi
    Button btnResult, btnReset;
    TextView tvResult;

    void TimDieuKhien() {
        // Ánh xạ ID từ file XML sang code Java (ID phải khớp hệt bên XML)
        edtWeight = findViewById(R.id.edtWeight);
        edtHeight = findViewById(R.id.edtHeight);
        edtAge = findViewById(R.id.edtAge); // Cứ tìm cho đủ để không crash, dù chưa dùng tính toán
        btnResult = findViewById(R.id.btnResult);
        btnReset = findViewById(R.id.btnReset);
        tvResult = findViewById(R.id.tvResult);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }
    // Hàm chạy khi bấm nút RESULT (đã nối ở XML bằng android:onClick="tinhBMI")
    public void tinhBMI(View v) {
        String weightStr = edtWeight.getText().toString();
        String heightStr = edtHeight.getText().toString();

        if (weightStr.isEmpty() || heightStr.isEmpty()) {
            Toast.makeText(MainActivity.this, "Ê, nhập đủ cân nặng và chiều cao vào!", Toast.LENGTH_SHORT).show();
            return;
        }

        float weight = Float.parseFloat(weightStr);
        float heightCm = Float.parseFloat(heightStr);
        float heightM = heightCm / 100;

        float bmi = weight / (heightM * heightM);

        // In kết quả ra màn hình ô màu xanh (lấy 6 chữ số thập phân cho giống ảnh)
        tvResult.setText(String.format("%.2f", bmi));
    }

    // Hàm chạy khi bấm nút RESET (đã nối ở XML bằng android:onClick="resetData")
    public void resetData(View v) {
        // Set lại toàn bộ chữ về rỗng (như lúc mới mở app)
        edtWeight.setText("");
        edtHeight.setText("");
        edtAge.setText("");
        tvResult.setText("0.0");

        // Hiện thông báo nhỏ cho ngầu
        Toast.makeText(MainActivity.this, "Đã xóa dữ liệu!", Toast.LENGTH_SHORT).show();
    }
}