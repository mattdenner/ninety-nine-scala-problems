package com.denner.ninetynine

object Problem01 {
  def last[T](list: List[T]): T = list match {
    case List()    => throw new NoSuchElementException
    case List(x)   => x
    case _ :: tail => last(tail)
  }
}
