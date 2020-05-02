package my.com.advancedlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter_For_ListView extends BaseAdapter {

    private Context context;
    private ArrayList<ItemGenerator> list;

    public MyAdapter_For_ListView(Context context, ArrayList<ItemGenerator> list) {

        this.context = context;
        this.list = list;

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_list_view, null);

        }

        TextView textView1 = convertView.findViewById(R.id.textView1);
        TextView textView2 = convertView.findViewById(R.id.textView2);
        ImageView imageView = convertView.findViewById(R.id.imageView);


        textView1.setText(list.get(position).getTitle());
        imageView.setImageResource(list.get(position).getIcon());



        if (list.get(position).getBol()) {

            textView2.setText(list.get(position).getpCount());

        } else
            textView2.setVisibility(View.GONE);





        return convertView;
    }
}
