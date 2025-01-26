import spock.lang.Specification

class ExampleServiceSpec extends Specification {

    def exampleService = new ExampleService()

    def setup() {
        // Setup code if needed
    }

    def "test example functionality"() {
        expect:
        exampleService.exampleMethod() == expectedValue
    }
}