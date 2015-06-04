import grails.converters.JSON
import org.gr8ladies.Chapter
import org.gr8ladies.Gr8Lady

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                if (!Gr8Lady.count()) {
                    Chapter chapterMsp = new Chapter(name: 'Minneapolis').save()
                    Chapter chapterTx = new Chapter(name: 'Austin').save()

                    Gr8Lady jenn = new Gr8Lady(first: 'Jenn', last: 'Strater', email: 'jenn@gr8ladies.org', chapter: chapterMsp).save()
                    Gr8Lady you = new Gr8Lady(first: 'You', last: 'AreGr8', email: 'yourName@gr8ladies.org').save()
                }
            }
        }

        JSON.registerObjectMarshaller(Gr8Lady) {
            def returnArray = [:]
            returnArray['firstName'] = it.first
            returnArray['lastName'] = it.last
            returnArray['chapter'] = it.chapter?.name
            return returnArray
        }
    }
    def destroy = {
    }
}
