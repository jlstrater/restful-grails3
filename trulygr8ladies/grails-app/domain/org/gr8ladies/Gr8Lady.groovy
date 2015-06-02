package org.gr8ladies

import grails.rest.Resource

@Resource(uri='/gr8ladies')
class Gr8Lady {

    String first
    String middle
    String last
    String maiden

    String lifetime

    String biography

    ContributionCategory contributionCategory

    static constraints = {
        middle(nullable: true)
        maiden(nullable: true)
        lifetime(nullable: true)
        contributionCategory(nullable: true)
    }

    static mapping = {
        biography type:"text"
    }

    def getDisplayName() {
        this.first + ' ' + this.last
    }
}
