package saic.demo.exercise

import saic.demo.excercise.ReverseString
import spock.lang.Specification

class ReverseStringTest extends Specification{
    def "can I reverse string"() {
        given:
        def  reverseString = new ReverseString()
        when:
        def actual = reverseString.reverseString(strA)

        then: "compare results"
        actual == expectedResult

        where:
        strA             |  expectedResult
        "anagram"        | "margana"
        "anagramm"       | "mmargana"
        "hello"          | "olleh"
    }
}
