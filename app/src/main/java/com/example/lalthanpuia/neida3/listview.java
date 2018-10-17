package com.example.lalthanpuia.neida3;

import android.content.Context;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class listview extends AppCompatActivity {

    ListView lv;
    Integer[] images;
    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        //imageView=findViewById(R.id.image);
        images = new Integer[]{R.drawable.zikhlum_button, R.drawable.serthlumbutton, R.drawable.vaimimbutton, R.drawable.papaya_button};

        CustomAdapter customAdapter = new CustomAdapter();
        lv = findViewById(R.id.list_item);

        lv.setAdapter(customAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
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

            convertView = getLayoutInflater().inflate(R.layout.custom_row, null);

            imageView = convertView.findViewById(R.id.image);

            imageView.setImageResource(images[position]);

            return convertView;
        }
    }
}
