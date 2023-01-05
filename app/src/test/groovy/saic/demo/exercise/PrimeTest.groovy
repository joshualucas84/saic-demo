package saic.demo.exercise


import saic.demo.excercise.Prime
import spock.lang.Specification

class PrimeTest extends Specification{
    def "prime tests"() {
        given:
        def  prime = new Prime()

        when:
        def actual = prime.isPrime(number)

        then: "I should get a prime number"
        actual == expectedResult

        where:
        number  |  expectedResult
         1      |     false as boolean
         3      |     true as boolean
         13     |     true as boolean
         4      |     false as boolean
    }
}
