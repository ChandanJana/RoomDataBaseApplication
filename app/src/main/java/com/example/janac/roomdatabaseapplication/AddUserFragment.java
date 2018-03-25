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
public class AddUserFragment extends Fragment {


    EditText uId, uName, uEmail;
    Button button;

    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);

        uId = view.findViewById(R.id.userId);
        uName = view.findViewById(R.id.userName);
        uEmail = view.findViewById(R.id.userEmail);
        button = view.findViewById(R.id.save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int uid = Integer.parseInt(uId.getText().toString());
                String uname = uName.getText().toString();
                String uemail = uEmail.getText().toString();

                User user = new User();
                user.setId(uid);
                user.setFirstName(uname);
                user.setEmail(uemail);
                MainActivity.appDataBase.userDao().insertAll(user);
                Toast.makeText(getContext(), "User add successfully", Toast.LENGTH_SHORT).show();
                uId.setText("");
                uName.setText("");
                uEmail.setText("");


            }
        });

        return  view;
    }

}
