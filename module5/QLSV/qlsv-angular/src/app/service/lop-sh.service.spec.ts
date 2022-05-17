import { TestBed } from '@angular/core/testing';

import { LopShService } from './lop-sh.service';

describe('LopShService', () => {
  let service: LopShService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LopShService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
