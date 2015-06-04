package org.gr8ladies

import grails.rest.RestfulController
import grails.converters.JSON

class Gr8LadyV2Controller extends RestfulController {

    static responseFormats = ['xml']

    Gr8LadyV2Controller() {
        super(Gr8Lady)
    }

    def customMethod(id) {
        Gr8Lady gr8Lady = Gr8Lady.get(id)
        render gr8Lady as JSON
    }
}