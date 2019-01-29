package com.example.alekseynd.asynctaskloaderimpl.mock;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.alekseynd.asynctaskloaderimpl.ContactsAdapter;
import com.example.alekseynd.asynctaskloaderimpl.R;

public class MockHolder extends RecyclerView.ViewHolder {

    private TextView mName;
    private TextView mValue;
    private String mId;

    public MockHolder(View itemView) {
        super(itemView);
        mName = itemView.findViewById(R.id.tv_name);
        mValue = itemView.findViewById(R.id.tv_value);
    }

    public void bind(Mock mock) {
        mName.setText(mock.getName());
        mValue.setText(mock.getValue());
        mId = mock.getValue();
    }

    public void setListener(final ContactsAdapter.OnItemClickListener onItemClickListener) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(mId);
            }
        });
    }
}
