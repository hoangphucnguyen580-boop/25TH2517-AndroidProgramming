package ntu.nguyenhoangphuc.baith5_xulysukien1;

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
        //Gắn bôk lắng nghe
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code xử lý
                XULY_CONG();
            }
        });

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code xử lý
                XULY_TRU();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code xử lý
                XULY_NHAN();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code xử lý
                XULY_CHIA();
            }
        });
    }

    void XULY_CONG() {
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        Float so1 = Float.parseFloat(soThu1);
        Float so2 = Float.parseFloat(soThu2);
        Float Tong = so1 + so2;
        String ChuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(ChuoiKQ);
    }

    void XULY_TRU() {
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        Float so1 = Float.parseFloat(soThu1);
        Float so2 = Float.parseFloat(soThu2);
        Float Thuong = so1 - so2;
        String ChuoiKQ = String.valueOf(Thuong);
        editTextKQ.setText(ChuoiKQ);
    }

    void XULY_NHAN() {
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        Float so1 = Float.parseFloat(soThu1);
        Float so2 = Float.parseFloat(soThu2);
        Float Nhan = so1 * so2;
        String ChuoiKQ = String.valueOf(Nhan);
        editTextKQ.setText(ChuoiKQ);
    }

    void XULY_CHIA() {
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        Float so1 = Float.parseFloat(soThu1);
        Float so2 = Float.parseFloat(soThu2);
        Float Thuong = so1 / so2;
        String ChuoiKQ = String.valueOf(Thuong);
        editTextKQ.setText(ChuoiKQ);
    }
}