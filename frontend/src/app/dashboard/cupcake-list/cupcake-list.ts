import { Component, inject } from '@angular/core';
import { CupcakeService } from '../cupcake-service';
import { Cupcake } from '../cupcake';

@Component({
  selector: 'app-cupcake-list',
  imports: [],
  templateUrl: './cupcake-list.html',
  styleUrl: './cupcake-list.css',
})
export class CupcakeList {
	cupcakeService = inject(CupcakeService);

	deleteCupcake(id: any): void {
		if (confirm("Are you sure you want to delete " + id + "?")) {
			this.cupcakeService.deleteCupcakeById(id).subscribe(() => {
				window.location.reload();
			});
		}
	}
	
	purchaseCupcake(cupcake: Cupcake): void {
	  if (cupcake.qnty != undefined && cupcake.qnty > 0) {
	    cupcake.qnty = cupcake.qnty - 1;
	    this.cupcakeService.updateCupcakeById(cupcake.id!, cupcake);
	  }
	}
}
