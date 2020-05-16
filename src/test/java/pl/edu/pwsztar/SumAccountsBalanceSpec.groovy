package pl.edu.pwsztar

import spock.lang.Specification
import spock.lang.Unroll

class SumAccountsBalanceSpec extends Specification {
    @Unroll
    def "should return #sum from all accounts balance"() {

        given: "initial data"
            def bank = new Bank()
            bank.createSampleAccounts()
        when: "sum is calculated"
            def sum = bank.sumAccountsBalance()
        then: "check sum"
            sum == 1343

    }
}
