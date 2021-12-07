package com.shmugen.app.legends.common;

import android.content.Context;

import androidx.fragment.app.FragmentActivity;

import com.shmugen.app.legends.utils.Utils;

public class Shared {

    public static Context context;
    public static FragmentActivity activity;
    //TODO add Utils чтобы каждый раз не подгонял каждую пикчу, а брал из своего экземпляра значения свойств (или create one more model)
}
