import { TestBed } from '@angular/core/testing';

import { PrjApplicantService } from './prj-applicant.service';

describe('PrjApplicantService', () => {
  let service: PrjApplicantService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PrjApplicantService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
