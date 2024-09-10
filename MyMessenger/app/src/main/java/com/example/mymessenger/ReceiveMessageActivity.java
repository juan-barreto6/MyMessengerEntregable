package com.example.mymessenger;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        // Encontrar el TextView en el layout
        TextView receivedMessage = findViewById(R.id.tv_received_message);

        // Obtener el Intent que inició esta actividad y extraer el mensaje
        Intent intent = getIntent();
        String message = intent.getStringExtra("MESSAGE");

        // Mostrar el mensaje en el TextView
        receivedMessage.setText(message);
    }
}
