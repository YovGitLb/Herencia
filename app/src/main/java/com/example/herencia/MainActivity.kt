package com.example.herencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        classInheritance()


    }


    private fun classInheritance(){

        val programador=Programador("Yovanni",34)
        programador.work()




    }
}