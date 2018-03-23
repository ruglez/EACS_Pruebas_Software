package es.codeurjc.test.complex;

import spock.lang.*

class ComplexSpec extends spock.lang.Specification{
	def "Given Zero Complex then Real Part Zero And Imaginary Part Zero"() {
		when: "a zero Complex is created"
		    Complex complex = new Complex (0,0);
		then: "Real part is zero"
		    complex.getRealPart() == 0
		and: "Imaginary part is zero"
		    complex.getImaginaryPart() == 0
	}


	def "Given Zero Complex when Add To Complex1_1_ then Complex 1_1 IsObtained and \
     GivenComplex1_1 when Add To ComplexZero then Complex 1_1 IsObtained"() {
		when: "a zero Complex and Complex 1_1 are created"
		    Complex complexZero = new Complex (0,0);
            Complex complexOneOne = new Complex (1,1);
        then: "adding complexZero to Complex1_1 the result is Complex1_1"
            complexOneOne.add(complexZero) == complexOneOne
        and: "adding complex1_1 to ComplexZero the result is Complex1_1"
            complexZero.add(complexOneOne) == complexOneOne

	}

    def "Given Zero Complex when Add To Complex1_1_ thenComplex 1_1 IsObtained using Given_When_Then"() {
        given: "a zero Complex"
            Complex complexZero = new Complex (0,0);
        when: "Add Complex1_1 is added"
            Complex complexOneOne = new Complex (1,1);
            Complex resultSumComplexZero_1_1 = complexZero.add(complexOneOne)
        then: "the result is the Complex 1_1"
            resultSumComplexZero_1_1 == complexOneOne

    }



    def "Given Zero Complex when Add To Complex1_1_ thenComplex 1_1 IsObtained and \
     GivenComplex1_1 when Add To Zero then Complex 1_1 IsObtained shorter version!!"() {
        when: "sum ComplexZero and Complex1_1 in any order"

        then:  "adding complex1_1 to ComplexZero the result is Complex1_1"
            (new Complex(0, 0)).add(new Complex(1, 1)) ==new Complex(1, 1)
        and: "adding complexZero to Complex1_1 the result is Complex1_1"
            (new Complex(1, 1)).add(new Complex(0, 0)) == new Complex(1, 1)
    }

}

