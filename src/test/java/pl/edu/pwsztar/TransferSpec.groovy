package pl.edu.pwsztar

import spock.lang.Specification
import spock.lang.Unroll

class TransferSpec extends Specification {
    @Unroll
    def "should transfer #amount from #fromAccount to #toAccount if exists"() {

        given: "initial data"
            def bank = new Bank()
            bank.createSampleAccounts()
        when: "transfer succeed"
            def result = bank.transfer(fromAccount, toAccount, amount)
        then: "check accounts exists"
            result

        where:
        fromAccount     | toAccount | amount
        1               | 2         | 5
        2               | 3         | 10
        3               | 4         | 15
        4               | 1         | 20
    }
}
