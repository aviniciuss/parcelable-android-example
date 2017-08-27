package br.com.parcelableexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Person> mList;

    public PersonAdapter(Context context, ArrayList<Person> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Person person = mList.get(position);
        View layout;

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layout = inflater.inflate(R.layout.item_person, null);

        TextView tvName = layout.findViewById(R.id.tv_name);
        tvName.setText(person.name);

        return layout;
    }
}
