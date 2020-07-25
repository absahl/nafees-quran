package ubaidiyah.nafees.demo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.demo.R;

import ubaidiyah.nafees.demo.adapter.ImageAdapter;
import ubaidiyah.nafees.demo.utils.Constants;

public class ReciteActivity extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private String sharedPrefFile = Constants.SHARED_PREFS_FILE;

    private int[] imageIds = new int[]{

            R.drawable.p725, R.drawable.p724, R.drawable.p723, R.drawable.p722, R.drawable.p721,
            R.drawable.p720, R.drawable.p719, R.drawable.p718, R.drawable.p717, R.drawable.p716,
            R.drawable.p715, R.drawable.p714, R.drawable.p713, R.drawable.p712, R.drawable.p711,
            R.drawable.p710, R.drawable.p709, R.drawable.p708, R.drawable.p707, R.drawable.p706,
            R.drawable.p705, R.drawable.p704, R.drawable.p703, R.drawable.p702, R.drawable.p701,
            R.drawable.p700, R.drawable.p699,

            R.drawable.p698, R.drawable.p697, R.drawable.p696, R.drawable.p695, R.drawable.p694,
            R.drawable.p693, R.drawable.p692, R.drawable.p691, R.drawable.p690, R.drawable.p689,
            R.drawable.p688, R.drawable.p687, R.drawable.p686, R.drawable.p685, R.drawable.p684,
            R.drawable.p683, R.drawable.p682, R.drawable.p681, R.drawable.p680, R.drawable.p679,
            R.drawable.p678, R.drawable.p677, R.drawable.p676, R.drawable.p675,

            R.drawable.p674, R.drawable.p673, R.drawable.p672, R.drawable.p671, R.drawable.p670,
            R.drawable.p669, R.drawable.p668, R.drawable.p667, R.drawable.p666, R.drawable.p665,
            R.drawable.p664, R.drawable.p663, R.drawable.p662, R.drawable.p661, R.drawable.p660,
            R.drawable.p659, R.drawable.p658, R.drawable.p657, R.drawable.p656, R.drawable.p655,
            R.drawable.p654, R.drawable.p653, R.drawable.p652, R.drawable.p651,

            R.drawable.p650, R.drawable.p649, R.drawable.p648, R.drawable.p647, R.drawable.p646,
            R.drawable.p645, R.drawable.p644, R.drawable.p643, R.drawable.p642, R.drawable.p641,
            R.drawable.p640, R.drawable.p639, R.drawable.p638, R.drawable.p637, R.drawable.p636,
            R.drawable.p635, R.drawable.p634, R.drawable.p633, R.drawable.p632, R.drawable.p631,
            R.drawable.p630, R.drawable.p629, R.drawable.p628, R.drawable.p627,

            R.drawable.p626, R.drawable.p625, R.drawable.p624, R.drawable.p623, R.drawable.p622,
            R.drawable.p621, R.drawable.p620, R.drawable.p619, R.drawable.p618, R.drawable.p617,
            R.drawable.p616, R.drawable.p615, R.drawable.p614, R.drawable.p613, R.drawable.p612,
            R.drawable.p611, R.drawable.p610, R.drawable.p609, R.drawable.p608, R.drawable.p607,
            R.drawable.p606, R.drawable.p605, R.drawable.p604, R.drawable.p603,

            R.drawable.p602, R.drawable.p601, R.drawable.p600, R.drawable.p599, R.drawable.p598,
            R.drawable.p597, R.drawable.p596, R.drawable.p595, R.drawable.p594, R.drawable.p593,
            R.drawable.p592, R.drawable.p591, R.drawable.p590, R.drawable.p589, R.drawable.p588,
            R.drawable.p587, R.drawable.p586, R.drawable.p585, R.drawable.p584, R.drawable.p583,
            R.drawable.p582, R.drawable.p581, R.drawable.p580, R.drawable.p579,

            R.drawable.p578, R.drawable.p577, R.drawable.p576, R.drawable.p575, R.drawable.p574,
            R.drawable.p573, R.drawable.p572, R.drawable.p571, R.drawable.p570, R.drawable.p569,
            R.drawable.p568, R.drawable.p567, R.drawable.p566, R.drawable.p565, R.drawable.p564,
            R.drawable.p563, R.drawable.p562, R.drawable.p561, R.drawable.p560, R.drawable.p559,
            R.drawable.p558, R.drawable.p557, R.drawable.p556, R.drawable.p555,

            R.drawable.p554, R.drawable.p553, R.drawable.p552, R.drawable.p551, R.drawable.p550,
            R.drawable.p549, R.drawable.p548, R.drawable.p547, R.drawable.p546, R.drawable.p545,
            R.drawable.p544, R.drawable.p543, R.drawable.p542, R.drawable.p541, R.drawable.p540,
            R.drawable.p539, R.drawable.p538, R.drawable.p537, R.drawable.p536, R.drawable.p535,
            R.drawable.p534, R.drawable.p533, R.drawable.p532, R.drawable.p531,

            R.drawable.p530, R.drawable.p529, R.drawable.p528, R.drawable.p527, R.drawable.p526,
            R.drawable.p525, R.drawable.p524, R.drawable.p523, R.drawable.p522, R.drawable.p521,
            R.drawable.p520, R.drawable.p519, R.drawable.p518, R.drawable.p517, R.drawable.p516,
            R.drawable.p515, R.drawable.p514, R.drawable.p513, R.drawable.p512, R.drawable.p511,
            R.drawable.p510, R.drawable.p509, R.drawable.p508, R.drawable.p507,

            R.drawable.p506, R.drawable.p505, R.drawable.p504, R.drawable.p503, R.drawable.p502,
            R.drawable.p501, R.drawable.p500, R.drawable.p499, R.drawable.p498, R.drawable.p497,
            R.drawable.p496, R.drawable.p495, R.drawable.p494, R.drawable.p493, R.drawable.p492,
            R.drawable.p491, R.drawable.p490, R.drawable.p489, R.drawable.p488, R.drawable.p487,
            R.drawable.p486, R.drawable.p485, R.drawable.p484, R.drawable.p483,

            R.drawable.p482, R.drawable.p481, R.drawable.p480, R.drawable.p479, R.drawable.p478,
            R.drawable.p477, R.drawable.p476, R.drawable.p475, R.drawable.p474, R.drawable.p473,
            R.drawable.p472, R.drawable.p471, R.drawable.p470, R.drawable.p469, R.drawable.p468,
            R.drawable.p467, R.drawable.p466, R.drawable.p465, R.drawable.p464, R.drawable.p463,
            R.drawable.p462, R.drawable.p461, R.drawable.p460, R.drawable.p459,

            R.drawable.p458, R.drawable.p457, R.drawable.p456, R.drawable.p455, R.drawable.p454,
            R.drawable.p453, R.drawable.p452, R.drawable.p451, R.drawable.p450, R.drawable.p449,
            R.drawable.p448, R.drawable.p447, R.drawable.p446, R.drawable.p445, R.drawable.p444,
            R.drawable.p443, R.drawable.p442, R.drawable.p441, R.drawable.p440, R.drawable.p439,
            R.drawable.p438, R.drawable.p437, R.drawable.p436, R.drawable.p435,

            R.drawable.p434, R.drawable.p433, R.drawable.p432, R.drawable.p431, R.drawable.p430,
            R.drawable.p429, R.drawable.p428, R.drawable.p427, R.drawable.p426, R.drawable.p425,
            R.drawable.p424, R.drawable.p423, R.drawable.p422, R.drawable.p421, R.drawable.p420,
            R.drawable.p419, R.drawable.p418, R.drawable.p417, R.drawable.p416, R.drawable.p415,
            R.drawable.p414, R.drawable.p413, R.drawable.p412, R.drawable.p411,

            R.drawable.p410, R.drawable.p409, R.drawable.p408, R.drawable.p407, R.drawable.p406,
            R.drawable.p405, R.drawable.p404, R.drawable.p403, R.drawable.p402, R.drawable.p401,
            R.drawable.p400, R.drawable.p399, R.drawable.p398, R.drawable.p397, R.drawable.p396,
            R.drawable.p395, R.drawable.p394, R.drawable.p393, R.drawable.p392, R.drawable.p391,
            R.drawable.p390, R.drawable.p389, R.drawable.p388, R.drawable.p387,

            R.drawable.p386, R.drawable.p385, R.drawable.p384, R.drawable.p383, R.drawable.p382,
            R.drawable.p381, R.drawable.p380, R.drawable.p379, R.drawable.p378, R.drawable.p377,
            R.drawable.p376, R.drawable.p375, R.drawable.p374, R.drawable.p373, R.drawable.p372,
            R.drawable.p371, R.drawable.p370, R.drawable.p369, R.drawable.p368, R.drawable.p367,
            R.drawable.p366, R.drawable.p365, R.drawable.p364, R.drawable.p363,

            R.drawable.p362, R.drawable.p361, R.drawable.p360, R.drawable.p359, R.drawable.p358,
            R.drawable.p357, R.drawable.p356, R.drawable.p355, R.drawable.p354, R.drawable.p353,
            R.drawable.p352, R.drawable.p351, R.drawable.p350, R.drawable.p349, R.drawable.p348,
            R.drawable.p347, R.drawable.p346, R.drawable.p345, R.drawable.p344, R.drawable.p343,
            R.drawable.p342, R.drawable.p341, R.drawable.p340, R.drawable.p339,

            R.drawable.p338, R.drawable.p337, R.drawable.p336, R.drawable.p335, R.drawable.p334,
            R.drawable.p333, R.drawable.p332, R.drawable.p331, R.drawable.p330, R.drawable.p329,
            R.drawable.p328, R.drawable.p327, R.drawable.p326, R.drawable.p325, R.drawable.p324,
            R.drawable.p323, R.drawable.p322, R.drawable.p321, R.drawable.p320, R.drawable.p319,
            R.drawable.p318, R.drawable.p317, R.drawable.p316, R.drawable.p315,

            R.drawable.p314, R.drawable.p313, R.drawable.p312, R.drawable.p311, R.drawable.p310,
            R.drawable.p309, R.drawable.p308, R.drawable.p307, R.drawable.p306, R.drawable.p305,
            R.drawable.p304, R.drawable.p303, R.drawable.p302, R.drawable.p301, R.drawable.p300,
            R.drawable.p299, R.drawable.p298, R.drawable.p297, R.drawable.p296, R.drawable.p295,
            R.drawable.p294, R.drawable.p293, R.drawable.p292, R.drawable.p291,

            R.drawable.p290, R.drawable.p289, R.drawable.p288, R.drawable.p287, R.drawable.p286,
            R.drawable.p285, R.drawable.p284, R.drawable.p283, R.drawable.p282, R.drawable.p281,
            R.drawable.p280, R.drawable.p279, R.drawable.p278, R.drawable.p277, R.drawable.p276,
            R.drawable.p275, R.drawable.p274, R.drawable.p273, R.drawable.p272, R.drawable.p271,
            R.drawable.p270, R.drawable.p269, R.drawable.p268, R.drawable.p267,

            R.drawable.p266, R.drawable.p265, R.drawable.p264, R.drawable.p263, R.drawable.p262,
            R.drawable.p261, R.drawable.p260, R.drawable.p259, R.drawable.p258, R.drawable.p257,
            R.drawable.p256, R.drawable.p255, R.drawable.p254, R.drawable.p253, R.drawable.p252,
            R.drawable.p251, R.drawable.p250, R.drawable.p249, R.drawable.p248, R.drawable.p247,
            R.drawable.p246, R.drawable.p245, R.drawable.p244, R.drawable.p243,

            R.drawable.p242, R.drawable.p241, R.drawable.p240, R.drawable.p239, R.drawable.p238,
            R.drawable.p237, R.drawable.p236, R.drawable.p235, R.drawable.p234, R.drawable.p233,
            R.drawable.p232, R.drawable.p231, R.drawable.p230, R.drawable.p229, R.drawable.p228,
            R.drawable.p227, R.drawable.p226, R.drawable.p225, R.drawable.p224, R.drawable.p223,
            R.drawable.p222, R.drawable.p221, R.drawable.p220, R.drawable.p219,

            R.drawable.p218, R.drawable.p217, R.drawable.p216, R.drawable.p215, R.drawable.p214,
            R.drawable.p213, R.drawable.p212, R.drawable.p211, R.drawable.p210, R.drawable.p209,
            R.drawable.p208, R.drawable.p207, R.drawable.p206, R.drawable.p205, R.drawable.p204,
            R.drawable.p203, R.drawable.p202, R.drawable.p201, R.drawable.p200, R.drawable.p199,
            R.drawable.p198, R.drawable.p197, R.drawable.p196, R.drawable.p195,

            R.drawable.p194, R.drawable.p193, R.drawable.p192, R.drawable.p191, R.drawable.p190,
            R.drawable.p189, R.drawable.p188, R.drawable.p187, R.drawable.p186, R.drawable.p185,
            R.drawable.p184, R.drawable.p183, R.drawable.p182, R.drawable.p181, R.drawable.p180,
            R.drawable.p179, R.drawable.p178, R.drawable.p177, R.drawable.p176, R.drawable.p175,
            R.drawable.p174, R.drawable.p173, R.drawable.p172, R.drawable.p171,

            R.drawable.p170, R.drawable.p169, R.drawable.p168, R.drawable.p167, R.drawable.p166,
            R.drawable.p165, R.drawable.p164, R.drawable.p163, R.drawable.p162, R.drawable.p161,
            R.drawable.p160, R.drawable.p159, R.drawable.p158, R.drawable.p157, R.drawable.p156,
            R.drawable.p155, R.drawable.p154, R.drawable.p153, R.drawable.p152, R.drawable.p151,
            R.drawable.p150, R.drawable.p149, R.drawable.p148, R.drawable.p147,

            R.drawable.p146, R.drawable.p145, R.drawable.p144, R.drawable.p143, R.drawable.p142,
            R.drawable.p141, R.drawable.p140, R.drawable.p139, R.drawable.p138, R.drawable.p137,
            R.drawable.p136, R.drawable.p135, R.drawable.p134, R.drawable.p133, R.drawable.p132,
            R.drawable.p131, R.drawable.p130, R.drawable.p129, R.drawable.p128, R.drawable.p127,
            R.drawable.p126, R.drawable.p125, R.drawable.p124, R.drawable.p123,

            R.drawable.p122, R.drawable.p121, R.drawable.p120, R.drawable.p119, R.drawable.p118,
            R.drawable.p117, R.drawable.p116, R.drawable.p115, R.drawable.p114, R.drawable.p113,
            R.drawable.p112, R.drawable.p111, R.drawable.p110, R.drawable.p109, R.drawable.p108,
            R.drawable.p107, R.drawable.p106, R.drawable.p105, R.drawable.p104, R.drawable.p103,
            R.drawable.p102, R.drawable.p101, R.drawable.p100, R.drawable.p99,

            R.drawable.p98, R.drawable.p97, R.drawable.p96, R.drawable.p95, R.drawable.p94,
            R.drawable.p93, R.drawable.p92, R.drawable.p91, R.drawable.p90, R.drawable.p89,
            R.drawable.p88, R.drawable.p87, R.drawable.p86, R.drawable.p85, R.drawable.p84,
            R.drawable.p83, R.drawable.p82, R.drawable.p81, R.drawable.p80, R.drawable.p79,
            R.drawable.p78, R.drawable.p77, R.drawable.p76, R.drawable.p75,

            R.drawable.p74, R.drawable.p73, R.drawable.p72, R.drawable.p71, R.drawable.p70,
            R.drawable.p69, R.drawable.p68, R.drawable.p67, R.drawable.p66, R.drawable.p65,
            R.drawable.p64, R.drawable.p63, R.drawable.p62, R.drawable.p61, R.drawable.p60,
            R.drawable.p59, R.drawable.p58, R.drawable.p57, R.drawable.p56, R.drawable.p55,
            R.drawable.p54, R.drawable.p53, R.drawable.p52, R.drawable.p51,

            R.drawable.p50, R.drawable.p49, R.drawable.p48, R.drawable.p47, R.drawable.p46,
            R.drawable.p45, R.drawable.p44, R.drawable.p43, R.drawable.p42, R.drawable.p41,
            R.drawable.p40, R.drawable.p39, R.drawable.p38, R.drawable.p37, R.drawable.p36,
            R.drawable.p35, R.drawable.p34, R.drawable.p33, R.drawable.p32, R.drawable.p31,
            R.drawable.p30, R.drawable.p29, R.drawable.p28, R.drawable.p27,

            R.drawable.p26, R.drawable.p25, R.drawable.p24, R.drawable.p23, R.drawable.p22,
            R.drawable.p21, R.drawable.p20, R.drawable.p19, R.drawable.p18, R.drawable.p17,
            R.drawable.p16, R.drawable.p15, R.drawable.p14, R.drawable.p13, R.drawable.p12,
            R.drawable.p11, R.drawable.p10, R.drawable.p9, R.drawable.p8, R.drawable.p7,
            R.drawable.p6, R.drawable.p5, R.drawable.p4, R.drawable.p3, R.drawable.p2,
            R.drawable.p1};

    private ViewPager viewPager;
    private ImageAdapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //! link preferences file for editing in onStop
        mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);

        //! fetch data from caller activity
        Intent intent = getIntent();
        int mPageNo = intent.getIntExtra(Constants.PAGENO_KEY, 0);

        viewPager = findViewById(R.id.viewPager);
        imageAdapter = new ImageAdapter(this, imageIds);
        viewPager.setAdapter(imageAdapter);

        /*if (mPageNo == 0) //! load the first page
            viewPager.setCurrentItem(imageAdapter.getCount() - 1);

        else if (mPageNo > 0) //! load the stored page in case of resume
            viewPager.setCurrentItem(mPageNo - 1);

        else //! backward mapping in case of para/sura selection
            viewPager.setCurrentItem(mPageNo - 1);*/

        if(mPageNo > -1) //! load the stored page in case of resume
            viewPager.setCurrentItem(mPageNo);

        //! backward mapping in case of start or para/sura selection
        else{
            int pageFromEnd = Math.abs(mPageNo);
            viewPager.setCurrentItem(imageAdapter.getCount() - pageFromEnd);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        //! store the current page
        int current_page = viewPager.getCurrentItem();
        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.putInt(Constants.SHARED_PREFS_PAGENO_KEY, current_page);
        preferencesEditor.apply();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.para_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.para1:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para1_pageno) );
                break;

            case R.id.para2:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para2_pageno) );
                break;

            case R.id.para3:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para3_pageno) );
                break;

            case R.id.para4:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para4_pageno) );
                break;

            case R.id.para5:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para5_pageno) );
                break;

            case R.id.para6:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para6_pageno) );
                break;

            case R.id.para7:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para7_pageno) );
                break;

            case R.id.para8:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para8_pageno) );
                break;

            case R.id.para9:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para9_pageno) );
                break;

            case R.id.para10:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para10_pageno) );
                break;

            case R.id.para11:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para11_pageno) );
                break;

            case R.id.para12:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para12_pageno) );
                break;

            case R.id.para13:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para13_pageno) );
                break;

            case R.id.para14:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para14_pageno) );
                break;

            case R.id.para15:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para15_pageno) );
                break;

            case R.id.para16:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para16_pageno) );
                break;

            case R.id.para17:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para17_pageno) );
                break;

            case R.id.para18:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para18_pageno) );
                break;

            case R.id.para19:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para19_pageno) );
                break;

            case R.id.para20:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para20_pageno) );
                break;

            case R.id.para21:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para21_pageno) );
                break;

            case R.id.para22:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para22_pageno) );
                break;

            case R.id.para23:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para23_pageno) );
                break;

            case R.id.para24:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para24_pageno) );
                break;

            case R.id.para25:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para25_pageno) );
                break;

            case R.id.para26:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para26_pageno) );
                break;

            case R.id.para27:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para27_pageno) );
                break;

            case R.id.para28:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para28_pageno) );
                break;

            case R.id.para29:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para29_pageno) );
                break;

            case R.id.para30:
                viewPager.setCurrentItem(imageIds.length - getResources().getInteger(R.integer.para30_pageno) );
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }
        return super.onOptionsItemSelected(item);
    }
}
