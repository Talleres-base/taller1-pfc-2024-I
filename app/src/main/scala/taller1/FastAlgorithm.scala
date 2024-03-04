/**
* Clase del algoritmo Fast
*/
package  taller1
import scala.annotation.tailrec

class FastAlgorithm  {
  def multiply(a:Int, b:Int): Int = {
    @tailrec
    def multiplyAux(a:Int, b:Int, acc:Int):Int = {
      //Cambiar
      multiplyAux(a,b,acc)
    }
    0 //Cambiar
  }
}
