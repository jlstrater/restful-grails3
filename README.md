Restful Grails 3
===============

Integration is a key piece of modern software development. Whether integrating with external vendors or providing APIs for front-end technologies like AngularJS, REST has become the standard. This session will cover the basic principles of REST, how to create RESTful APIs in Grails, and end with a comparison of some of the plugins available.

---

###Presented at [Gr8ConfEU](http://gr8conf.eu), and [Gr8ConfUS](http://gr8conf.us)

####Copenhagen, Denmark
#####04 June 2015

####Minneapolis, MN USA
#####30 July 2015

----
##Slides

Based on the [OPI Reveal template](http://github.com/objectpartners/opi-reveal-template)

## Dependencies
* Node
* Bower
* grunt-cli

##Getting Started
* Run `npm install` to install node dependencies
* Run `bower install` to install client-side dependencies

##Grunt Commands
* `grunt assemble`
  * Minify/uglify the javascript source and css
  * Compiles jade
  * Stages everything in the dist folder
* `grunt run`
  * Starts a server running on port 8000
  * watches for changes on project files
  * When files change, the assemble task is re-run and
