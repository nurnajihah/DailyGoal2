package sg.edu.rp.c346.dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton btnYes1;
    RadioButton btnYes2;
    RadioButton btnYes3;
    RadioButton btnNo1;
    RadioButton btnNo2;
    RadioButton btnNo3;
    Button btnOK;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnYes1 = findViewById(R.id.btnYes1);
        btnYes2 = findViewById(R.id.btnYes2);
        btnYes3 = findViewById(R.id.btnYes3);
        btnNo1 = findViewById(R.id.btnNo1);
        btnNo2 = findViewById(R.id.btnNo2);
        btnNo3 = findViewById(R.id.btnNo3);
        btnOK = findViewById(R.id.btnOK);
        editText = findViewById(R.id.editText);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String read = "";

               if(btnYes1.isChecked()) {
                   read = btnYes1.getText().toString();
               }
               else if(btnNo1.isChecked()) {
                   read = btnNo1.getText().toString();
               }

                String arrive = "";

                if(btnYes2.isChecked()) {
                    arrive = btnYes2.getText().toString();
                }
                else if(btnNo2.isChecked()) {
                    arrive = btnNo2.getText().toString();
                }

                String attempt = "";

                if(btnYes3.isChecked()) {
                    attempt = btnYes3.getText().toString();
                }
                else if(btnNo3.isChecked()) {
                    attempt = btnNo3.getText().toString();
                }

                String reflection = editText.getText().toString();

                Intent intent = new Intent(getBaseContext(), summary.class );
                intent.putExtra("read", read);
                intent.putExtra("arrive", arrive);
                intent.putExtra("attempt", attempt);
                intent.putExtra("reflection", reflection);

                startActivity(intent);
            }
        });
    }
}
