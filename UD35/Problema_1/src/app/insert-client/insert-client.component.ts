import { Component, Output } from '@angular/core';

@Component({
  selector: 'app-insert-client',
  templateUrl: './insert-client.component.html',
  styleUrls: ['./insert-client.component.css']
})
export class InsertClientComponent {
  name = 'Alta Cliente';

  // Input values
  public clientName = "";
  public clientCif = "";
  public clientDirection = "";
  public clientGroup = 0;

  @Output() formValues: any[] = [];

  save() {
    // Save client
    let values = {
      clientName: this.clientName,
      clientCif: this.clientCif,
      clientDirection: this.clientDirection,
      clientGroup: this.clientGroup
    };
    console.log(values);
    this.formValues.push(values);
    this.void();

  }

  void() {
    this.clientName = "";
    this.clientCif = "";
    this.clientDirection = "";
    this.clientGroup = 0;
  }
}
