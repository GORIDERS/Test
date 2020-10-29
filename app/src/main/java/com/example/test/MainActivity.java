package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    String[] ListviewTitle = new String[] {
            "Listview Title 1" , "Listview Title 2", "Listview Title 3" , "Listview Title 4", "Listview Title 5"
    };

    String[] ListviewDescription = new String[] {
            "Listview Description 1" ,"Listview Description 2", "Listview Description 3" , "Listview Description 4" , "Listview Description 5"
    };

    int[] ListviewImages = new int[] {
R.drawable.aij, R.drawable.aix , R.drawable.aiy, R.drawable.aiu, R.drawable.aio
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int x =0; x<0; x++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("ListTitle", ListviewTitle[x]);
            hm.put("ListDescription", ListviewDescription[x]);
            hm.put("ListImages", Integer.toString(ListviewImages[x]));
            aList.add(hm);
        }

        String[] from = {
                "ListImages", "ListTitle", "ListDescription"};
        int[] to = {
                R.id.listview_images, R.id.Title, R.id.Description
        };

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_items, from ,to);
        ListView simpleListview = (ListView)findViewById(R.id.list_view);
    }
}