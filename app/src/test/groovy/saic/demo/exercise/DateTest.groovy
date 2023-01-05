package saic.demo.exercise

import saic.demo.excercise.DateParse
import spock.lang.Specification

class DateTest extends Specification{
    def "test Date"() {
        given:
        def  dateTest = new DateParse()
        when:
        def actual = dateTest.convertDate(dateIn)

        then: "compare results"
        actual == "$expectedResult"

        where:
        dateIn                |   expectedResult
        '1st Mar 1974'        |   '1974-03-01'
        '22nd Jan 2013'       |   '2013-01-22'
        '7th Apr 1904'        |   '1904-04-07'
    }
}
