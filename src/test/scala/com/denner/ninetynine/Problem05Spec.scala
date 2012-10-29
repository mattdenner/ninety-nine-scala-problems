package com.denner.ninetynine

import org.specs2.mutable.Specification

class Problem05Spec extends Specification {
  import com.denner.ninetynine.Problem05.reverse

  "reverse" should {
    "List()"      in { reverse(List())      === List()      }
    "List(1)"     in { reverse(List(1))     === List(1)     }
    "List(1,2)"   in { reverse(List(1,2))   === List(2,1)   }
    "List(1,2,3)" in { reverse(List(1,2,3)) === List(3,2,1) }
  }
}
