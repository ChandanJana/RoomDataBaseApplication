package com.example.janac.roomdatabaseapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{


    Button addBn, viewBn, upDatebn, delBn;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        addBn = view.findViewById(R.id.addUser);
        viewBn = view.findViewById(R.id.viewUser);
        upDatebn = view.findViewById(R.id.updateUser);
        delBn = view.findViewById(R.id.deleteUser);

        addBn.setOnClickListener(this);
        viewBn.setOnClickListener(this);
        upDatebn.setOnClickListener(this);
        delBn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.addUser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.container,
                        new AddUserFragment()).addToBackStack(null).commit();
                break;
            case R.id.updateUser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.container,
                        new UpdateFragment()).addToBackStack(null).commit();
                break;
            case R.id.viewUser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.container,
                        new ReadFragment()).addToBackStack(null).commit();
                break;
            case R.id.deleteUser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.container,
                        new DeleteFragment()).addToBackStack(null).commit();
                break;
        }

    }
}
