package com.example.mymessenger;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Asocia el layout activity_main.xml

        // Encontrar el campo de texto (EditText) en el layout
        EditText messageEditText = findViewById(R.id.et_message);

        // Encontrar el botón en el layout
        Button sendButton = findViewById(R.id.btn_send_message);

        // Configurar el clic del botón para enviar un mensaje
        sendButton.setOnClickListener(v -> {
            // Obtener el texto escrito por el usuario
            String message = messageEditText.getText().toString();

            // Crear un Intent para iniciar la actividad de recepción
            Intent intent = new Intent(MainActivity.this, ReceiveMessageActivity.class);

            // Añadir el mensaje al Intent
            intent.putExtra("MESSAGE", message);

            // Iniciar la actividad
            startActivity(intent);
        });
    }
}
