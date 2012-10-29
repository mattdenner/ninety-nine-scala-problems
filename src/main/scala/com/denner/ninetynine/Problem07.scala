package com.denner.ninetynine

object Problem07 {
  def flatten[T](listOfLists: List[List[T]]): List[T] =
    listOfLists.foldRight(List[T]()) { (flat,list) => flat ++ list }
}
