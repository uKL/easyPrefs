package com.mcs.easyprefssample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessagesViewHolder>
{

    private List<Message> list;
    private final List<Message> filteredList;
    private Context mContext;

    public MessageAdapter(Context context, List<Message> list) {
        this.list = list;
        this.mContext = context;
        this.filteredList = new ArrayList<>();
    }

    @Override
    public MessagesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_message, null);
        MessagesViewHolder mh = new MessagesViewHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(MessagesViewHolder viewHolder, int i) {
        Message app = list.get(i);

        viewHolder.name.setText(app.getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public void remove(int position) {
        list.remove(position);
        notifyItemRemoved(position);
    }
    public void clearData() {
        int size = this.list.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                this.list.remove(0);
            }

            this.notifyItemRangeRemoved(0, size);
        }
    }
    public void add(Message model, int position) {
        list.add(position, model);
        notifyItemInserted(position);
    }
    public void animateTo(List<Message> model) {
        applyAndAnimateRemovals(model);
        applyAndAnimateAdditions(model);
        applyAndAnimateMovedItems(model);
    }

    private void applyAndAnimateRemovals(List<Message> newModel) {
        for (int i = list.size() - 1; i >= 0; i--) {
            final Message model = list.get(i);
            if (!newModel.contains(model)) {
                removeItem(i);
            }
        }
    }

    private void applyAndAnimateAdditions(List<Message> newModel) {
        for (int i = 0, count = newModel.size(); i < count; i++) {
            final Message model = newModel.get(i);
            if (!list.contains(model)) {
                addItem(i, model);
            }
        }
    }

    private void applyAndAnimateMovedItems(List<Message> newModel) {
        for (int toPosition = newModel.size() - 1; toPosition >= 0; toPosition--) {
            final Message model = newModel.get(toPosition);
            final int fromPosition = list.indexOf(model);
            if (fromPosition >= 0 && fromPosition != toPosition) {
                moveItem(fromPosition, toPosition);
            }
        }
    }

    public Message removeItem(int position) {
        final Message model = list.remove(position);
        notifyItemRemoved(position);
        return model;
    }

    public void addItem(int position, Message model) {
        list.add(position, model);
        notifyItemInserted(position);

    }

    public void moveItem(int fromPosition, int toPosition) {
        final Message model = list.remove(fromPosition);
        list.add(toPosition, model);
        notifyItemMoved(fromPosition, toPosition);

    }
}