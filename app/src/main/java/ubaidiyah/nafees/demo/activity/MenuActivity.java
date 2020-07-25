package ubaidiyah.nafees.demo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.demo.R;
import com.google.android.material.button.MaterialButton;

import ubaidiyah.nafees.demo.utils.Constants;

public class MenuActivity extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private String sharedPrefFile = Constants.SHARED_PREFS_FILE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final MaterialButton startBtn = findViewById(R.id.btn_start);
        final MaterialButton resumeBtn = findViewById(R.id.btn_resume);
        final MaterialButton findByParahBtn = findViewById(R.id.btn_findbyparah);
        final MaterialButton findBySurahBtn = findViewById(R.id.btn_findbysurah);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //! go to recite activity
                Intent intent = new Intent(MenuActivity.this, ReciteActivity.class);
                intent.putExtra(Constants.PAGENO_KEY, -1); //! go to first page from end
                startActivity(intent);
            }
        });

        resumeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //! read stored preferences
                mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);
                int mPageNo = mPreferences.getInt(Constants.SHARED_PREFS_PAGENO_KEY, -1);

                //! go to recite activity
                Intent intent = new Intent(MenuActivity.this, ReciteActivity.class);
                intent.putExtra(Constants.PAGENO_KEY, mPageNo);
                startActivity(intent);
            }
        });

        findByParahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //! go to Parah List Activity
                Intent intent = new Intent(MenuActivity.this,
                        ParahListActivity.class);
                startActivity(intent);
            }
        });

        findBySurahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //! go to Surah List Activity
                Intent intent = new Intent(MenuActivity.this,
                        SurahListActivity.class);
                startActivity(intent);
            }
        });
    }
}