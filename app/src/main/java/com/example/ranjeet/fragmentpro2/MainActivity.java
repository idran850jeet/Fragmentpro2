package com.example.ranjeet.fragmentpro2;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int data) {
        Fragment_B f2= (Fragment_B) getFragmentManager().findFragmentById(R.id.fragment2);
        f2.changeData(data);
    }
}
