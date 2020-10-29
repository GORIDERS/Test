package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] ListviewTitle = new String[] {
            "Aditi" , "Ashish", "Vishnu" , "Kashika", "Himanshu"
    };

    String[] ListviewDescription = new String[] {
            "Life is Good.." ,"Not so happening!!", "Whatever happens is for the good!!" , "Live Happily" , "No issues"
    };

    int[] ListviewImages = new int[] {
R.drawable.aditii, R.drawable.ashishj , R.drawable.vishnuu, R.drawable.kashikaa, R.drawable.hhimanshu
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i=0; i<5; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("ListTitle", ListviewTitle[i]);
            hm.put("ListDescription", ListviewDescription[i]);
            hm.put("ListImages", Integer.toString(ListviewImages[i]));
            aList.add(hm);
        }

        String[] from = {
                "ListImages", "ListTitle", "ListDescription"};
        int[] to = {
                R.id.listview_images, R.id.Title, R.id.Description
        };

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_items, from ,to);
        ListView simpleListview = (ListView)findViewById(R.id.list_view);
        simpleListview.setAdapter(simpleAdapter);
    }
}