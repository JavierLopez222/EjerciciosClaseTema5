package com.example.ejerciciosclasetema5


    fun imprimirLongitud(texto: String): Int{
        var il = texto.length
        return il
    }

    fun compararCadenas(texto1_2: String, texto2:String): Boolean{
        var cc = texto1_2.equals(texto2)
        return cc
    }

    fun compararCadenasDos(texto1_3: String, texto2_3: String): Int{
        var ccd = texto1_3.compareTo(texto2_3)
        return ccd
    }

    fun aMayuscula(texto4: String): String{
        var am = texto4.toUpperCase()
        return am
    }

    fun aMinuscula(texto5: String): String{
        var ami = texto5.toLowerCase()
        return ami
    }

    fun eliminarEspacios(texto6: String): String{
        var ee = texto6.trim()
        return ee
    }

    fun extraerSubcadena(texto7: String): String{
        var es = texto7.slice(5..10)
        return es
    }

    fun reemplazarOcurrencias(texto8: String): String{
        var ro = texto8.replace("H"," ")
        return ro
    }
fun main(){
    var texto1:String = "Hola, mundo"
    var resultado1 = imprimirLongitud(texto1)
    println(resultado1)

    var texto1_2: String = "Hola, mundo"
    var texto2:String = "Hola mundo"
    var resultado2 = compararCadenas(texto1, texto2)
    println("La cadena '$texto1_2' y  la cadena '$texto2' son iguales: "+resultado2)

    var texto1_3: String = "abvd"
    var texto2_3: String = "jp3rfh"
    var resultado3 = compararCadenasDos(texto1_3, texto2_3)
    println("Esta es la diferencia de las dos cadenas: "+resultado3)

    var texto4: String = "hola mundo"
    var resultado4 = aMayuscula(texto4)
    println(resultado4)

    var texto5: String = "HOLA MUNDO"
    var resultado5 = aMinuscula(texto5)
    println(resultado5)

    var texto6: String = "  Hola mundo  "
    var resultado6 = eliminarEspacios(texto6)
    println(resultado6)

    var texto7: String = "sacalakalasnicof"
    var resultado7 = extraerSubcadena(texto7)
    println(resultado7)

    var texto8: String = "Hola"
    var resultado8 = reemplazarOcurrencias(texto8)
    println("La cadena original es '$texto8' y la nueva cadena es '$resultado8'")
}