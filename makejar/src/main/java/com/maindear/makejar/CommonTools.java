package com.maindear.makejar;

import android.content.Context;
import android.widget.Toast;

public class CommonTools {
    public String CT(String abc){
        String s="ok="+abc;
        return s;
        //Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        //Toast.makeText(appContext,"请请你再按一次退出",Toast.LENGTH_SHORT).show();
    }
}
