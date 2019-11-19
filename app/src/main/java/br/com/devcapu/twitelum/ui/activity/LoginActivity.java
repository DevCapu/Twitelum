package br.com.devcapu.twitelum.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.devcapu.twitelum.R;

public class LoginActivity extends AppCompatActivity {
    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        configuraBotaoLogin();
    }

    private void configuraBotaoLogin() {
        Button botaoEntrar = findViewById(R.id.activity_login_button_entrar);
        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText campoUsuario = findViewById(R.id.activity_login_input_usuario);
                EditText campoSenha = findViewById(R.id.activity_login_input_senha);

                String valorCampoUsuario = campoUsuario.getText().toString();
                Log.i("Campo usuário", "valorCampoUsuario: " + valorCampoUsuario);
                String valorCampoSenha = campoSenha.getText().toString();
                Log.i("Campo usuário", "valorCampoSenha: " + valorCampoSenha);

                if (valorCampoUsuario.equals("DevCapu") && valorCampoSenha.equals("123456")) {
                    Toast.makeText(context, "Entrou", Toast.LENGTH_LONG)
                            .show();
                } else {
                    Toast.makeText(context, "Não entrou", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });
    }
}
