package saic.demo.exercise


import saic.demo.excercise.Staircase
import spock.lang.Specification

class StaircaseTest  extends Specification{
    def "Kid has a bunch of steps"() {
        given:
        def  staircase = new Staircase()

        when:
        def actual = staircase.countWaysDP(steps, testInput)

        then: "I should get the frequency count of the max number in the integer array"
        actual == "$expectedResult"

        where:
        testInput                         | steps   |     expectedResult
        [1..10].dump()  as int []         | 4       |     97
        [1..20].dump()  as int []         | 1       |     106
    }
}
