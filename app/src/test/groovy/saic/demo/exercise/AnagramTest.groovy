package saic.demo.exercise

import saic.demo.excercise.Anagram
import spock.lang.Specification

class AnagramTest extends Specification{
    def "is this anagram"() {
        given:
        def  anagram = new Anagram()
        when:
        def actual = anagram.isAnagram(strA, strB)

        then: "compare results"
        actual == expectedResult

        where:
        strA             | strB         |     expectedResult
        'anagram'        | 'margana'    |     true as boolean
        'anagramm'       | 'marganaa'   |     false as boolean
        'Hello'          | 'hello'      |     true as boolean
    }
}
