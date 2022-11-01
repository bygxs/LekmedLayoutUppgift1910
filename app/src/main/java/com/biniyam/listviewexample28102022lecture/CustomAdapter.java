package com.biniyam.listviewexample28102022lecture;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter <User>{
    public CustomAdapter (Context context, ArrayList<User> itemList){
        super(context, R.layout.list_item_custom, itemList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user = getItem(position);

        if (convertView == null){    // inflater gör om Java koder till xml views under runtime
            LayoutInflater.from(getContext()).inflate(R.layout.list_item_custom, parent, false);
        }

        TextView name = convertView.findViewById(R.id.text_view_name);
        TextView age = convertView.findViewById(R.id.text_view_age);

        name.setText(user.name);
        age.setText(user.age);
        return convertView; // this is our custome view. this is it
        // Todo: summery of this lectue at video recording 00:46
    }
}
