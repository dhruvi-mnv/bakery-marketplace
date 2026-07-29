import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CupcakeAdd } from './cupcake-add';

describe('CupcakeAdd', () => {
  let component: CupcakeAdd;
  let fixture: ComponentFixture<CupcakeAdd>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CupcakeAdd],
    }).compileComponents();

    fixture = TestBed.createComponent(CupcakeAdd);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
