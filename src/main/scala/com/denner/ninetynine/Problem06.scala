package com.denner.ninetynine

object Problem06 {
  def isPalindrome[T](list: List[T]): Boolean = list == list.reverse
}
