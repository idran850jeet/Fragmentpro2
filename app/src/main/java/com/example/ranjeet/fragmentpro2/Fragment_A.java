package com.example.ranjeet.fragmentpro2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_A extends Fragment implements View.OnClickListener {
    Button btn;
    int counter;
    Communicator com;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a_layout,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn=getActivity().findViewById(R.id.button);
        com=(Communicator)getActivity();
        btn.setOnClickListener(this);
        if(savedInstanceState==null)
            counter=0;
        else
        {
            counter=savedInstanceState.getInt("counter",0);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }

    @Override
    public void onClick(View v) {
        counter++;

       com.respond(counter);
    }
}
