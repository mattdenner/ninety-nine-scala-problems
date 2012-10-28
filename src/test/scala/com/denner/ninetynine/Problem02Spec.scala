package com.denner.ninetynine

import org.specs2.mutable.Specification

class Problem02Spec extends Specification {
  import com.denner.ninetynine.Problem02.penultimate

  "penultimate of" in {
    "List()"         in { theValue(penultimate(List()))  must      throwA[NoSuchElementException] }
    "List(1)"        in { theValue(penultimate(List(1))) must      throwA[NoSuchElementException] }
    "List(1,2)"      in { penultimate(List(1,2))         mustEqual 1   }
    "List(1,2,3)"    in { penultimate(List(1,2,3))       mustEqual 2   }
    "List('a', 'b')" in { penultimate(List('a', 'b'))    mustEqual 'a' }
  }
}
