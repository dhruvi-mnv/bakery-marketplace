import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CupcakeList } from './cupcake-list';

describe('CupcakeList', () => {
  let component: CupcakeList;
  let fixture: ComponentFixture<CupcakeList>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CupcakeList],
    }).compileComponents();

    fixture = TestBed.createComponent(CupcakeList);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
