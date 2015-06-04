class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/gr8ladies"(resources:"gr8lady", excludes:['delete']) {
            "/chapters"(controller:"chapter", readOnly: true)
        }

        "/v2/gr8ladies/$id"(resources: "gr8lady", controller: 'gr8ladyv2')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
