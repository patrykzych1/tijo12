package pl.edu.pwsztar

import spock.lang.Specification
import spock.lang.Unroll

class DeleteAccountSpec extends Specification {
    @Unroll
    def "should delete account number #accountNumber with balance #balance"() {

        given: "initial data"
            def bank = new Bank()
            bank.createSampleAccounts()
        when: "the account is deleted"
            def cash = bank.deleteAccount(accountNumber)
        then: "check cash"
            cash == balance

        where:
        accountNumber   | balance
        1               | 200
        2               | 370
        3               | 123
        4               | 650
    }
}
