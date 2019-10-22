package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Permission extends AppCompatActivity {

    Button btnMsg, btnPhone, btnCamera;
    EditText txtPhone, txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);

        btnMsg = (Button)findViewById(R.id.btnMsg);
        btnPhone = (Button)findViewById(R.id.btnPhone);
        btnCamera = (Button)findViewById(R.id.btnCamera);

        txtPhone = (EditText)findViewById(R.id.txtPhone);
        txtDesc = (EditText)findViewById(R.id.txtDesc);

        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SmsManager sms = SmsManager.getDefault();

                if (Build.VERSION.SDK_INT >= 23){
                    if (ContextCompat.checkSelfPermission(Permission.this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Permission.this, new String[] {Manifest.permission.SEND_SMS}, 1000 );
                    }else{
                        sms.sendTextMessage(txtPhone.getText().toString(), null, txtDesc.getText().toString(), null, null);
                        Toast.makeText(Permission.this, "Message Sent to:" +txtPhone.getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                }else{
                    sms.sendTextMessage(txtPhone.getText().toString(), null, txtDesc.getText().toString(), null, null);
                    Toast.makeText(Permission.this, "Message Sent to:" +txtPhone.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+txtPhone.getText().toString()));

                if (Build.VERSION.SDK_INT >= 23){
                    if (ContextCompat.checkSelfPermission(Permission.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Permission.this, new String[] {Manifest.permission.CALL_PHONE}, 1000 );
                    }else{
                        startActivity(i);
                    }
                }else{
                    startActivity(i);
                }

            }
        });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }
}
