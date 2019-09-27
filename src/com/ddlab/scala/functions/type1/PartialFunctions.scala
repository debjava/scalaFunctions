package com.ddlab.scala.functions.type1

import java.util.Date

object PartialFunctions {

  def showDateWithMessage(date: Date, message: String) = {
    println(date + "<----->" + message);
  }

  def main(args: Array[String]) {
    val date = new Date
    val logWithDateBound = showDateWithMessage(date, _: String);
    logWithDateBound("message1");
    logWithDateBound("message3");
  }

}