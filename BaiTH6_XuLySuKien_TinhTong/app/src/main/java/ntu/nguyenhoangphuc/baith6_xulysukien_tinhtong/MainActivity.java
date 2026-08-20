package ntu.nguyenhoangphuc.baith6_xulysukien_tinhtong;

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
        setContentView(R.layout.activity_main);
    }

    public void XuLyCong (View view){
        EditText editTextSoA = findViewById(R.id.etSoA);
        EditText editTextSoB = findViewById(R.id.etSoB);
        EditText editTextSoKQ = findViewById(R.id.etkq);

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);

        int Tong = so_A + so_B;
        String strTong = String.valueOf(Tong);

        editTextSoKQ.setText(strTong);
    }
}