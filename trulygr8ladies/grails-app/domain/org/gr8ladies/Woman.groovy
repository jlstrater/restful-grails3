package org.gr8ladies

import grails.rest.Resource

@Resource(uri='/woman')
class Woman {

    String first
    String middle
    String last
    String maiden

    Date birth
    Date death

    String biography

    static constraints = {
        middle(nullable: true)
        maiden(nullable: true)
        birth(nullable: true)
        death(nullable: true)
    }

    static mapping = {
        biography type:"text"
    }
}
