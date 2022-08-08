package com.example.herencia

open class Persona (name:String,age:Int):Work(){

    open fun work(){
        println("Estoy trabajando")

    }

    open fun institucion(){
        println("Estudio en la institucion Cibertec")
    }

    override fun ocupation() {
       println("Mi ocupacion puede ser programador o diseñador")
    }

}