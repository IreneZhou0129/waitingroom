package uottahack.waiting_room;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by xiaoxinzhou on 2018-02-17.
 */

public abstract class Review_page extends AppCompatActivity {
    EditText title_review;
    EditText comments_review;
    Button b_submit_review;

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
