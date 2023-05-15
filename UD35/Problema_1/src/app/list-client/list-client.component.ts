import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-list-client',
  templateUrl: './list-client.component.html',
  styleUrls: ['./list-client.component.css']
})
export class ListClientComponent {
  name = "Listado de Clientes";
  id = 0;

  @Input() formValues!: any[];
  newName = "";
  newCif = "";
  newDirection = "";
  newGroup = 0;
}
