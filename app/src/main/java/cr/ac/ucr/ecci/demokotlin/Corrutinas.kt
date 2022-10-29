package cr.ac.ucr.ecci.demokotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

class Corrutinas {

    fun corrutinaEjemplo() {
        runBlocking {
            launch {
                //Simultaneamente en la corrutina se ejecuta el delay y el print
                delay(1000L)
                println("Corrutina")
            }
            //Esto se ejecuta
            println("Hilo principal")
        }
    }

    fun corrutinaEjemplo2() {
        //Contador en 0
        var count = 0;
        runBlocking {
            //Cantidad de veces que se repite (ciclo)
            repeat(1000) {
                //Inicio corrutina
                launch {
                    //Espera 4s
                    delay(4000L)
                    println(count)
                    count++
                }
            }
        }
    }

    //Muchas corrutinas son equivalentes a un hilo en java, son las livianos y eficientesv

    fun hiloEjemplo() {
        //Contador en 0
        var count = 0;
        runBlocking {
            //Cantidad de veces que se repite (ciclo)
            repeat(1000) {
                //Inicio hilo
                thread {
                    //Espera 4s
                    Thread.sleep(4000)
                    println(count)
                    count++
                }
            }
        }
    }

    // El manejo de hilos es más complicado que el de corrtunias
    // los hilos son más pesados en términos de memoria y menos eficientes
    // En el ejemplo se queda sin memoria y da resultados erroneos

}

fun main() {
    val corrutinas = Corrutinas()
    //corrutinas.corrutinaEjemplo()
    corrutinas.corrutinaEjemplo2()
    //corrutinas.hiloEjemplo()
}