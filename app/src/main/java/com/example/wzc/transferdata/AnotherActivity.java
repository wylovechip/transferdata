package com.example.yiwei.transferdata;
import android.os.Parcelable;
import android.util.Log;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
public class AnotherActivity extends AppCompatActivity
{
    private Button button;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        button = (Button)findViewById(R.id.button1);
        textView = (TextView)findViewById(R.id.textView1);

        Intent intent = getIntent();

        final String message = intent.getStringExtra("message").toString();
        textView.setText(message);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                String textView=intent.getStringExtra("message");

                intent.putExtra("result", message);
                setResult(0, intent);

                finish();
            }
        });
    }
}
