const Clientes=require('../models/Clientes');

//agrega un nuevo cliente
exports.nuevoCliente=async(req,res,next)=>{
    //console.log(req.body)
    const cliente=new Clientes(req.body);
    try {
        //almacena registro
        await cliente.save();
        res.json({mensaje:'Se agrego un nuevo cliente',cliente:req.body
        })
    }catch (error){
        //si hay error
        console.log(error);
        next();
    }
}