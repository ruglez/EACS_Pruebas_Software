package es.codeurjc.test.complex;

import spock.lang.*

class ComplexAbsSpec extends spock.lang.Specification{
	def "Given some complex numbers tests if abs value is right"() {

		given:
			Complex complex = new Complex(a,b)
        when: "Complex "
        	double resultAbs = complex.abs()
        then: " The result od the absolute values of the comples "

		expect: "Abs value of each complex is the right"


		AbsOfComplex == resultAbs


		where: "the following cases are"
			a | b | AbsOfComplex
			1 | 1 | 1.4142135623730951
        	0 | 0 | 0
        	2 | 2 | 2.8284271247461903
        	20| 2 | 20.09975124224178

	}

}



