package com.denner.ninetynine

object Problem05 {
  def isPalindrome[T](list: List[T]): Boolean = list == list.reverse
}
