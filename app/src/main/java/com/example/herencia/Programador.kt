package com.example.herencia

class Programador(name:String,age:Int,val lenguaje:String):Persona(name,age),drive{

    override fun work() {
        super.work()
    }

    fun lenguaje(){
        println("Yo estoy programando con el $lenguaje kotlin")
    }

    override fun institucion() {
        super.institucion()
    }

    override fun drive() {
        println("El conduce un vehiculo")
    }



}