package com.example.myfourapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserListRecyclerViewAdapter extends RecyclerView.Adapter<UserListRecyclerViewAdapter.ViewHolder> {

    private final List<UserListItem> userList;
    private final LayoutInflater inflater;

    public UserListRecyclerViewAdapter(Context context, List<UserListItem> userList) {
        this.userList = userList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_user_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserListItem item = userList.get(position);
        holder.userNameItem.setText(item.getTextUserName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Item " + (holder.getAdapterPosition() + 1) + " clicked", Toast.LENGTH_SHORT).show();
                Log.d("myLogs", "Item " + (holder.getAdapterPosition() + 1) + " clicked");
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView userNameItem;

        ViewHolder(View view) {
            super(view);
            userNameItem = view.findViewById(R.id.userNameItem);
        }
    }
}