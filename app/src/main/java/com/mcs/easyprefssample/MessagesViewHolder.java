package com.mcs.easyprefssample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MessagesViewHolder extends RecyclerView.ViewHolder {

    public @BindView(R.id.title) TextView name;

    public MessagesViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindView(Message model) {
        name.setText(model.getTitle());
    }
}