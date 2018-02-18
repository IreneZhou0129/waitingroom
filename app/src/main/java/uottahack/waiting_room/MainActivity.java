package uottahack.waiting_room;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Vibrator;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        // Vibrate for 500 milliseconds
        v.vibrate(500);
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
