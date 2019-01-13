package com.example.justin.neuroflow_test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FirstScreen extends Fragment {

    private static final String LOG_TAG = "FirstScreen";
    static String NUM = "NUMBER";

    List<String[]> players;

    public FirstScreen() {}

    public static FirstScreen newInstance(int num) {
        FirstScreen FSfrag = new FirstScreen();
        Bundle args = new Bundle();
        args.putInt(NUM, num);
        FSfrag.setArguments(args);
        return FSfrag;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        players = new ArrayList<>();
        players.add(getResources().getStringArray(R.array.player1));
        players.add(getResources().getStringArray(R.array.player2));
        players.add(getResources().getStringArray(R.array.player3));
        players.add(getResources().getStringArray(R.array.player4));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.first_screen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
        if (getArguments().getInt(NUM) == -1){

        }else {
            TextView textView = view.findViewById(R.id.textView);
            String[] player = players.get(getArguments().getInt(NUM));
//        textView.setText(String.valueOf(num));
            textView.setText(player[0]);
        }
    }
}
