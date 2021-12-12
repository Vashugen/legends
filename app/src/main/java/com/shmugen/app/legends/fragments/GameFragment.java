package com.shmugen.app.legends.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.shmugen.app.legends.R;
import com.shmugen.app.legends.engine.Engine;
import com.shmugen.app.legends.model.Game;
import com.shmugen.app.legends.ui.BoardView;

public class GameFragment extends Fragment {

    private BoardView mBoard;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.game_fragment, container, false);
        FrameLayout gameContainer = (FrameLayout) view.findViewById(R.id.game_container);

        ViewGroup game = (ViewGroup) LayoutInflater.from(getActivity().getApplicationContext()).inflate(R.layout.game_view, view);
        
        gameContainer.addView(game);


        return view;
    }

}
