package br.com.devcapu.twitelum.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.devcapu.twitelum.R;
import br.com.devcapu.twitelum.model.Tweet;

public class ListaTweetAdapter extends BaseAdapter {
    private final List<Tweet> tweets = new ArrayList<>();
    private final Context context;

    public ListaTweetAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return tweets.size();
    }

    @Override
    public Object getItem(int position) {
        return tweets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return tweets.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view = criaView(viewGroup);
        Tweet tweet = tweets.get(position);
        vinculaAlunoComView(view, tweet);
        return view;
    }

    private void vinculaAlunoComView(View viewCriada, Tweet tweetDevolvido) {
        TextView usuario = viewCriada.findViewById(R.id.item_tweet_usuario);
        usuario.setText(tweetDevolvido.getUsuario().getUsuario());

        TextView texto = viewCriada.findViewById(R.id.item_tweet_texto);
        texto.setText(tweetDevolvido.getTexto());
    }

    private View criaView(ViewGroup viewGroup) {
        return LayoutInflater
                .from(context)
                .inflate(R.layout.item_tweet, viewGroup, false);
    }

    public void atualiza(List<Tweet> tweets) {
        this.tweets.clear();
        this.tweets.addAll(tweets);
        notifyDataSetChanged();
    }
}
