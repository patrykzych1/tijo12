package pl.edu.pwsztar

import spock.lang.Specification
import spock.lang.Unroll

class AccountBalanceSpec extends Specification {
    @Unroll
    def "should get balance from #accountNumber"() {

        given: "initial data"
          def bank = new Bank()
          bank.createSampleAccounts()
        when: "check account balance"
           def result = bank.accountBalance(accountNumber)
        then: "check account number"
            result == balance

        where:
        accountNumber   | balance
        1               | 0
        2               | 0
        3               | 0
        4               | 0
    }
}
