import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Cupcake } from '../cupcake';
import { CupcakeService } from '../cupcake-service';
import { ArtistService } from '../artist-service';

@Component({
  selector: 'app-cupcake-add',
  imports: [FormsModule, CommonModule],
  templateUrl: './cupcake-add.html',
  styleUrl: './cupcake-add.css',
})
export class CupcakeAdd {
		cupcake: Cupcake = {
		id: 0,
		name: '',
		price: 0,
		qnty: 0,
		empName: ''
		}; 
		
		cupcakeService = inject(CupcakeService);
		artistService = inject(ArtistService);
		
		saveCupcake():void{
			
			const data = {
			  name: this.cupcake.name,
			  price: this.cupcake.price,
			  qnty: this.cupcake.qnty,
			  empName: this.cupcake.empName
			};
			
			this.cupcakeService.saveCupcake(data);		
			
			this.cupcake.name = '';
			this.cupcake.price = 0;
			this.cupcake.qnty = 0;
			this.cupcake.empName = '';

		}
}
