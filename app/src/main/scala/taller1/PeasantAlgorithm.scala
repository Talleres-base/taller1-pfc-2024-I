/**
* Clase del algoritmo Peasant
*/
package  taller1
import scala.annotation.tailrec

class PeasantAlgorithm  {
  def multiply(a:Int, b:Int): Int = {
    @tailrec
    def multiplyAux(a:Int, b:Int, acc:Int):Int = {
      //Cambiar
      multiplyAux(a,b,acc)
    }
    0 //Cambiar
  }
}
