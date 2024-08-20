import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServicesService {
  private api_url='http://localhost:8080/api';

  constructor(private http: HttpClient) { }

  getBooks(){
    return this.http.get(`${this.api_url}/books`);
  }
}
