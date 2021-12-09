package com.shmugen.app.legends.engine;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.shmugen.app.legends.R;
import com.shmugen.app.legends.common.Shared;
import com.shmugen.app.legends.fragments.GameFragment;
import com.shmugen.app.legends.fragments.LevelFragment;
import com.shmugen.app.legends.fragments.MenuFragment;

public class ScreenController {

    private static ScreenController mInstance = null;

    public enum Screen {
        MENU,
        LEVEL,
        GAME
    }

    public static ScreenController getInstance(){
        if(mInstance == null){
            mInstance = new ScreenController();
        }

        return mInstance;
    }

    public void openScreen(Screen screen){

        Fragment fragment = getFragment(screen);
        FragmentManager fragmentManager = Shared.activity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    private static Fragment getFragment(Screen screen){
        switch (screen){
            case MENU:
                return new MenuFragment();
            case LEVEL:
                return new LevelFragment();
            case GAME:
                return new GameFragment();
        }

        return null;
    }

}
