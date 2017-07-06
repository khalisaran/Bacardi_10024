import {Component, OnInit } from '@angular/core';

declare var jQuery:any;
declare var $:any;

@Component ({
    moduleId: module.id,
    templateUrl: 'home-de.component.html'
})
export class HomeDEComponent implements OnInit {

  ngOnInit() {
      $(function() {
        $(".rslides").responsiveSlides({
          auto: true,
							pager: true,
							nav: false,
							speed: 500,
              namespace: "callbacks"
        });
    });
  }
}
