package th.co.dohome.apps_recyclevieweventhidebutton;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    Activity activity;
    ArrayList<String> list_item;
    ArrayList<String> temp_list;
    Button btn;

    public MainAdapter(Activity activity, ArrayList<String> list_item,Button btn) {
        this.activity = activity;
        this.list_item = list_item;
        this.btn = btn;
        temp_list = new ArrayList<>();
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(activity).inflate(R.layout.item_main, parent, false));
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, final int position) {
        /// check list temp is empty
        if(temp_list.size()>0){
            btn.setVisibility(View.VISIBLE);
        }else {
            btn.setVisibility(View.INVISIBLE);
        }
        holder.textView.setText(list_item.get(position));
        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    temp_list.add(list_item.get(position));
                } else {
                    temp_list.remove(list_item.get(position));
                }
                if(temp_list.size()>0){
                    btn.setVisibility(View.VISIBLE);
                }else {
                    btn.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        if (list_item != null)
            return list_item.size();
        return 0;
    }
}
