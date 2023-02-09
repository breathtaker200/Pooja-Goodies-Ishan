package com.ishanapp.poojagoodiesishan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class HomeActivity extends AppCompatActivity {

    Button logout;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        logout = findViewById(R.id.logout);
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        gsc = GoogleSignIn.getClient(this, gso);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signOut();
            }
        });
    }

    private void signOut() {
        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                finish();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }

    public void login1(View view) {
        Toast.makeText(this, "BHAKTI TV clicked...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, Channel1Activity.class));
    }

    public void login2(View view) {
        Toast.makeText(this, "AASTHA CHANNEL clicked...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, Channel2Activity.class));
    }

    public void login3(View view) {
        Toast.makeText(this, "BHAKTI SAGAR CHANNEL clicked...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, Channel3Activity.class));
    }

    public void login4(View view) {
        Toast.makeText(this, "ANIRUDDHACHARYA JI CHANNEL clicked...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, Channel4Activity.class));
    }

    public void login5(View view) {
        Toast.makeText(this, "SATSANG CHANNEL clicked...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, Channel5Activity.class));
    }

    public void login6(View view) {
        Toast.makeText(this, "DEVIKANANDAN CHANNEL clicked...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, Channel6Activity.class));
    }

    public void login7(View view) {
        Toast.makeText(this, "PANDIT PRADEEP MISHRA CHANNEL clicked...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, Channel7Activity.class));
    }

    public void login8(View view) {
        Toast.makeText(this, "JAYAKISHORI CHANNEL clicked...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, Channel8Activity.class));
    }

    public void login9(View view) {
        Toast.makeText(this, "SADHNA GOLD CHANNEL clicked...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, Channel9Activity.class));
    }

    public void login10(View view) {
        Toast.makeText(this, "GAURI GOPAL TV CHANNEL clicked...", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(HomeActivity.this, Channel10Activity.class));
    }
}
