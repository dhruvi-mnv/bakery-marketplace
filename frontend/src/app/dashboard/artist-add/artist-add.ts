import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Artist } from '../artist';
import { ArtistService } from '../artist-service';

@Component({
  selector: 'app-artist-add',
  imports: [FormsModule],
  templateUrl: './artist-add.html',
  styleUrl: './artist-add.css',
})
export class ArtistAdd {
		artist: Artist = {
		id: 0,
		name: ''
		}; 
		
		artistService = inject(ArtistService);
		
		saveArtist():void{
			
			const data = {
			name: this.artist.name,
			};
			
			this.artistService.saveArtist(data);
			
			this.artist.name = "";

		}
}
