package com.example.neomatrix.lavaautos;

import android.app.Application;

/**
 * Created by Neomatrix on 30/04/2017.
 */

public class ClaseGlobal extends Application {
    private final static int versiondb=1;
    private int tauto = 1;

    public void ponauto(int a) {
        tauto=a;
    }
    public int dameauto() {
        return tauto;
    }

}