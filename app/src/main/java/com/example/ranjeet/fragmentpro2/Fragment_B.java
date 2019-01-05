package com.example.ranjeet.fragmentpro2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_B extends Fragment {
    TextView txt;
    int data;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b_layout,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txt=getActivity().findViewById(R.id.textView);
        if(savedInstanceState!=null)
        {   data=savedInstanceState.getInt("data");
            txt.setText("NO of Click of Button: "+data);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("data",data);
    }

    void changeData(int data){
        this.data=data;
        txt.setText("NO of Click of Button: "+data);
    }
}
