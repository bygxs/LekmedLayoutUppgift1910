package com.biniyam.arraylistviewlecture;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter {

    public class CustomeAdapter extends ArrayAdapter<>

    public CustomAdapter(Context context, ArrayList<User> itemList) {
        super(context, R.layout.list_item_ccustom, itemList);

        //todo follow on zoom recording. Again!
    }
    //@NonNull
    //Overide
    // public View getView(int postion........)

    User user = getItem(psittion);

        if(converterView ==null)

    {
        converterView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_ccustom, parent, false);
    }

    TextView name = convertView.findViewById(R.id.text_view_name);
    TextView age = convertView.findViewById(R.id.text_view_age);

    //name.setText(user.name);
    //age.setText(user.age);


    //return super.getView(postion, convertView, parent);

}
}
