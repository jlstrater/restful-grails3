package org.gr8ladies

class ContributionController {

    static allowedMethod = [index: 'GET']

    def index() {
        render status: NOT_FOUND
    }
}