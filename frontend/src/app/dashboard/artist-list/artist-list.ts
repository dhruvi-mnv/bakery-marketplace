import { Component, inject } from '@angular/core';
import { ArtistService } from '../artist-service';

@Component({
  selector: 'app-artist-list',
  imports: [],
  templateUrl: './artist-list.html',
  styleUrl: './artist-list.css',
})
export class ArtistList {
	//connect to artist-service
	artistService = inject(ArtistService);
}
