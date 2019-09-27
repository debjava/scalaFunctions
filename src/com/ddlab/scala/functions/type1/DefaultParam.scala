package com.ddlab.scala.functions.type1

object DefaultParam {
  
  def showDefaultParam(a: Int = 5, b: Int = 6): Int = {
    var sum: Int = a+b;
    sum;
  }
  
  def main(args: Array[String]) {
    var total: Int = showDefaultParam();
    println("Empty Total: "+total);
    total = showDefaultParam(10, 20);
    println("Now Total: "+total);
  }
}