package kersh.wael.FinalProject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
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
                startActivity(new Intent(getApplicationContext(),signup.class));


            }
        });
    }
    private void validateForm()
    {
        String email=etemail.getText().toString();
        String passw=etpassword.getText().toString();
        boolean isOK=true;
        if(email.length()<5 || email.indexOf('@')==0 || email.indexOf('@')>=email.length()-2 ||
                email.indexOf('.')==0 || email.indexOf('.')>=email.length()-1 || email.lastIndexOf('.')<email.indexOf('@'))
        {
            isOK=false;
            etemail.setError("Wrong Eamil syntax");
        }
        MyValidations myValidations= new MyValidations();
        if (myValidations.ValidatePasword(passw) == false) {
            isOK = false;
            etpassword.setError("Invalid Password");
        }

        if(isOK)
        {
            signIn(email,passw);
        }
    }
    //6
    private void signIn(String email, String passw)
    {
        FirebaseAuth auth=FirebaseAuth.getInstance();
        auth.signInWithEmailAndPassword(email,passw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Intent i=new Intent(signin.this,MainScreen.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(signin.this , "Failed", Toast.LENGTH_SHORT).show();
                    etemail.setError(task.getException().getMessage());
                }
            }
        });
    }


      }

