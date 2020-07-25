package ubaidiyah.nafees.demo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.demo.R;

import ubaidiyah.nafees.demo.adapter.RecyclerAdapter;
import ubaidiyah.nafees.demo.model.ListItem;

public class ParahListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parah_list);

        //! creating list
        ListItem[] list = new ListItem[30];
        list[0] = new ListItem(1, getResources().getString(R.string.para1),
                getResources().getInteger(R.integer.para1_pageno) );
        list[1] = new ListItem(2, getResources().getString(R.string.para2),
                getResources().getInteger(R.integer.para2_pageno) );
        list[2] = new ListItem(3, getResources().getString(R.string.para3),
                getResources().getInteger(R.integer.para3_pageno) );
        list[3] = new ListItem(4, getResources().getString(R.string.para4),
                getResources().getInteger(R.integer.para4_pageno) );
        list[4] = new ListItem(5, getResources().getString(R.string.para5),
                getResources().getInteger(R.integer.para5_pageno) );
        list[5] = new ListItem(6, getResources().getString(R.string.para6),
                getResources().getInteger(R.integer.para6_pageno) );
        list[6] = new ListItem(7, getResources().getString(R.string.para7),
                getResources().getInteger(R.integer.para7_pageno) );
        list[7] = new ListItem(8, getResources().getString(R.string.para8),
                getResources().getInteger(R.integer.para8_pageno) );
        list[8] = new ListItem(9, getResources().getString(R.string.para9),
                getResources().getInteger(R.integer.para9_pageno) );
        list[9] = new ListItem(10, getResources().getString(R.string.para10),
                getResources().getInteger(R.integer.para10_pageno) );
        list[10] = new ListItem(11, getResources().getString(R.string.para11),
                getResources().getInteger(R.integer.para11_pageno) );
        list[11] = new ListItem(12, getResources().getString(R.string.para12),
                getResources().getInteger(R.integer.para12_pageno) );
        list[12] = new ListItem(13, getResources().getString(R.string.para13),
                getResources().getInteger(R.integer.para13_pageno) );
        list[13] = new ListItem(14, getResources().getString(R.string.para14),
                getResources().getInteger(R.integer.para14_pageno) );
        list[14] = new ListItem(15, getResources().getString(R.string.para15),
                getResources().getInteger(R.integer.para15_pageno) );
        list[15] = new ListItem(16, getResources().getString(R.string.para16),
                getResources().getInteger(R.integer.para16_pageno) );
        list[16] = new ListItem(17, getResources().getString(R.string.para17),
                getResources().getInteger(R.integer.para17_pageno) );
        list[17] = new ListItem(18, getResources().getString(R.string.para18),
                getResources().getInteger(R.integer.para18_pageno) );
        list[18] = new ListItem(19, getResources().getString(R.string.para19),
                getResources().getInteger(R.integer.para19_pageno) );
        list[19] = new ListItem(20, getResources().getString(R.string.para20),
                getResources().getInteger(R.integer.para20_pageno) );
        list[20] = new ListItem(21, getResources().getString(R.string.para21),
                getResources().getInteger(R.integer.para21_pageno) );
        list[21] = new ListItem(22, getResources().getString(R.string.para22),
                getResources().getInteger(R.integer.para22_pageno) );
        list[22] = new ListItem(23, getResources().getString(R.string.para23),
                getResources().getInteger(R.integer.para23_pageno) );
        list[23] = new ListItem(24, getResources().getString(R.string.para24),
                getResources().getInteger(R.integer.para24_pageno) );
        list[24] = new ListItem(25, getResources().getString(R.string.para25),
                getResources().getInteger(R.integer.para25_pageno) );
        list[25] = new ListItem(26, getResources().getString(R.string.para26),
                getResources().getInteger(R.integer.para26_pageno) );
        list[26] = new ListItem(27, getResources().getString(R.string.para27),
                getResources().getInteger(R.integer.para27_pageno) );
        list[27] = new ListItem(28, getResources().getString(R.string.para28),
                getResources().getInteger(R.integer.para28_pageno) );
        list[28] = new ListItem(29, getResources().getString(R.string.para29),
                getResources().getInteger(R.integer.para29_pageno) );
        list[29] = new ListItem(30, getResources().getString(R.string.para30),
                getResources().getInteger(R.integer.para30_pageno) );

        //! recycler view
        RecyclerView recyclerView = findViewById(R.id.rv_parahlist);
        //! creating and setting adapter
        RecyclerAdapter adapter = new RecyclerAdapter(list);
        //! attach adapter to recyclerview
        recyclerView.setAdapter(adapter);
        //! set layout manager to position the items
        recyclerView.setLayoutManager(new LinearLayoutManager(this) );
    }
}