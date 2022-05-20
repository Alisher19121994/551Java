package com.example.a551java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1;
    RecyclerView recyclerView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        watch();
        products();
    }

    public void watch() {

        recyclerView1 = findViewById(R.id.main_recyclerView_id);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Watch> list = new ArrayList<>();

        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));
        list.add(new Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"));


        Second_Adapter second_adapter = new Second_Adapter(this, list);
        recyclerView1.setAdapter(second_adapter);
    }

    public void products() {

        recyclerView2 = findViewById(R.id.rec_2);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Products> list = new ArrayList<>();

        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));
        list.add(new Products(R.drawable.ic_baseline_watch_24, "Base QuieCompact", "$199.00", "$279.00 - 29% OFF"));

        Main_Adapter main_adapter = new Main_Adapter(this, list);
        recyclerView2.setAdapter(main_adapter);
    }
}