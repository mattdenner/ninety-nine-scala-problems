package com.denner.ninetynine

import org.specs2.mutable.Specification

class Problem06Spec extends Specification {
  import com.denner.ninetynine.Problem06.isPalindrome

  "isPalindrome" should {
    "List()"          in { isPalindrome(List())          must beTrue  }
    "List(1)"         in { isPalindrome(List(1))         must beTrue  }
    "List(1,2)"       in { isPalindrome(List(1,2))       must beFalse }
    "List(1,2,1)"     in { isPalindrome(List(1,2,1))     must beTrue  }
    "List(1,2,3)"     in { isPalindrome(List(1,2,3))     must beFalse }
    "List(1,2,3,2,1)" in { isPalindrome(List(1,2,3,2,1)) must beTrue  }
  }
}
