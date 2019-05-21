package c346.rp.edu.sg.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2;
    Button rev1, rev2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tvQ1);
        tv2 = findViewById(R.id.tvQ2);

        rev1 = findViewById(R.id.btn1);
        rev2 = findViewById(R.id.btn2);

        rev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AnswerActivity1.class).putExtra("Question", "Q1"));
            }
        });

        rev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AnswerActivity2.class).putExtra("Question", "Q2"));
            }
        });

    }
}
