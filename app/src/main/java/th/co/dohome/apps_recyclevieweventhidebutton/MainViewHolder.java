package th.co.dohome.apps_recyclevieweventhidebutton;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    CheckBox checkBox;
    TextView textView;
    public MainViewHolder(View itemView) {
        super(itemView);
        checkBox = itemView.findViewById(R.id.checkBox);
        textView = itemView.findViewById(R.id.textView);
    }
}
