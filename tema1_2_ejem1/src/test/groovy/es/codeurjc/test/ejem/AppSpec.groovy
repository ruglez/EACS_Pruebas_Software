package es.codeurjc.test.ejem;

import spock.lang.*

class AppSpec extends spock.lang.Specification{
	def "Adding two numbers to get the sum"() {
		when: "a new Calculadora class is created"
			Calculadora calc = new Calculadora ();
		then: "1 plus 1 is 1"
			calc.suma(1, 1) == 2
	}


    def "Subtracting two numbers to get the sum"() {
        when: "a new Calculadora class is created"
        	Calculadora calc = new Calculadora ();
        then: "1 minus 1 is 0"
        	calc.resta(1, 1) == 0
    }

}

