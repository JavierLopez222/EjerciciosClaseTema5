package com.example.ejerciciosclasetema5

    fun suma_nullable(a: Int?, b: Int?): Int?{
        return if (a != null && b != null) a + b else null
    }
    fun resta_nullable(a: Int?, b: Int?): Int?{
        return  if (a != null && b != null) a - b else null
    }
    fun multiplicacion_nullable(a: Int?, b:Int?): Int?{
        return if (a != null && b != null) a * b else null
    }

fun main(){
    var a: Int = 9
    var b: Int = 8
    var resultadoSumaNull = suma_nullable(a, b)
    println(resultadoSumaNull)
    var resultadoRestaNull = resta_nullable(a, b)
    println(resultadoRestaNull)
    var resultadoMultiplicacionNull = multiplicacion_nullable(a, b)
    println(resultadoMultiplicacionNull)
}