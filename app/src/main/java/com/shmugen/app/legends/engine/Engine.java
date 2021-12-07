package com.shmugen.app.legends.engine;

public class Engine {

    public static void startGameEvent(){
        ScreenController.openScreen(ScreenController.Screen.LEVEL);
    }

    public static void oneLevelEvent(){
        ScreenController.openScreen(ScreenController.Screen.GAME);
       //пока история одна
    }

    public static void twoLevelEvent(){
        //при нажатии на выбор первого уровня должна запускаться вторая история
    }

    public static void threeLevelEvent(){
        //при нажатии на выбор первого уровня должна запускаться третья история
    }

}
