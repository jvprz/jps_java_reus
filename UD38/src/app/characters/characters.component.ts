import { Component, OnInit } from '@angular/core';
import { CharactersService } from '../services/characters.service';

@Component({
  selector: 'app-characters',
  templateUrl: './characters.component.html',
  styleUrls: ['./characters.component.css']
})
export class CharactersComponent implements OnInit {
  characters: any = null;

  constructor(private rickAndMortyService: CharactersService) { }

  ngOnInit(): void {
    this.loadCharacters();
  }

  loadCharacters(): void {
    this.rickAndMortyService.returnValues().subscribe(
      result => {
        this.characters = result;
      },
      error => {
        console.log('Something went wrong', error);
      }
    );
  }
}
