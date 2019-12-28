package com.example.todolist;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkDetailFragment extends Fragment {
    private long categoryId;

    public WorkDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work_detail, container, false);
    }


    public void onStart(){
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Category category = Category.categories[(int) categoryId];
            title.setText(category.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(category.getDescription());
        }
    }


    public void setCategory(long id){
        this.categoryId = id;
    }

}
