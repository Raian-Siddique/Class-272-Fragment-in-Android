package com.example.class272fragmentinandroid;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class SecondFragment extends Fragment {

        Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View myView = inflater.inflate(R.layout.fragment_second, container, false);

       button = myView.findViewById(R.id.button);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getActivity(),
                       "I am listeling", Toast.LENGTH_LONG).show();
           }
       });


       return myView;
    }
}