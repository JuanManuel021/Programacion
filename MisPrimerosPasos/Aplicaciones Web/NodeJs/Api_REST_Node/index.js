//Importamos express
const express = require('express');
const routes=require('./routes');

//importamos mongose
const mongoose=require('mongoose');
//importar body parser
const bodyParser=require('body-parser');

//conectar mongo 
mongoose.Promise=global.Promise;
mongoose.connect('mongodb://localhost/restapis',{
    useNewUrlParser:true
});


//creamos el servidor
const app =express();

//habilitamos bodyparser, para poder recibir informacion para crear
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extends: true}));

//Rutas de la app
app.use('/',routes());

//Puerto
app.listen(5050);
