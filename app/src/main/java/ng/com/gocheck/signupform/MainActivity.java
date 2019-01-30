package ng.com.gocheck.signupform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mUserName, mPassword, mEmail, mPhoneNumber;
    private Button mSaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserName = findViewById(R.id.user_name);
        mPassword = findViewById(R.id.password);
        mEmail = findViewById(R.id.email);
        mPhoneNumber = findViewById(R.id.phone_number);

        mSaveButton = findViewById(R.id.save_button);
        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = DetailsActivity.newIntent(MainActivity.this, mUserName.getText().toString(),
                        mPassword.getText().toString(), mEmail.getText().toString(), mPhoneNumber.getText().toString());
                startActivity(intent);

//                reset the editText
                mUserName.setText(null);
                mPassword.setText(null);
                mEmail.setText(null);
                mPhoneNumber.setText(null);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
