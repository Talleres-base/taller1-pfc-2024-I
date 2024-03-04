/*
 * This Scala Testsuite was generated by the Gradle 'init' task.
 */
package taller1
import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner
import scala.util.Random

@RunWith(classOf[JUnitRunner])
class PeasantAlgorithmTest extends AnyFunSuite {
  test("PeasantAlgorithm multiply method") {
    val peasantAlgorithm = new PeasantAlgorithm()
    val listA = Random.shuffle((1 to 100).toList)
    val listB = Random.shuffle((1 to 100).toList)
    for (i <- 0 until 100) {
      assert(peasantAlgorithm.multiply(listA(i), listB(i)) == listA(i) * listB(i))
    }
  }
}
