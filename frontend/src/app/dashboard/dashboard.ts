import { Component } from '@angular/core';
import { ArtistAdd } from './artist-add/artist-add';
import { ArtistList } from './artist-list/artist-list';
import { CupcakeAdd } from './cupcake-add/cupcake-add';
import { CupcakeList } from './cupcake-list/cupcake-list';
import { RouterLink, RouterOutlet, Routes } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  imports: [ArtistAdd, ArtistList, CupcakeAdd, CupcakeList, RouterLink, RouterOutlet],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.css',
})
export class Dashboard {}
