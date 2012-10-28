package com.denner.ninetynine

import org.specs2.mutable.Specification

class Problem03Spec extends Specification {
  import com.denner.ninetynine.Problem03.nth

  "nth" should {
    "handle negative of" in {
      "List()"  in { theValue(nth(-1, List()))  must throwA[NoSuchElementException] }
      "List(1)" in { theValue(nth(-1, List(1))) must throwA[NoSuchElementException] }
    }

    "handle zero'th of" in {
      "List()"  in { theValue(nth(0, List())) must      throwA[NoSuchElementException] }
      "List(1)" in { nth(0, List(1))          mustEqual 1 }
    }

    "handle one'th of" in {
      "List()"    in { theValue(nth(1, List()))  must      throwA[NoSuchElementException] }
      "List(1)"   in { theValue(nth(1, List(1))) must      throwA[NoSuchElementException] }
      "List(1,2)" in { nth(1, List(1,2))         mustEqual 2 }
    }
  }
}
