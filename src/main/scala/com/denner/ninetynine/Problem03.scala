package com.denner.ninetynine

object Problem03 {
  def nth[T](n: Int, list: List[T]): T =
    if (n < 0)               throw new NoSuchElementException
    else if (n == 0)         list.head
    else if (list == List()) throw new NoSuchElementException
    else                     nth(n-1, list.tail)
}
