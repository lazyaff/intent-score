package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView result;
    private String hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = findViewById(R.id.textView3);
        hasil = getIntent().getExtras().getString("winner");

        if (hasil != "draw") {
            result.setText("Pertandingan dimenangkan oleh "+hasil);
        } else {
            result.setText("Pertandingan berakhir imbang");
        }
    }
}
