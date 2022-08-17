package sa.alburooj.enigma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class decryptActivity extends AppCompatActivity {

    //Declaration
    EditText et_decrypt_input,et_key_input;
    Button btn_decrypted;
    TextView tv_decrypted;

    String message,d_message;
    int key;

    //Class Instance
    cryptography decrypt =new cryptography();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);
        getSupportActionBar().setTitle("Decrypt");

        on_menu(); //Whats on Menu
        on_click();//Their Click Func.
    }

    private void on_menu() {

        et_decrypt_input = findViewById(R.id.et_decrypt_input);
        et_key_input = findViewById(R.id.et_key_input_d);
        btn_decrypted = findViewById(R.id.btn_to_decrypt);
        tv_decrypted =findViewById(R.id.tv_decrypted);

        et_key_input.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
    }

    private void on_click() {

        btn_decrypted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                message = et_decrypt_input.getText().toString();
                key = Integer.parseInt(et_key_input.getText().toString());


                d_message = decrypt.decrypt(message,key);

                tv_decrypted.setText(d_message);

            }
        });



    }
}