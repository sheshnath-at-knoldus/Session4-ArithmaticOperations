
package com.knoldus

class ArithmaticOperation {

  /*method for different operations
  Generic method is created for Numeric Operations
   */
  def operations[A:Numeric](listOfOptions: List[Option[A]], operationsType: String): A = {
    if (listOfOptions.isEmpty) throw new NoSuchElementException() //throw exceptions
    val result = for {
      n1 <- listOfOptions.flatten(f => f)
    } yield n1

    //match the type of operation to perform different operations
    operationsType match {
      case "Addition" => result.sum
      case "Subtraction" => result.reduceLeft(Numeric[A].minus)
      case "Multiplication" => result.product
      case _ => throw new IllegalArgumentException() //throw exception
    }
  }
}
