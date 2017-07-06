import { Component, OnInit, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { ModalComponent } from 'ng2-bs3-modal/ng2-bs3-modal';
import { BacardiService } from './bacardi.service';
import { IBacardi } from './bacardi';

@Component({
    moduleId: module.id,
    templateUrl: 'screen_43900eng.component.html'
})
export class Screen_43900engComponent implements OnInit {
  private bacardi: IBacardi = {
  	id: 0,
  	price: 0,	quantity: 0
  }
  ;

  constructor(private router: Router, private bacardiservice: BacardiService) { 
  }

  ngOnInit() {
  }



}