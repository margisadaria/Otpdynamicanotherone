package e.margi.otpdynamicanotherone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Groupid  extends AppCompatActivity {

    private TextView text;
    private Button btn;
    int randomno;
    char randomChar;
    Button getdetails;

    final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groupid);

        text = findViewById(R.id.tv_rendom);
        btn = findViewById(R.id.btn_backtologin);
        //getdetails=(Button)findViewById(R.id.getdetail);

        Random r = new Random();
        //  Random rnd = new Random();
        char randomChar = alphabet.charAt(r.nextInt(alphabet.length()));
        Log.i("myapp", "Thread ID is "+Thread.currentThread().getId() + ", Random character is "+randomChar);
        String generatedPassword = String.format("%06d", r.nextInt(1000000));
        Log.d("MyApp", "Generated Password : " + generatedPassword);

        text.setText(randomChar+""+generatedPassword);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Groupid.this, Login_form.class));

            }
        });
       }


}
