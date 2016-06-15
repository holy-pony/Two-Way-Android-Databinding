package ru.nitrobubbles.androiddatabindingexample.datalayer.dataobject

import android.databinding.Bindable
import android.databinding.ObservableBoolean
import android.databinding.ObservableField

/**
 * Created by konstantinaksenov on 14.06.16.
 */

class User() {
    var name: ObservableField<String> = ObservableField();
    var email: ObservableField<String> = ObservableField();
    val adult: ObservableBoolean = ObservableBoolean(false);
}