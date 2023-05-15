import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'UD34';

  // Variables to be used
  number1 = "0";
  number2 = "0";
  operator = "";

  print() {
    //Print in input label
    console.log(this.number1);
  }

  firstNumber = true;
  pressNumber(number: number) {
    // Press btn numbers
    if (this.firstNumber || this.number1 === '0') {
      this.number1 = number.toString();
      this.firstNumber = false;
    } else {
      this.number1 += number.toString();
    }
    this.print();
  }

  decimalsBtnPressed = false;
  pressDecimals() {
    // Press point btn
    if(!this.decimalsBtnPressed) {
        this.number1 += ".";
        this.decimalsBtnPressed = true;
        this.print();
    }
  }

  pressC() {
    // Clear calculator C btn
    this.number1 = "0";
    this.number2 = "0";
    this.firstNumber = true;
    this.decimalsBtnPressed = false;
    this.print();
  }

  operatorFirstTimePressed = true
  pressOperator(value: number) {
    // Operation btn
    if(value == 6) {
      this.operator = value.toString();
      this.number2 = this.number1;
      this.pressEquals();
    } else {
      if(this.operatorFirstTimePressed) {
        this.number2 = this.number1;
        this.number1 = "0";
        this.operator = value.toString();
        this.decimalsBtnPressed = false;
        this.print();
        this.operatorFirstTimePressed = false;
      } else {
        this.pressEquals();
        this.number2 = this.number1;
        this.number1 = "0";
        this.operator = value.toString();
        this.decimalsBtnPressed = false;
        this. operatorFirstTimePressed = false;
      }
    }
  }

  pressEquals() {
    // Equals btn
    switch(parseFloat(this.operator)) {
      case 1:
        this.number1 = (parseFloat(this.number2) + parseFloat(this.number1)).toString();
      break;
      case 2:
        this.number1 = (parseFloat(this.number2) - parseFloat(this.number1)).toString();
      break;
      case 3:
        this.number1 = (parseFloat(this.number2) * parseFloat(this.number1)).toString();
      break;
      case 4:
        this.number1 = (parseFloat(this.number2) / parseFloat(this.number1)).toString();
      break;
      case 5:
        this.number1 = (Math.pow(parseFloat(this.number2), parseFloat(this.number1))).toString();
      break;
      case 6:
        this.number1 = (Math.sqrt(parseFloat(this.number2))).toString();
      break;
      case 7:
        this.number1 = (parseFloat(this.number1) % parseFloat(this.number2)).toString();
      break;
    }
    this.print();
    this.decimalsBtnPressed = false;
    this.operatorFirstTimePressed = true;
  }

  easterEgg() {
    // Easter egg
    window.open('https://www.youtube.com/watch?v=dQw4w9WgXcQ', '_blank');
    const inputElement = document.getElementById("input") as HTMLInputElement;
    this.number1 = "EASTER EGG UNLOCKED";
    this.print();
  }
}
