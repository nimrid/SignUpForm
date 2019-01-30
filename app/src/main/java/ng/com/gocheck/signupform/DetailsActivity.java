package ng.com.gocheck.signupform;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    private TextView mDisplayView1, mDisplayView2, mDisplayView3, mDisplayView4;

    private static final String EXTRA_USERNAME_ID = "ng.com.gocheck.signupform.username_id";
    private static final String EXTRA_PASSWORD_ID = "ng.com.gocheck.signupform.password_id";
    private static final String EXTRA_EMAIL_ID = "ng.com.gocheck.signupform.email_id";
    private static final String EXTRA_PHONE_NUMBER_ID ="ng.com.gocheck.signupform.phone_number_id";

//    member variables for retrieved extra
    private String mUsername;
    private String mPassword;
    private String mEmail;
    private String mNumber;

    public static Intent newIntent(Context context, String username, String password, String email, String number){
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra(EXTRA_USERNAME_ID, username);
        intent.putExtra(EXTRA_PASSWORD_ID, password);
        intent.putExtra(EXTRA_EMAIL_ID, email);
        intent.putExtra(EXTRA_PHONE_NUMBER_ID, number);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        /**
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            mUsername = (String) bundle.get(EXTRA_USERNAME_ID);
            mPassword =(String) bundle.get(EXTRA_PASSWORD_ID);
            mEmail = (String) bundle.get(EXTRA_EMAIL_ID);
            mNumber = (String) bundle.get(EXTRA_PHONE_NUMBER_ID);

            mDisplayView.setText(mUsername + "\n"+ mPassword + "\n" + mEmail+"\n" + mNumber);
        }
         */
        mUsername = getIntent().getStringExtra(EXTRA_USERNAME_ID);
        mPassword = getIntent().getStringExtra(EXTRA_PASSWORD_ID);
        mEmail = getIntent().getStringExtra(EXTRA_EMAIL_ID);
        mNumber = getIntent().getStringExtra(EXTRA_PHONE_NUMBER_ID);

        mDisplayView1 = findViewById(R.id.name);
        mDisplayView1.setText(mUsername);

        mDisplayView2 = findViewById(R.id.password);
        mDisplayView2.setText(mPassword);

        mDisplayView3 = findViewById(R.id.email);
        mDisplayView3.setText(mEmail);

        mDisplayView4 = findViewById(R.id.number);
        mDisplayView4.setText(mNumber);

        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();

    }
}
