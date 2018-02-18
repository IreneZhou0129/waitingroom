package uottahack.waiting_room;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button qr_button;
    private Button cancel_button;
    private Button review_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    private String getInputOfTextField(int id) {
        View v = findViewById(id);
        EditText editText = (EditText) v;
        String input = editText.getText().toString();
        return input;
    }


}
