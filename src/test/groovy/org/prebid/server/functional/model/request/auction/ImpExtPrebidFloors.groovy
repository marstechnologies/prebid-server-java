package org.prebid.server.functional.model.request.auction

import groovy.transform.ToString

@ToString(includeNames = true, ignoreNulls = true)
class ImpExtPrebidFloors {

    String floorRule
    BigDecimal floorRuleValue
    BigDecimal floorValue
}
