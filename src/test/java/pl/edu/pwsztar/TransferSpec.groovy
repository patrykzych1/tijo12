package pl.edu.pwsztar

import spock.lang.Specification
import spock.lang.Unroll

class TransferSpec extends Specification {
    @Unroll
    def "should transfer #amount from #fromAccount to #toAccount if #exists"() {

        given: "initial data"
            def bank = new Bank()
            bank.createSampleAccounts()
        when: "transfer succeed"
            result = bank.transfer(fromAccount, toAccount, amount)
        then: "check accounts exists"
            result

        where:
        fromAccount     | toAccount | amount
        1               | 2        | 3
        2               | 3        | 3
        3               | 4        | 3
        4               | 1         | 3
    }
}
