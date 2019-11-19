package br.com.devcapu.twitelum.model;

import android.content.Context;
import android.widget.ListView;

import br.com.devcapu.twitelum.dao.TweetDAO;
import br.com.devcapu.twitelum.ui.adapter.ListaTweetAdapter;

public class FeedView {
    private final TweetDAO dao;
    private final ListaTweetAdapter adapter;
    private final Context context;

    public FeedView(Context context) {
        this.context = context;
        this.adapter = new ListaTweetAdapter(context);
        this.dao = new TweetDAO();
    }

    public void atualizaTweets() {
        adapter.atualiza(dao.todos());
    }

    public void configuraAdapter(ListView listaDeAlunos) {
        listaDeAlunos.setAdapter(adapter);
    }
}
