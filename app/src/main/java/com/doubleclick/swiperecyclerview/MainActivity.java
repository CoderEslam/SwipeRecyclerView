package com.doubleclick.swiperecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    DragDropSwipeRecyclerView dragDropSwipeRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dragDropSwipeRecyclerView = findViewById(R.id.list);
        List<String> list = new ArrayList<>();
        list.add("eslam 1");
        list.add("eslam 2");
        list.add("eslam 3");
        list.add("eslam 4");
        list.add("eslam 5");
        list.add("eslam 6");
        list.add("eslam 7");
        list.add("eslam 8");
        list.add("eslam 9");
        list.add("eslam 10");
        list.add("eslam 21");
        list.add("eslam 31");
        list.add("eslam 41");
        list.add("eslam 51");
        list.add("eslam 61");
        list.add("eslam 71");
        list.add("eslam 81");
        list.add("eslam 91");
        dragDropSwipeRecyclerView.setAdapter(new MyAdapter(list));

    }
}