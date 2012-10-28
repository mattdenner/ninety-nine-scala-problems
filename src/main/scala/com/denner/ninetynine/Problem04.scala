package com.denner.ninetynine

object Problem04 {
  def length[T](list: List[T]): Int = {
    def iter(length: Int, list: List[T]): Int = list match {
      case List() => length
      case _ :: tail => iter(length+1, tail)
    }
    iter(0, list)
  }
}
