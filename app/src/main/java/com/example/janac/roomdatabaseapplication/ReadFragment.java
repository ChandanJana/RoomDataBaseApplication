package com.example.janac.roomdatabaseapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadFragment extends Fragment {


    public ReadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read, container, false);
        TextView textView = view.findViewById(R.id.result);
        List<User> users = MainActivity.appDataBase.userDao().getAll();

        String s = "";
        for (User user: users){
            int id = user.getId();
            String s1 = user.getEmail();
            String s2 = user.getFirstName();
            s = s+" "+id+" "+s1+" "+s2;

        }
        textView.setText(s);
        return view;
    }

}
