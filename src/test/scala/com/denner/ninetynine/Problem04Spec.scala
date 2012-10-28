package com.denner.ninetynine

import org.specs2.mutable.Specification

class Problem04Spec extends Specification {
  // Interesting: can't import the length function directly!
  import com.denner.ninetynine.Problem04

  "length" should {
    "List()"    in { Problem04.length(List())    mustEqual 0 }
    "List(1)"   in { Problem04.length(List(1))   mustEqual 1 }
    "List(1,2)" in { Problem04.length(List(1,2)) mustEqual 2 }
  }
}
