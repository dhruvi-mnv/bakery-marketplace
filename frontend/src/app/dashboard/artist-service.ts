import { Injectable, inject, signal } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Artist } from './artist';

const restUrl = 'api/v1/artists';

@Injectable({
  providedIn: 'root',
})
export class ArtistService {
	private http = inject(HttpClient);
		
		artists = signal<Artist[]>([]);
			
			constructor() {
				this.getArtists();
			}
			
			getArtists():void {
				this.http.get<Artist[]>(restUrl).subscribe(data => {
					this.artists.set(data);
				});
			}
			
			saveArtist(data: Artist): void {
				this.http.post(restUrl, data).subscribe(saved => {
					this.artists.update(artists => [...artists, saved]);
				});
			}	
}
