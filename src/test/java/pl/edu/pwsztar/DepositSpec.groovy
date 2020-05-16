package pl.edu.pwsztar

import spock.lang.Specification
import spock.lang.Unroll

class DepositSpec extends Specification {
    @Unroll
    def "should deposit #amount to #accountNumber if account exist #exist"() {

        given: "initial data"
            def bank = new Bank()
            bank.createSampleAccounts()
        when: "the account deposit is successfuly"
            def result = bank.deposit(accountNumber, amount)
        then: "check account number exist"
            result == exist

        where:
        accountNumber   | amount | exist
        1               | 10     | true
        2               | 20     | true
        3               | 30     | true
        4               | 40     | true
    }
}
