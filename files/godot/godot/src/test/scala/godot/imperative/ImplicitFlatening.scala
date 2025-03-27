package godot.imperative

import godot.imperative.Flow._
import junit.framework.TestCase
import org.junit.Assert._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.language.implicitConversions

class ImplicitFlatening { //extends TestCase {
  val FLOW_INNER_VALUE: Int = 42
  val FLOW_INNER_FUT_VALUE: Int = 1
  val thisFut: Future[Int] = Future(FLOW_INNER_FUT_VALUE)
  var flowValue: Flow[Int] = FLOW_INNER_VALUE
  var flowFuture: Flow[Int] = lift(thisFut)
  var flowToFuture: Flow[Future[_]] = thisFut

  def param[T](x: T): Flow[T] = asyncS(x)

  def testFlateningParametricValue(): Unit = {
    ()
//    val fflow = param(flowFuture) : Flow[Int]
//    assertEquals(getS(fflow),
//      getS(asyncS(FLOW_INNER_FUT_VALUE)))
  }

}


