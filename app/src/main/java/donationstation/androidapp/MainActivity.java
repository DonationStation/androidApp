package donationstation.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // test
    }
    public void login(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void register(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

}
