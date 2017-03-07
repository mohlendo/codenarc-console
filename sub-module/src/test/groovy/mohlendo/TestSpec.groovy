package mohlendo

import spock.lang.Specification

class TestSpec extends Specification {

    def 'test codenar error'() {
        when:
        Test test = new Test()
        test.value = "foo"

        then:
        test.value == "bar"
    }
}
