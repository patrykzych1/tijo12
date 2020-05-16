package pl.edu.pwsztar

import spock.lang.Specification
import spock.lang.Unroll

class WithdrawSpec extends Specification{
    @Unroll
    def "should withdraw #amount from account #accountNumber if account #exist"() {

        given: "initial data"
            def bank = new Bank()
            bank.createSampleAccounts()
        when: "withdraw succeed"
            def result = bank.withdraw(accountNumber, amount)
        then: "check account exist"
            result == exist

        where:
        accountNumber   | amount | exist
        1               | 10     | true
        2               | 20     | true
        3               | 30     | true
        4               | 40     | true
    }
}
