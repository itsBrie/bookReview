import { Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { ServicesService } from '../../app/services/services.service';
@Component({
  selector: 'app-books',
  standalone: true,
  imports: [HttpClientModule],
  templateUrl: './books.component.html',
  styleUrl: './books.component.css'
})
export class BooksComponent {


  constructor(private myService: ServicesService){}


  ngOnInit():void{
this.myService.getBooks().subscribe((e:any)=>{console.log(e);});
  }
}
