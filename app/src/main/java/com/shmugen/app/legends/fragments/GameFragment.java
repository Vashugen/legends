package com.shmugen.app.legends.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.shmugen.app.legends.R;
import com.shmugen.app.legends.common.Shared;
import com.shmugen.app.legends.engine.Engine;
import com.shmugen.app.legends.model.Game;
import com.shmugen.app.legends.ui.BoardView;

public class GameFragment extends Fragment {

    private BoardView mBoard;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.game_fragment, container, false);
        ImageView picsContainer = (ImageView) view.findViewById(R.id.pics_container);
        ImageView textContainer = (ImageView) view.findViewById(R.id.text_container);

        int picsId = Shared.context.getResources().getIdentifier("pics_1", "mipmap", Shared.context.getPackageName());
        int textId = Shared.context.getResources().getIdentifier("text_1", "mipmap", Shared.context.getPackageName());

        picsContainer.setImageResource(picsId);
        textContainer.setImageResource(textId);

        return view;
    }

}
