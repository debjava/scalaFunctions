package com.ddlab.scala.functions.type1

object Test1 {

  def addTwoNums(x: Int, y: Int): Int = {
    var sum = 0;
    sum = x + y;
    return sum;
  }
  
  def showSomeValue(): Unit = {
    println("Hello ...");
  }
  
  def showValue() {
    println("Now Hello ...");
  }
  
  def doSomethingNReturnSomeValue() = {
    var a: Int = 10;
    var b: Int = 20;
    
    var sum: Int = a+b;
    println("Sum : "+sum);
    sum; //It returns the sum of two values
  }
  

  def main(args: Array[String]) {
    var result: Int = addTwoNums(10, 20);
    println("Result : " + result);
    showSomeValue();
    showValue();
    var x: Int = doSomethingNReturnSomeValue();
    println("value of X : "+x);
  }
}