package ru.nitrobubbles.androiddatabindingexample;


import android.databinding.DataBindingUtil
import android.databinding.OnRebindCallback
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager
import android.view.ViewGroup
import ru.nitrobubbles.androiddatabindingexample.databinding.MainActivityBinding
import ru.nitrobubbles.androiddatabindingexample.datalayer.dataobject.User

class MainActivity:AppCompatActivity(){

    val binding : MainActivityBinding by lazy { DataBindingUtil.setContentView<MainActivityBinding>(this, R.layout.main_activity) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.let {
            it.user = User()
        }

        binding.addOnRebindCallback(
                object : OnRebindCallback<MainActivityBinding>(){
                   override fun onPreBind(binding: MainActivityBinding?): Boolean {
                        val sceneRoot = binding?.root as ViewGroup
                        TransitionManager.beginDelayedTransition(sceneRoot)
                        return true
                    }
                }
        )
    }
}
