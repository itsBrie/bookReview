import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { BooksComponent } from '../components/book_list/books.component';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,BooksComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'book-review-app';
}
