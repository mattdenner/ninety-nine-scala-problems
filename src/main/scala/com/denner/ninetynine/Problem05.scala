package com.denner.ninetynine

object Problem05 {
  def reverse[T](list: List[T]): List[T] = list match {
    case List() => List()
    case head :: tail => reverse(tail) :+ head
  }
}
