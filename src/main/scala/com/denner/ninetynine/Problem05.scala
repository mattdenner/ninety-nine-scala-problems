package com.denner.ninetynine

object Problem05 {
  def reverse[T](list: List[T]): List[T] =
    list.foldLeft(List[T]()) { (reversed, value) => value :: reversed }
}
