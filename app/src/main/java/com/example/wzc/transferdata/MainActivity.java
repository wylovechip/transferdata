package com.example.yiwei.transferdata;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.TextView;
import android.app.Activity;
public class MainActivity extends AppCompatActivity
{
    private Button button;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        editText1 = (EditText)findViewById(R.id.editText1);

        button.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("message", editText1.getText().toString());
                intent.setClass(MainActivity.this, AnotherActivity.class);

                startActivityForResult(intent, 0);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0 && resultCode == 0)
        {
            String Text1 = data.getStringExtra("result");

            Toast.makeText(MainActivity.this, Text1, Toast.LENGTH_LONG).show();
        }
    }


}