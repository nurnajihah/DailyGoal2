package sg.edu.rp.c346.dailygoal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class summary extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;

    Button btnClose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        btnClose = findViewById(R.id.btnClose);


        Intent intentReceived = getIntent();
        String read = intentReceived.getStringExtra("read");
        String arrive = intentReceived.getStringExtra("arrive");
        String attempt = intentReceived.getStringExtra("attempt");
        String reflection = intentReceived.getStringExtra("reflection");

        tv1.setText("Read up on materials before class: " + read);
        tv2.setText("Arrive on time so as not to miss important part of the lesson: " + arrive);
        tv3.setText("Attempt the problem myself: " + attempt);
        tv4.setText("Reflection: " + reflection);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}
