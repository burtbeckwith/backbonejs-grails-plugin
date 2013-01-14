modules = {

    json2 {
        resource url: '/js/json2-2012-10-08.js'
    }

    backbone {
        dependsOn 'underscore', 'json2'
        resource url: '/js/backbone-0.9.9.js'
    }
}
