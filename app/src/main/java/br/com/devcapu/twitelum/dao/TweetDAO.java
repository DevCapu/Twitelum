package br.com.devcapu.twitelum.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.devcapu.twitelum.model.Tweet;

public class TweetDAO {

    private final static List<Tweet> tweets = new ArrayList<>();
    private static int contadorDeId = 1;

    public void salva(Tweet tweet) {
        tweet.setId(contadorDeId);
        tweets.add(tweet);
        atualizaIds();
    }

    private void atualizaIds() {
        contadorDeId++;
    }

    public void edita(Tweet tweet) {
        Tweet tweetEncontrado = buscaTweetPeloId(tweet);
        if (tweetEncontrado != null) {
            int posicaoDoTweet = tweets.indexOf(tweetEncontrado);
            tweets.set(posicaoDoTweet, tweet);
        }
    }

    private Tweet buscaTweetPeloId(Tweet tweet) {
        for (Tweet a : tweets) {
            if (a.getId() == tweet.getId()) {
                return a;
            }
        }
        return null;
    }

    public List<Tweet> todos() {
        return new ArrayList<>(tweets);
    }

    public void remove(Tweet tweet) {
        Tweet tweetDevolvido = buscaTweetPeloId(tweet);
        if (tweet != null) {
            tweets.remove(tweetDevolvido);
        }
    }
}
