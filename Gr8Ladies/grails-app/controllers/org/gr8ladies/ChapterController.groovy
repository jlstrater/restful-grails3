package org.gr8ladies

import grails.rest.RestfulController

class ChapterController extends RestfulController {

    static responseFormats = ['json']

    static allowedMethods = [testError: 'GET']

    ChapterController() {
        super(Chapter)
    }

    def testError() {
        render status: 403
    }
}