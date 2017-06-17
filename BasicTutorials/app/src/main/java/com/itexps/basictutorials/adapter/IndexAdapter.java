package com.itexps.basictutorials.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.itexps.basictutorials.R;
import com.itexps.basictutorials.data.TutorialIndexItem;

import java.util.ArrayList;

/**
 * Created by Akshaykumar Patel on 6/11/2017.
 * E-mail on akshayhp@outlook.com
 */

public class IndexAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<TutorialIndexItem> items;
    private LayoutInflater inflater;


    public IndexAdapter(Context context, ArrayList<TutorialIndexItem> items) {
        this.context = context;
        this.items = items;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(null==convertView)
        {
            convertView = this.inflater.inflate(R.layout.item_tutorial_index_group,parent,false);
        }

        TextView textViewNumber = (TextView) convertView.findViewById(R.id.textView_no);
        TextView textViewTitle = (TextView) convertView.findViewById(R.id.textView_title);

        textViewNumber.setText((position+1)+")");
        TutorialIndexItem item = items.get(position);
        textViewTitle.setText(item.getTitle());

        return convertView;
    }
}
