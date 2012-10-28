package com.denner.ninetynine

object Problem04 {
  def length[T](list: List[T]): Int = list.foldLeft(0) { (c, _) => c + 1 }
}
