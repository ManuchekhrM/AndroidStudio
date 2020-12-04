package manu.meli.zanyatie_171;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tajhoney;
    ImageView ugl;
    ImageView bee;
    TextView text1;
    Button knopka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tajhoney = findViewById(R.id.tajhoney);
        knopka = findViewById(R.id.knopka);
        ugl = findViewById(R.id.ugl);
        bee = findViewById(R.id.bee);
        text1 = findViewById(R.id.text1);

        knopka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}