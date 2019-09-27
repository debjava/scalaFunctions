package com.ddlab.scala.functions.type1

object TestVariabeArgument {
  
  def showAllLangs(langs: String*) {
    
    for(lang <- langs) {
      println("Language Name: "+lang);
    }
  }
  
  def main(args: Array[String]) {
    showAllLangs("Java","Python","Scala","C");
  }
}