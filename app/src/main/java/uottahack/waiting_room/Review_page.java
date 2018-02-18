package uottahack.waiting_room;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

/**
 * Created by xiaoxinzhou on 2018-02-17.
 */

public class Review_page extends AppCompatActivity {
    EditText title_review;
    EditText comments_review;
    FloatingTextButton b_submit_review;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review_page);
    }
    /* Haven't used */
    /*
    public void submitComments(){
        comments_review = (EditText) findViewById(R.id.comment_bt);
        String comment_str = comments_review.getText().toString().trim();

    } */

}
