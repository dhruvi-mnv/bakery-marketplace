import { Routes } from '@angular/router';
import { Home } from './dashboard/home/home';
import { ArtistAdd } from './dashboard/artist-add/artist-add';
import { ArtistList } from './dashboard/artist-list/artist-list';
import { CupcakeAdd } from './dashboard/cupcake-add/cupcake-add';
import { CupcakeList } from './dashboard/cupcake-list/cupcake-list';

export const routes: Routes = [
	{path: '', component: Home}, 
	{path: 'addArtist', component:ArtistAdd},
	{path: 'viewArtist', component:ArtistList},
	{path: 'addCupcake', component:CupcakeAdd},
	{path: 'viewCupcake', component:CupcakeList}
];
