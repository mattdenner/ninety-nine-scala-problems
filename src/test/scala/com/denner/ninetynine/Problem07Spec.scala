package com.denner.ninetynine

import org.specs2.mutable.Specification

class Problem07Spec extends Specification {
  import com.denner.ninetynine.Problem07.flatten

  "flatten" should {
    "List()"               in { flatten(List())               === List() }
    "List(List())"         in { flatten(List(List()))         === List() }
    "List(List(), List())" in { flatten(List(List(), List())) === List() }

    "List(1, List(2))" in { flatten(List(1, List(2))) === List(1,2) }
    "List(List(1), 2)" in { flatten(List(List(1), 2)) === List(1,2) }

    "List(List(1), List())"      in { flatten(List(List(1), List()))      === List(1) }
    "List(List(), List(1))"      in { flatten(List(List(), List(1)))      === List(1) }
    "List(List(1), List(2))"     in { flatten(List(List(1), List(2)))     === List(1,2) }
    "List(List(1,2), List(3,4))" in { flatten(List(List(1,2), List(3,4))) === List(1,2,3,4) }

    "List(List(List(1), 2), 3)" in { flatten(List(List(List(1), 2), 3)) === List(1,2,3) }
  }
}
