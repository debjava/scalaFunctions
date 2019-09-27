package com.ddlab.scala.functions.type1

object TestAnonymousFunction {

  var inrement = (x: Int) => x + 1;

  def main(args: Array[String]) {
    var num: Int = inrement(5);
    println("Num : " + num);
    
    var mul = (a: Int, b: Int) => a*b;
    var mulVal: Int = mul(5,6);
    println("Multiplication value : "+mulVal);
    
    var userDir = () => { System.getProperty("user.dir") }
    println( userDir )
    
  }
}