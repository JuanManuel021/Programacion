import { Component, OnInit } from '@angular/core';
import { CategoriasService } from '../../services/categorias.service';

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrl: './body.component.css'
})
export class BodyComponent implements OnInit{

  categorias: any;
  arrCategorias: any;

  // Lo primero es declar una variable del tipo que queremos usar, para el uso del service
  constructor(private _categorias: CategoriasService){

  }

  ngOnInit(): void {
    this.obtenerTodasCategorias();
  }

  obtenerTodasCategorias(){
    this._categorias.obtenerTodasCategorias()
      //se suscribe al observable, cuando el servicio obtenga una respuesta notifique y pueda recibir una respuesta. Esto es lo reactivo
      // expresión lamda
      .subscribe( (respuesta: any) =>{
        this.categorias = respuesta;
        // this.arrCategorias = this.categorias.categoriaResponse.categoria;
        console.log( this.arrCategorias);

        // console.log(this.categorias);
      })
  }

}
