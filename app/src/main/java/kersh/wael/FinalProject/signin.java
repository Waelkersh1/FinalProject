package kersh.wael.FinalProject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signin extends AppCompatActivity {
    private EditText etemail, etpassword;
    private Button btnlog, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        setContentView(R.layout.activity_signup);
        etemail = findViewById(R.id.etEmail);
        etpassword = findViewById(R.id.etPassword);
        btnlog = findViewById(R.id.btnlog);
        btnSignup = findViewById(R.id.btnsign);
        //4
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //5
                validateForm();
            }
        });
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    //5
    private void validateForm() {
    }
}