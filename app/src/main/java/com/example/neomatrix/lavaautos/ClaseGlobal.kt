package com.example.neomatrix.lavaautos

import android.app.Application

/**
 * Created by Neomatrix on 30/04/2017.
 */

class ClaseGlobal : Application() {
    private var tauto = 1

    fun ponauto(a: Int) {
        tauto = a
    }

    fun dameauto(): Int {
        return tauto
    }

    companion object {
        private val versiondb = 1
    }

}