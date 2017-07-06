import { Component } from '@angular/core';
import { NavController, LoadingController,NavParams,AlertController } from 'ionic-angular';
import { Bacardi_Default_ActivityService } from '../../shared/shared';
@Component({
    templateUrl: 'screen_43850.page.html'
})
export class Screen_43850Page{
    Bacardi: any = {};

    constructor(private nav: NavController,public navParams: NavParams, private loadingController : LoadingController, public alertCtrl: AlertController, private bacardi_default_activityservice: Bacardi_Default_ActivityService) { }

    ionViewDidLoad() {
    }

    createBacardi() {
        let loader = this.loadingController.create({
          content: 'Getting data...'
        });
        loader.present().then(() => {
          this.bacardi_default_activityservice.createBacardi(this.Bacardi).subscribe(data => {
            console.log('data', data);
            loader.dismiss();
          },
          err => {
            console.log('error', err);
            loader.dismiss();
          });
        });
    }


}