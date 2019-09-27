package com.ddlab.scala.functions.type1

object TestNamedArgument {
  
  def showValues(a: Int, b: Int) {
    println("Value of a: "+a);
    println("Value of b: "+b);
  }
  
  def main(args: Array[String]) {
    showValues(b = 10, a = 20);
  }
}