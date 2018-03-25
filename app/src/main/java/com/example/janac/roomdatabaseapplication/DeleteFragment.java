package com.example.janac.roomdatabaseapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteFragment extends Fragment {


    public DeleteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete, container, false);
        final EditText editText = view.findViewById(R.id.del);
        Button button = view.findViewById(R.id.delB);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User();
                user.setId(Integer.parseInt(editText.getText().toString()));
                MainActivity.appDataBase.userDao().deleteUser(user);
                editText.setText("");
                Toast.makeText(getContext(), "user deleted ", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

}
