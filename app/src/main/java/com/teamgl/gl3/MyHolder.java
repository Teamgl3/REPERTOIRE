package com.teamgl.gl3;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyHolder extends  RecyclerView.ViewHolder  {

private TextView nomContact;
private int numeroContact;
private TextView emailContact;
    private View layout;

public MyHolder(View view) {

    super(view);

    layout = view;

    nomContact= (TextView) view.findViewById(R.id.textView1);

    emailContact= (TextView) view.findViewById(R.id.textView2);



}

    public TextView getNomTextView() { return nomContact; }
    public TextView getOrigineTextView() { return emailContact; }
    public View getLayout() { return layout; }


}
