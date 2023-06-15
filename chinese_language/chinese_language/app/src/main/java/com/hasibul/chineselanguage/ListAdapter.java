package com.hasibul.chineselanguage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListItem> itemList;

    public ListAdapter(List<ListItem> itemList) {
        this.itemList = itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ListItem item = this.itemList.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("item_id", item.getId());
                intent.putExtra("item_title", item.getTitle());
                intent.putExtra("item_description", item.getDescription());
                v.getContext().startActivity(intent);
            }
        });
        holder.thumbnailImageView.setImageResource(item.getThumbnail());
        holder.titleTextView.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnailImageView;
        TextView titleTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.thumbnailImageView = (ImageView) itemView.findViewById(R.id.thumbnail_image_view);
            this.titleTextView = (TextView) itemView.findViewById(R.id.title_text_view);
        }
    }
}
