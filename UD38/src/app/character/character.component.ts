import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CharactersService } from '../services/characters.service';

@Component({
  selector: 'app-character-details',
  templateUrl: './character.component.html',
  styleUrls: ['./character.component.css']
})
export class CharacterDetailsComponent implements OnInit {
  id: number = 0;
  character: any = null;

  constructor(
    private route: ActivatedRoute,
    private characterService: CharactersService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.id = params['id'];
      this.getCharacterById(this.id);
    });
  }

  getCharacterById(id: number): void {
    this.characterService.returnValuesById(id).subscribe(
      data => {
        this.character = data;
      },
      error => {
        console.log('Something went wrong', error);
      }
    );
  }

  goBack(): void {
    this.router.navigate(['/characters']);
  }
}
