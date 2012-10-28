package com.denner.ninetynine

import org.specs2.mutable.Specification

class Problem01Spec extends Specification {
  import com.denner.ninetynine.Problem01.last

  "last of" in {
    "List()"         in { theValue(last(List())) must      throwA[NoSuchElementException] }
    "List(1)"        in { last(List(1))          mustEqual 1   }
    "List(1,2)"      in { last(List(1,2))        mustEqual 2   }
    "List('a', 'b')" in { last(List('a', 'b'))   mustEqual 'b' }
  }
}
