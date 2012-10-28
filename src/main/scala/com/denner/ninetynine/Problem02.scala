package com.denner.ninetynine

object Problem02 {
  def penultimate[T](list: List[T]): T = list match {
    case List()        => throw new NoSuchElementException
    case x :: _ :: Nil => x
    case _ :: tail     => penultimate(tail)
  }
}
