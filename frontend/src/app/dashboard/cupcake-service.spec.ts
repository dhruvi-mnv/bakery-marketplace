import { TestBed } from '@angular/core/testing';

import { CupcakeService } from './cupcake-service';

describe('CupcakeService', () => {
  let service: CupcakeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CupcakeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
