package br.com.devcapu.twitelum.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import br.com.devcapu.twitelum.R;
import br.com.devcapu.twitelum.dao.TweetDAO;
import br.com.devcapu.twitelum.model.Tweet;
import br.com.devcapu.twitelum.model.Usuario;


public class FormularioNovoTweetActivity extends AppCompatActivity {

    private final TweetDAO dao = new TweetDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_novo_tweet);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater()
                .inflate(R.menu.activity_formulario_tweet_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.activity_formulario_tweet_menu_salvar) {
            EditText texto = findViewById(R.id.activity_formulario_input_tweet);
            String campoTexto = texto.getText().toString();
            Tweet novoTweet = new Tweet(new Usuario("Felipe Moreno Borges", "DevCapu", "123456"), campoTexto);
            dao.salva(novoTweet);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
