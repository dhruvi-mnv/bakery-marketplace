import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArtistAdd } from './artist-add';

describe('ArtistAdd', () => {
  let component: ArtistAdd;
  let fixture: ComponentFixture<ArtistAdd>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ArtistAdd],
    }).compileComponents();

    fixture = TestBed.createComponent(ArtistAdd);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
