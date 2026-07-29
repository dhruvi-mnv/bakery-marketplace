import { Component, signal } from '@angular/core';
import { Dashboard } from './dashboard/dashboard';
//import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [Dashboard],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  //protected readonly title = signal('webapp');
}
