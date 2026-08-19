package ntu.nguyenhoangphuc.baith4_linearlayout_tong2so;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Khai báo biến
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;

    void TimDieuKhien() {
        editTextSo1 = (EditText) findViewById(R.id.editSo1);
        editTextSo2 = (EditText) findViewById(R.id.editSo2);
        editTextKQ = (EditText)findViewById(R.id.editKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }



    //Xử lý các nút
   public void XuLyCong(View cong){
        //Code xử lý
        //B1: Tìm EditText


        //B2: Lấy dữ liệu từ điều khiển
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //B3: Chuyển dữ liệu chuỗi sang số
        Float so1 = Float.parseFloat(soThu1);
        Float so2 = Float.parseFloat(soThu2);

        //B4: Phép tính
        Float Tong = so1 + so2;

        //In kết quả

        String ChuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(ChuoiKQ);
    }

   public void XuLyTru(View tru){
        //Code xử lý
        //B1: Tìm EditText


        //B2: Lấy dữ liệu từ điều khiển
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //B3: Chuyển dữ liệu chuỗi sang số
        Float so1 = Float.parseFloat(soThu1);
        Float so2 = Float.parseFloat(soThu2);

        //B4: Phép tính
        Float Thuong = so1 - so2;

        //In kết quả

        String ChuoiKQ = String.valueOf(Thuong);
        editTextKQ.setText(ChuoiKQ);

    }

   public void XuLyNhan(View nhan){
        //Code xử lý
        //B1: Tìm EditText


        //B2: Lấy dữ liệu từ điều khiển
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //B3: Chuyển dữ liệu chuỗi sang số
        Float so1 = Float.parseFloat(soThu1);
        Float so2 = Float.parseFloat(soThu2);

        //B4: Phép tính
        Float Nhan = so1 * so2;

        //In kết quả

        String ChuoiKQ = String.valueOf(Nhan);
        editTextKQ.setText(ChuoiKQ);
    }

   public void XuLyChia(View chia){
        //Code xử lý
        //B1: Tìm EditText


        //B2: Lấy dữ liệu từ điều khiển
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        //B3: Chuyển dữ liệu chuỗi sang số
        Float so1 = Float.parseFloat(soThu1);
        Float so2 = Float.parseFloat(soThu2);

        //B4: Phép tính
        Float Thuong = so1 / so2;

        //In kết quả

        String ChuoiKQ = String.valueOf(Thuong);
        editTextKQ.setText(ChuoiKQ);
    }
}