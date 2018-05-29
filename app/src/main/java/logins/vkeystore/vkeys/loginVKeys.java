package logins.vkeystore.vkeys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;

public class loginVKeys extends AppCompatActivity {


    private EditText inputUser , inputPassword;
    private Button btnSignin , btnSignup , btnResetPassword;
    private ProgressBar progressbar;
    private FirebaseAuth auth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_vkeys);

        auth = FirebaseAuth.getInstance();
        btnSignup = (Button)findViewById(R.id.sign_up_button);
        btnSignin = (Button)findViewById(R.id.sign_in_button);
        inputUser = (EditText)findViewById(R.id.username);
        inputPassword = (EditText)findViewById(R.id.password);
        progressbar = (ProgressBar)findViewById(R.id.progressBar);

        btnResetPassword = (Button)findViewById(R.id.forgotbutton);




        btnResetPassword.setOnClickListener(new View.OnClickListener(){


                                                @Override
                                                public void onClick(View view) {
                                                    startActivity(new Intent(loginVKeys.this , passwordReset.class));
                                                }
                                            });



}
}
