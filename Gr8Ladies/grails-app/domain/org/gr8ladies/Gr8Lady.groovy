package org.gr8ladies

import grails.rest.Resource

@Resource(uri='/gr8ladies')
class Gr8Lady {

    String first
    String last
    String email

    Chapter chapter

    static constraints = {
        chapter(nullable: true)
    }

    def getDisplayName() {
        this.first + ' ' + this.last
    }
}
