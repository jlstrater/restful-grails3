// Full list of configuration options available here:
// https://github.com/hakimel/reveal.js#configuration
Reveal.initialize({
  controls: true,
  progress: true,
  history: true,
  center: true,
  width: 1024,

  theme: Reveal.getQueryHash().theme, // available themes are in /css/theme
  transition: Reveal.getQueryHash().transition || 'default', // default/cube/page/concave/zoom/linear/fade/none
});

hljs.initHighlightingOnLoad();

Reveal.addEventListener( 'ready', function( event ) {
    if(event.indexh == 0){
      document.body.style.background = "url('./assets/img/gr8conf-template-first.png') no-repeat top left";
      document.body.style.backgroundSize = "100% 100%";
    }
} );

Reveal.addEventListener( 'index-slide', function() {
    document.body.style.background = "url('./assets/img/gr8conf-template-first.png') no-repeat top left";
    document.body.style.backgroundSize = "100% 100%";
}, false );

Reveal.addEventListener( 'slidechanged', function() {
    if(event.indexh != 0) {
        document.body.style.background = "";
        document.body.style.backgroundSize = "";
    }
}, false );