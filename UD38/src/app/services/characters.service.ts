import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CharactersService {

  constructor(private http: HttpClient) { }

  returnValues() {
    return this.http.get("https://rickandmortyapi.com/api/character");
  }

  returnValuesById(id: number) {
    return this.http.get("https://rickandmortyapi.com/api/character/" + id);
  }
}
