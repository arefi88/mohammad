package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class Observable{
        val observables= mutableListOf<IObserver<Int>>()
        fun register(observer:IObserver<Int>){
            observables.add(observer)
        }

        fun broadcastData(newData: Int){
           for (observer in observables){
               observer.updatePrice(newData)
           }
        }
    }
    interface IObserver<T>{
        fun updatePrice(t:T)
    }
    class MyObserver:IObserver<Int>{
        override fun updatePrice(t: Int) {
            TODO("Not yet implemented")
        }

    }
    class YourObserver:IObserver<String>{
        override fun updatePrice(t: String) {
            TODO("Not yet implemented")
        }

    }

}