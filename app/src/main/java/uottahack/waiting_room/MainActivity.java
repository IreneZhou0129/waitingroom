package uottahack.waiting_room;

<<<<<<< HEAD
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
=======
import android.content.Intent;
>>>>>>> b4a648d4b968c97135e24d2766780e7d4ad37dc2
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
=======
import android.widget.EditText;
>>>>>>> b4a648d4b968c97135e24d2766780e7d4ad37dc2
import android.widget.TextView;

import com.google.android.gms.vision.barcode.Barcode;

public class MainActivity extends AppCompatActivity {

<<<<<<< HEAD
    Button scanButton;
    TextView result;
    public static final int REQUEST_CODE = 100;
    public static final int PERMISSION_REQUEST = 200;
=======
    private Button qr_button;
    private Button cancel_button;
    private Button review_button;

>>>>>>> b4a648d4b968c97135e24d2766780e7d4ad37dc2
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        scanButton = findViewById(R.id.QR);
        result = findViewById(R.id.result);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, PERMISSION_REQUEST);
        }
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CodeScanner.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
=======
        qr_button = (Button)findViewById(R.id.QR);
        cancel_button = (Button)findViewById(R.id.cancel);
        review_button = (Button)findViewById(R.id.reviewPageButton);

        //Irene: I only added the functionality to the review button
        review_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Review_page.class);
                startActivity(intent);
            }
        });
    }




    private void setContentsOfTextView(int id, String newContents) {
        View v = findViewById(id);
        TextView textView = (TextView) v;
        textView.setText(newContents);
>>>>>>> b4a648d4b968c97135e24d2766780e7d4ad37dc2
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            if (data != null) {
                final Barcode barcode = data.getParcelableExtra("barcode");
                result.post(new Runnable() {
                    @Override
                    public void run() {
                        result.setText(barcode.displayValue);
                    }
                });
            }
        }
    }


}
