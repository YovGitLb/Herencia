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

        val persona=Persona("Yovanni",38)
        persona.ocupation()

        val programador=Programador("Yovanni",34,"Kotlin")
        programador.work()
        programador.lenguaje()
        programador.institucion()
        programador.ocupation()
        programador.drive()

        val diseñador=Diseñador("Ledesma",35)
        diseñador.institucion()
        diseñador.aplicativo()



    }
}