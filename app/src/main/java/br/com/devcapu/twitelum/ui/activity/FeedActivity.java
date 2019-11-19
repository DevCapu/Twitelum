package br.com.devcapu.twitelum.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CpuUsageInfo;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.devcapu.twitelum.R;
import br.com.devcapu.twitelum.dao.TweetDAO;
import br.com.devcapu.twitelum.model.FeedView;
import br.com.devcapu.twitelum.model.Tweet;
import br.com.devcapu.twitelum.model.Usuario;

public class FeedActivity extends AppCompatActivity {

    private final FeedView feedView = new FeedView(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        Usuario felipe = new Usuario("Felipe Moreno", "DevCapu", "1323456");

        TweetDAO tweetDao = new TweetDAO();

        Tweet tweet = new Tweet(felipe, "São Paulo é estranho");
        tweetDao.salva(tweet);
        configuraLista();
    }

    @Override
    protected void onResume() {
        super.onResume();
        feedView.atualizaTweets();
    }

    private void configuraLista() {
        ListView listaTweets = findViewById(R.id.activity_feed_lista_tweets);
        feedView.configuraAdapter(listaTweets);
    }
}
