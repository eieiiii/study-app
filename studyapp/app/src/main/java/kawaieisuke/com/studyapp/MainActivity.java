package kawaieisuke.com.studyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    TextView countTextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countTextview = (TextView) findViewById(R.id.textView);

    }

    public void plus(View view){
        count = count+1;
        countTextview.setText(String.valueOf(count));
    }
}
