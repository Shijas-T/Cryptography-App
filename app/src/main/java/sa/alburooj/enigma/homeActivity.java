package sa.alburooj.enigma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class homeActivity extends AppCompatActivity {

    private Button btn_encrypt,btn_decrypt;
    private ImageView img_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        on_menu();//What's on Menu
        on_click();//Their on Click Func.





    }

    private void on_click() {

        btn_encrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(homeActivity.this, encryptActivity.class);

                startActivity(intent);

            }
        });


        btn_decrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(homeActivity.this, decryptActivity.class);

                startActivity(intent);

            }
        });


        img_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(homeActivity.this, aboutActivity.class);

                startActivity(intent);

            }
        });


    }

    private void on_menu() {

        btn_encrypt = findViewById(R.id.btn_encryption);
        btn_decrypt = findViewById(R.id.btn_decryption);
        img_about = findViewById(R.id.img_about);
    }

}