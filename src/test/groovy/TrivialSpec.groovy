import spock.lang.Specification

class TrivialSpec extends Specification {

    void "my trivial test"() {
        when:
        Integer myVar = 1

        then:
        !myVar
    }
}
