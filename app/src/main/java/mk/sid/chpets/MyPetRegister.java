package mk.sid.chpets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MyPetRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pet_register);

        final EditText etFName = (EditText) findViewById(R.id.etFName);
        final EditText etLName = (EditText) findViewById(R.id.etLName);
        final EditText etNumber = (EditText) findViewById(R.id.etNumber);
        final EditText etEMail = (EditText) findViewById(R.id.etEMail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bRegister =(Button) findViewById(R.id.bRegister);
    }
}
