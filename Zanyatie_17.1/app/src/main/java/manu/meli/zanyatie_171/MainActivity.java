package manu.meli.zanyatie_171;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tajhoney;
    Button knopka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tajhoney = findViewById(R.id.tajhoney);
        knopka = findViewById(R.id.knopka);

        knopka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                knopka.setText("tajhoney.tj");
            }
        });
    }
}