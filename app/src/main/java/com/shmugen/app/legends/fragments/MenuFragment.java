package com.shmugen.app.legends.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.shmugen.app.legends.MainActivity;
import com.shmugen.app.legends.R;
import com.shmugen.app.legends.engine.Engine;

public class MenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        ImageView mStartGameButton = (ImageView) view.findViewById(R.id.start_game_button);

        mStartGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Engine.startGameEvent();
            }
        });

        return view;
    }

}
