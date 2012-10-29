package com.denner.ninetynine

object Problem07 {
  def flatten(listOfThings: List[Any]): List[Any] = listOfThings.flatMap {
    case value: List[_] => flatten(value)
    case value          => List(value)
  }
}
