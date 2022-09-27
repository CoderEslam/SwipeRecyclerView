package com.doubleclick.swiperecyclerview;

import static com.doubleclick.swiperecyclerview.MyAdapter.*;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Eslam Ghazy on 9/27/2022
 */
public class MyAdapter extends DragDropSwipeAdapter<String, MyAdapter.ViewHolder> {

    public MyAdapter(@NonNull List<? extends String> dataSet) {
        super(dataSet);
    }

    @NonNull
    @Override
    protected ViewHolder getViewHolder(@NonNull View view) {
        return new ViewHolder(view);
    }

    @Nullable
    @Override
    protected View getViewToTouchToStartDraggingItem(String s, @NonNull ViewHolder viewHolder, int i) {
        return viewHolder.drag_icon;
    }

    @Override
    protected void onBindViewHolder(String s, @NonNull ViewHolder viewHolder, int i) {
        viewHolder.item_text.setText(s);
    }

    public class ViewHolder extends DragDropSwipeAdapter.ViewHolder {
        TextView item_text;
        ImageView drag_icon;

        public ViewHolder(@NonNull View layout) {
            super(layout);
            item_text = layout.findViewById(R.id.item_text);
            drag_icon = layout.findViewById(R.id.drag_icon);
        }
    }

}
