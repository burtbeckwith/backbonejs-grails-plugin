modules = {

    json2 {
        resource url: '/js/json2-2012-10-08.js'
    }

    backbone {
        dependsOn 'underscore', 'json2'
        resource url: '/js/backbone.js'
    }
}
