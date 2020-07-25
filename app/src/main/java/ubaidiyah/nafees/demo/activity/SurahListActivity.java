package ubaidiyah.nafees.demo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.example.demo.R;

import ubaidiyah.nafees.demo.adapter.RecyclerAdapter;
import ubaidiyah.nafees.demo.model.ListItem;
import ubaidiyah.nafees.demo.utils.Constants;

public class SurahListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_list);

        //! creating list
        ListItem[] list = new ListItem[114];
        list[0] = new ListItem(1, getResources().getString(R.string.sura1),
                getResources().getInteger(R.integer.sura1_pageno) );
        list[1] = new ListItem(2, getResources().getString(R.string.sura2),
                getResources().getInteger(R.integer.sura2_pageno) );
        list[2] = new ListItem(3, getResources().getString(R.string.sura3),
                getResources().getInteger(R.integer.sura3_pageno) );
        list[3] = new ListItem(4, getResources().getString(R.string.sura4),
                getResources().getInteger(R.integer.sura4_pageno) );
        list[4] = new ListItem(5, getResources().getString(R.string.sura5),
                getResources().getInteger(R.integer.sura5_pageno) );
        list[5] = new ListItem(6, getResources().getString(R.string.sura6),
                getResources().getInteger(R.integer.sura6_pageno) );
        list[6] = new ListItem(7, getResources().getString(R.string.sura7),
                getResources().getInteger(R.integer.sura7_pageno) );
        list[7] = new ListItem(8, getResources().getString(R.string.sura8),
                getResources().getInteger(R.integer.sura8_pageno) );
        list[8] = new ListItem(9, getResources().getString(R.string.sura9),
                getResources().getInteger(R.integer.sura9_pageno) );
        list[9] = new ListItem(10, getResources().getString(R.string.sura10),
                getResources().getInteger(R.integer.sura10_pageno) );
        list[10] = new ListItem(11, getResources().getString(R.string.sura11),
                getResources().getInteger(R.integer.sura11_pageno) );
        list[11] = new ListItem(12, getResources().getString(R.string.sura12),
                getResources().getInteger(R.integer.sura12_pageno) );
        list[12] = new ListItem(13, getResources().getString(R.string.sura13),
                getResources().getInteger(R.integer.sura13_pageno) );
        list[13] = new ListItem(14, getResources().getString(R.string.sura14),
                getResources().getInteger(R.integer.sura14_pageno) );
        list[14] = new ListItem(15, getResources().getString(R.string.sura15),
                getResources().getInteger(R.integer.sura15_pageno) );
        list[15] = new ListItem(16, getResources().getString(R.string.sura16),
                getResources().getInteger(R.integer.sura16_pageno) );
        list[16] = new ListItem(17, getResources().getString(R.string.sura17),
                getResources().getInteger(R.integer.sura17_pageno) );
        list[17] = new ListItem(18, getResources().getString(R.string.sura18),
                getResources().getInteger(R.integer.sura18_pageno) );
        list[18] = new ListItem(19, getResources().getString(R.string.sura19),
                getResources().getInteger(R.integer.sura19_pageno) );
        list[19] = new ListItem(20, getResources().getString(R.string.sura20),
                getResources().getInteger(R.integer.sura20_pageno) );
        list[20] = new ListItem(21, getResources().getString(R.string.sura21),
                getResources().getInteger(R.integer.sura21_pageno) );
        list[21] = new ListItem(22, getResources().getString(R.string.sura22),
                getResources().getInteger(R.integer.sura22_pageno) );
        list[22] = new ListItem(23, getResources().getString(R.string.sura23),
                getResources().getInteger(R.integer.sura23_pageno) );
        list[23] = new ListItem(24, getResources().getString(R.string.sura24),
                getResources().getInteger(R.integer.sura24_pageno) );
        list[24] = new ListItem(25, getResources().getString(R.string.sura25),
                getResources().getInteger(R.integer.sura25_pageno) );
        list[25] = new ListItem(26, getResources().getString(R.string.sura26),
                getResources().getInteger(R.integer.sura26_pageno) );
        list[26] = new ListItem(27, getResources().getString(R.string.sura27),
                getResources().getInteger(R.integer.sura27_pageno) );
        list[27] = new ListItem(28, getResources().getString(R.string.sura28),
                getResources().getInteger(R.integer.sura28_pageno) );
        list[28] = new ListItem(29, getResources().getString(R.string.sura29),
                getResources().getInteger(R.integer.sura29_pageno) );
        list[29] = new ListItem(30, getResources().getString(R.string.sura30),
                getResources().getInteger(R.integer.sura30_pageno) );
        list[30] = new ListItem(31, getResources().getString(R.string.sura31),
                getResources().getInteger(R.integer.sura31_pageno) );
        list[31] = new ListItem(32, getResources().getString(R.string.sura32),
                getResources().getInteger(R.integer.sura32_pageno) );
        list[32] = new ListItem(33, getResources().getString(R.string.sura33),
                getResources().getInteger(R.integer.sura33_pageno) );
        list[33] = new ListItem(34, getResources().getString(R.string.sura34),
                getResources().getInteger(R.integer.sura34_pageno) );
        list[34] = new ListItem(35, getResources().getString(R.string.sura35),
                getResources().getInteger(R.integer.sura35_pageno) );
        list[35] = new ListItem(36, getResources().getString(R.string.sura36),
                getResources().getInteger(R.integer.sura36_pageno) );
        list[36] = new ListItem(37, getResources().getString(R.string.sura37),
                getResources().getInteger(R.integer.sura37_pageno) );
        list[37] = new ListItem(38, getResources().getString(R.string.sura38),
                getResources().getInteger(R.integer.sura38_pageno) );
        list[38] = new ListItem(39, getResources().getString(R.string.sura39),
                getResources().getInteger(R.integer.sura39_pageno) );
        list[39] = new ListItem(40, getResources().getString(R.string.sura40),
                getResources().getInteger(R.integer.sura40_pageno) );
        list[40] = new ListItem(41, getResources().getString(R.string.sura41),
                getResources().getInteger(R.integer.sura41_pageno) );
        list[41] = new ListItem(42, getResources().getString(R.string.sura42),
                getResources().getInteger(R.integer.sura42_pageno) );
        list[42] = new ListItem(43, getResources().getString(R.string.sura43),
                getResources().getInteger(R.integer.sura43_pageno) );
        list[43] = new ListItem(44, getResources().getString(R.string.sura44),
                getResources().getInteger(R.integer.sura44_pageno) );
        list[44] = new ListItem(45, getResources().getString(R.string.sura45),
                getResources().getInteger(R.integer.sura45_pageno) );
        list[45] = new ListItem(46, getResources().getString(R.string.sura46),
                getResources().getInteger(R.integer.sura46_pageno) );
        list[46] = new ListItem(47, getResources().getString(R.string.sura47),
                getResources().getInteger(R.integer.sura47_pageno) );
        list[47] = new ListItem(48, getResources().getString(R.string.sura48),
                getResources().getInteger(R.integer.sura48_pageno) );
        list[48] = new ListItem(49, getResources().getString(R.string.sura49),
                getResources().getInteger(R.integer.sura49_pageno) );
        list[49] = new ListItem(50, getResources().getString(R.string.sura50),
                getResources().getInteger(R.integer.sura50_pageno) );
        list[50] = new ListItem(51, getResources().getString(R.string.sura51),
                getResources().getInteger(R.integer.sura51_pageno) );
        list[51] = new ListItem(52, getResources().getString(R.string.sura52),
                getResources().getInteger(R.integer.sura52_pageno) );
        list[52] = new ListItem(53, getResources().getString(R.string.sura53),
                getResources().getInteger(R.integer.sura53_pageno) );
        list[53] = new ListItem(54, getResources().getString(R.string.sura54),
                getResources().getInteger(R.integer.sura54_pageno) );
        list[54] = new ListItem(55, getResources().getString(R.string.sura55),
                getResources().getInteger(R.integer.sura55_pageno) );
        list[55] = new ListItem(56, getResources().getString(R.string.sura56),
                getResources().getInteger(R.integer.sura56_pageno) );
        list[56] = new ListItem(57, getResources().getString(R.string.sura57),
                getResources().getInteger(R.integer.sura57_pageno) );
        list[57] = new ListItem(58, getResources().getString(R.string.sura58),
                getResources().getInteger(R.integer.sura58_pageno) );
        list[58] = new ListItem(59, getResources().getString(R.string.sura59),
                getResources().getInteger(R.integer.sura59_pageno) );
        list[59] = new ListItem(60, getResources().getString(R.string.sura60),
                getResources().getInteger(R.integer.sura60_pageno) );
        list[60] = new ListItem(61, getResources().getString(R.string.sura61),
                getResources().getInteger(R.integer.sura61_pageno) );
        list[61] = new ListItem(62, getResources().getString(R.string.sura62),
                getResources().getInteger(R.integer.sura62_pageno) );
        list[62] = new ListItem(63, getResources().getString(R.string.sura63),
                getResources().getInteger(R.integer.sura63_pageno) );
        list[63] = new ListItem(64, getResources().getString(R.string.sura64),
                getResources().getInteger(R.integer.sura64_pageno) );
        list[64] = new ListItem(65, getResources().getString(R.string.sura65),
                getResources().getInteger(R.integer.sura65_pageno) );
        list[65] = new ListItem(66, getResources().getString(R.string.sura66),
                getResources().getInteger(R.integer.sura66_pageno) );
        list[66] = new ListItem(67, getResources().getString(R.string.sura67),
                getResources().getInteger(R.integer.sura67_pageno) );
        list[67] = new ListItem(68, getResources().getString(R.string.sura68),
                getResources().getInteger(R.integer.sura68_pageno) );
        list[68] = new ListItem(69, getResources().getString(R.string.sura69),
                getResources().getInteger(R.integer.sura69_pageno) );
        list[69] = new ListItem(70, getResources().getString(R.string.sura70),
                getResources().getInteger(R.integer.sura70_pageno) );
        list[70] = new ListItem(71, getResources().getString(R.string.sura71),
                getResources().getInteger(R.integer.sura71_pageno) );
        list[71] = new ListItem(72, getResources().getString(R.string.sura72),
                getResources().getInteger(R.integer.sura72_pageno) );
        list[72] = new ListItem(73, getResources().getString(R.string.sura73),
                getResources().getInteger(R.integer.sura73_pageno) );
        list[73] = new ListItem(74, getResources().getString(R.string.sura74),
                getResources().getInteger(R.integer.sura74_pageno) );
        list[74] = new ListItem(75, getResources().getString(R.string.sura75),
                getResources().getInteger(R.integer.sura75_pageno) );
        list[75] = new ListItem(76, getResources().getString(R.string.sura76),
                getResources().getInteger(R.integer.sura76_pageno) );
        list[76] = new ListItem(77, getResources().getString(R.string.sura77),
                getResources().getInteger(R.integer.sura77_pageno) );
        list[77] = new ListItem(78, getResources().getString(R.string.sura78),
                getResources().getInteger(R.integer.sura78_pageno) );
        list[78] = new ListItem(79, getResources().getString(R.string.sura79),
                getResources().getInteger(R.integer.sura79_pageno) );
        list[79] = new ListItem(80, getResources().getString(R.string.sura80),
                getResources().getInteger(R.integer.sura80_pageno) );
        list[80] = new ListItem(81, getResources().getString(R.string.sura81),
                getResources().getInteger(R.integer.sura81_pageno) );
        list[81] = new ListItem(82, getResources().getString(R.string.sura82),
                getResources().getInteger(R.integer.sura82_pageno) );
        list[82] = new ListItem(83, getResources().getString(R.string.sura83),
                getResources().getInteger(R.integer.sura83_pageno) );
        list[83] = new ListItem(84, getResources().getString(R.string.sura84),
                getResources().getInteger(R.integer.sura84_pageno) );
        list[84] = new ListItem(85, getResources().getString(R.string.sura85),
                getResources().getInteger(R.integer.sura85_pageno) );
        list[85] = new ListItem(86, getResources().getString(R.string.sura86),
                getResources().getInteger(R.integer.sura86_pageno) );
        list[86] = new ListItem(87, getResources().getString(R.string.sura87),
                getResources().getInteger(R.integer.sura87_pageno) );
        list[87] = new ListItem(88, getResources().getString(R.string.sura88),
                getResources().getInteger(R.integer.sura88_pageno) );
        list[88] = new ListItem(89, getResources().getString(R.string.sura89),
                getResources().getInteger(R.integer.sura89_pageno) );
        list[89] = new ListItem(90, getResources().getString(R.string.sura90),
                getResources().getInteger(R.integer.sura90_pageno) );
        list[90] = new ListItem(91, getResources().getString(R.string.sura91),
                getResources().getInteger(R.integer.sura91_pageno) );
        list[91] = new ListItem(92, getResources().getString(R.string.sura92),
                getResources().getInteger(R.integer.sura92_pageno) );
        list[92] = new ListItem(93, getResources().getString(R.string.sura93),
                getResources().getInteger(R.integer.sura93_pageno) );
        list[93] = new ListItem(94, getResources().getString(R.string.sura94),
                getResources().getInteger(R.integer.sura94_pageno) );
        list[94] = new ListItem(95, getResources().getString(R.string.sura95),
                getResources().getInteger(R.integer.sura95_pageno) );
        list[95] = new ListItem(96, getResources().getString(R.string.sura96),
                getResources().getInteger(R.integer.sura96_pageno) );
        list[96] = new ListItem(97, getResources().getString(R.string.sura97),
                getResources().getInteger(R.integer.sura97_pageno) );
        list[97] = new ListItem(98, getResources().getString(R.string.sura98),
                getResources().getInteger(R.integer.sura98_pageno) );
        list[98] = new ListItem(99, getResources().getString(R.string.sura99),
                getResources().getInteger(R.integer.sura99_pageno) );
        list[99] = new ListItem(100, getResources().getString(R.string.sura100),
                getResources().getInteger(R.integer.sura100_pageno) );
        list[100] = new ListItem(101, getResources().getString(R.string.sura101),
                getResources().getInteger(R.integer.sura101_pageno) );
        list[101] = new ListItem(102, getResources().getString(R.string.sura102),
                getResources().getInteger(R.integer.sura102_pageno) );
        list[102] = new ListItem(103, getResources().getString(R.string.sura103),
                getResources().getInteger(R.integer.sura103_pageno) );
        list[103] = new ListItem(104, getResources().getString(R.string.sura104),
                getResources().getInteger(R.integer.sura104_pageno) );
        list[104] = new ListItem(105, getResources().getString(R.string.sura105),
                getResources().getInteger(R.integer.sura105_pageno) );
        list[105] = new ListItem(106, getResources().getString(R.string.sura106),
                getResources().getInteger(R.integer.sura106_pageno) );
        list[106] = new ListItem(107, getResources().getString(R.string.sura107),
                getResources().getInteger(R.integer.sura107_pageno) );
        list[107] = new ListItem(108, getResources().getString(R.string.sura108),
                getResources().getInteger(R.integer.sura108_pageno) );
        list[108] = new ListItem(109, getResources().getString(R.string.sura109),
                getResources().getInteger(R.integer.sura109_pageno) );
        list[109] = new ListItem(110, getResources().getString(R.string.sura110),
                getResources().getInteger(R.integer.sura110_pageno) );
        list[110] = new ListItem(111, getResources().getString(R.string.sura111),
                getResources().getInteger(R.integer.sura111_pageno) );
        list[111] = new ListItem(112, getResources().getString(R.string.sura112),
                getResources().getInteger(R.integer.sura112_pageno) );
        list[112] = new ListItem(113, getResources().getString(R.string.sura113),
                getResources().getInteger(R.integer.sura113_pageno) );
        list[113] = new ListItem(114, getResources().getString(R.string.sura114),
                getResources().getInteger(R.integer.sura114_pageno) );

        //! recycler view
        RecyclerView recyclerView = findViewById(R.id.rv_surahlist);
        //! creating and setting adapter
        RecyclerAdapter adapter = new RecyclerAdapter(list);
        //! attach adapter to recyclerview
        recyclerView.setAdapter(adapter);
        //! set layout manager to position the items
        recyclerView.setLayoutManager(new LinearLayoutManager(this) );
    }
}