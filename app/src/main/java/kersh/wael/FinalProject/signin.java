package kersh.wael.FinalProject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class signin extends AppCompatActivity {
    private EditText etemail, etpassword;
    private Button btnlog, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        etemail = findViewById(R.id.etEmail);
        etpassword = findViewById(R.id.etPassword);
        btnlog = findViewById(R.id.btnlog);
        btnSignup = findViewById(R.id.btnsignUP);
        FirebaseAuth auth =FirebaseAuth.getInstance();
        if(auth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(),MainScreen.class));
        }
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

    public EditText getEtemail() {
        return etemail;
    }

    public void setEtemail(EditText etemail) {
        this.etemail = etemail;
    }

    public EditText getEtpassword() {
        return etpassword;
    }

    public void setEtpassword(EditText etpassword) {
        this.etpassword = etpassword;
    }

    public Button getBtnlog() {
        return btnlog;
    }

    public void setBtnlog(Button btnlog) {
        this.btnlog = btnlog;
    }

    public Button getBtnSignup() {
        return btnSignup;
    }

    public void setBtnSignup(Button btnSignup) {
        this.btnSignup = btnSignup;
    }
}