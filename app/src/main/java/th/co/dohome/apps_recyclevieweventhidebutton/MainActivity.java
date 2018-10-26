package th.co.dohome.apps_recyclevieweventhidebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecycleView =findViewById(R.id.mRecycleView);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        Button mButton = findViewById(R.id.button);
        ArrayList<String> list_item= new ArrayList<>();
        list_item.add("Item1");
        list_item.add("Item2");
        list_item.add("Item3");
        MainAdapter adapter = new MainAdapter(MainActivity.this,list_item,mButton);
        mRecycleView.setAdapter(adapter);
    }
}
