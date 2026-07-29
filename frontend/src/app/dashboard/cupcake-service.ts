import { Injectable, inject, signal } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Cupcake } from './cupcake';

const restUrl = 'api/v1/cupcakes';

@Injectable({
  providedIn: 'root',
})
export class CupcakeService {
	private http = inject(HttpClient);
			
			cupcake = signal<Cupcake[]>([]);
			
			constructor() {
				this.getCupcake();
			}
			
			getCupcake():void {
				this.http.get<Cupcake[]>(restUrl).subscribe(data => {
					this.cupcake.set(data);
				});
			}
			
			saveCupcake(data: Cupcake): void {
				this.http.post(restUrl, data).subscribe(saved => {
					this.cupcake.update(cupcake => [...cupcake, saved]);
				});
			}	

			deleteCupcakeById(id: number) {
				return this.http.delete(restUrl + "/" + id);
			}
			
			updateCupcakeById(id: number, data: Cupcake): void {
			  this.http.put<Cupcake>(restUrl + "/" + id, data).subscribe();
			}

}
