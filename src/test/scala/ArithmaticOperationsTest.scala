package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class ArithmaticOperationsTest extends AnyFunSuite{

  test("Test case for Addition"){
    val instance = new ArithmaticOperation
    val list = List(Some(10), Some(10), Some(10))
    val actualValue =instance.operations(list, "Addition")
    val expectedValue = 30
    assert(actualValue===expectedValue)
  }

  test("Test case for Subtraction") {
    val instance = new ArithmaticOperation
    val list = List(Some(10), Some(10), Some(10))
    val actualValue = instance.operations(list, "Subtraction")
    val expectedValue = -10
    assert(actualValue === expectedValue)
  }


  test("Test case for Multiplication") {
    val instance = new ArithmaticOperation
    val list = List(Some(10), Some(10), Some(10))
    val actualValue = instance.operations(list, "Multiplication")
    val expectedValue = 1000
    assert(actualValue === expectedValue)
  }

}
