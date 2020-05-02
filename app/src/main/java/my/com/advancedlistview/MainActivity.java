package my.com.advancedlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ItemGenerator> itemGenerator;
    private String[] name;
    private TypedArray icon;
    private ListView listView;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv);


        name = getResources().getStringArray(R.array.names);
        icon = getResources().obtainTypedArray(R.array.names_icon);
        itemGenerator = new ArrayList<>();


        itemGenerator.add(new ItemGenerator(name[0], icon.getResourceId(0, -1), true, "25+"));
        itemGenerator.add(new ItemGenerator(name[1], icon.getResourceId(1, -1), true, "6"));
        itemGenerator.add(new ItemGenerator(name[2], icon.getResourceId(2, -1), false, " "));
        itemGenerator.add(new ItemGenerator(name[3], icon.getResourceId(3, -1), true, "20+"));
        itemGenerator.add(new ItemGenerator(name[4], icon.getResourceId(4, -1), false, " "));
        itemGenerator.add(new ItemGenerator(name[5], icon.getResourceId(5, -1), true, "6"));
        itemGenerator.add(new ItemGenerator(name[6], icon.getResourceId(6, -1), true, "19+"));
        itemGenerator.add(new ItemGenerator(name[7], icon.getResourceId(7, -1), false, " "));
        listView.setAdapter(new MyAdapter_For_ListView(MainActivity.this, itemGenerator));

    }
}
