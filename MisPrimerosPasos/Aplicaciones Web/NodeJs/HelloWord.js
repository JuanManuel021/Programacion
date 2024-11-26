var http=require("http");

var manejador=function(solicitud,respuesta){
    console.log("Se recibio petición")
    respuesta.end("Hello mundo")

};
var servidor =http.createServer(manejador)
servidor.listen(8080);