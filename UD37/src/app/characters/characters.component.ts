import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-characters',
  templateUrl: './characters.component.html',
  styleUrls: ['./characters.component.css']
})
export class CharactersComponent implements OnInit {
  characters: any[] = [];
  shuffleC: any[] = [];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get<any>('assets/database.json').subscribe(
      data => {
        this.characters = data.characters;
        this.shuffleC = this.shuffle(this.characters);
      },
      error => {
        console.log("Something went wrong", error);
      }
    );
  }

  shuffle(array: any[]): any[] {
    const rm = [...array];
    for (let i = rm.length - 1; i > 0; i--) {
      const j = Math.floor(Math.random() * (i + 1));
      [rm[i], rm[j]] = [rm[j], rm[i]];
    }
    return rm;
  }
}
