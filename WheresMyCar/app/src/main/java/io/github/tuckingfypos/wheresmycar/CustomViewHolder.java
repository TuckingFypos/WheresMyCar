package io.github.tuckingfypos.wheresmycar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by TuckingFypos on 9/28/16.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public TextView mTextView1;
    public TextView mTextView2;
    public TextView mTextView3;
    public TextView mTextView4;

    public CustomViewHolder(View itemView) {
        super(itemView);


        mTextView1 = (TextView) itemView.findViewById(R.id.title_text_view);
        mTextView2 = (TextView) itemView.findViewById(R.id.id_text_view);
        mTextView3 = (TextView) itemView.findViewById(R.id.location_text_view);
        mTextView4 = (TextView) itemView.findViewById(R.id.location_text_view2);

    }

    public TextView getmTextView1() {
        return mTextView1;
    }

    public void setmTextView1(String toSet) {
        mTextView1 = (TextView) itemView.findViewById(R.id.title_text_view);
        mTextView1.setText(toSet);
    }

    public TextView getmTextView2() {
        return mTextView2;
    }

    public void setmTextView2(String toSet) {
        mTextView2 = (TextView) itemView.findViewById(R.id.id_text_view);
        mTextView2.setText(toSet);
    }

    public void setmTextView3(double toSet){
        mTextView3 = (TextView) itemView.findViewById(R.id.location_text_view);
        String calibrated = String.valueOf(toSet);
        mTextView3.setText(calibrated);
    }

    public void setmTextView4(double toSet){
        mTextView4 = (TextView) itemView.findViewById(R.id.location_text_view2);
        String calibrated = String.valueOf(toSet);
        mTextView4.setText(calibrated);
    }
}
