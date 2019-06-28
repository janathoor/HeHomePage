package helpingeye.fyp.uos.helpingeye;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
   TextView signupTextView,mLoginbtntxtview;
   String signupStr,emailStr,passwordStr;
    EditText mEmailET, mPassET;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        auth= FirebaseAuth.getInstance();

        mEmailET=findViewById(R.id.email_login_edit_text);
        mPassET=findViewById(R.id.password_login_edit_text);

        signupTextView=findViewById(R.id.signupTV);
        signupStr=signupTextView.getText().toString();

        signupTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,SignUpActivity.class));
            }
        });

        mLoginbtntxtview=findViewById(R.id.loginbtn);

        mLoginbtntxtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,HomePageActivity.class));
            }
        });

    }
}
