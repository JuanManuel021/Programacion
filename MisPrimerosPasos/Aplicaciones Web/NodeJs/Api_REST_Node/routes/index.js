const express=require('express');
const routes=express.Router();

const clienteController=require('../controllers/clienteController')

module.exports=function(){
   routes.post('/clientes',clienteController.nuevoCliente);


   
   return routes;
}