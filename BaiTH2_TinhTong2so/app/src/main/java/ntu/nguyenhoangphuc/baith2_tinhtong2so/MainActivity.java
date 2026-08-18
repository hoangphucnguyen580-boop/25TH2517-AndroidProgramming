package ntu.nguyenhoangphuc.baith2_tinhtong2so;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }

    //Xử lý sự kiện click lên nút Tính Tổng
    public void XuLyCong(View view){
        //Tìm tham chiếu đến điều khiển trên xử lý
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextSoKQ = findViewById(R.id.edtKQ);

        //Lấy dữ liệu về
        String dataA = editTextSoA.getText().toString();
        String dataB = editTextSoB.getText().toString();

        //Chuyển đổi dữ liệu dạng chuỗi sang dạng số nguyên
        int so_A = Integer.parseInt(dataA);
        int so_B = Integer.parseInt(dataB);

        //Tính tổng theo yêu cầu
        int tong = so_A + so_B;

        //Chuyển đổi số nguyên tổng qua dạng chuỗi
        String dataTong = String.valueOf(tong);

        //In ra màn hình đáp án
        editTextSoKQ.setText(dataTong);
    }
}