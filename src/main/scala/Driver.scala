
package com.knoldus
import scala.io.StdIn
import scala.util.{Failure, Success, Try}

object Driver extends App {

  val instance = new ArithmaticOperation
  val list = List(Some(1.0), Some(3.0), Some(4.0))
  private val operation = StdIn.readLine()
  val result = Try(instance.operations(list, operation))
  //handling Exception
  result match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }


}
