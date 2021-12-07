package com.shmugen.app.legends.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.shmugen.app.legends.MainActivity;
import com.shmugen.app.legends.R;
import com.shmugen.app.legends.engine.Engine;

public class LevelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.level_fragment, container, false);
        View levelOne = view.findViewById(R.id.level_one_container);
        View levelTwo = view.findViewById(R.id.level_two_container);
        View levelThree = view.findViewById(R.id.level_three_container);

        levelOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Engine.oneLevelEvent();
            }
        });

        levelTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Engine.twoLevelEvent();
            }
        });

        levelThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Engine.threeLevelEvent();
            }
        });

        return view;
    }

}
