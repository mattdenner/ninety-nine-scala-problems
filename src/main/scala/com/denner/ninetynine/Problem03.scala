package com.denner.ninetynine

object Problem03 {
  def nth[T](n: Int, list: List[T]): T = (n, list) match {
    case (0, x :: List()) => x
    case (n, _ :: tail)   => nth(n-1, tail)
    case (_, List())      => throw new NoSuchElementException
  }
}
