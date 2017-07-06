import { Component, ViewChild } from '@angular/core';
import { Nav, Platform } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { HomePage, Screen_43850Page } from '../pages/pages';

@Component({
  templateUrl: 'app.html'
})
export class MyApp {
  @ViewChild(Nav) nav: Nav;
  rootPage: any = HomePage;
  activities: Array<{title: string, showSubMenu: boolean, pages: Array<{title: string, component: any}>}>;

  constructor(public platform: Platform, public statusBar: StatusBar, public splashScreen: SplashScreen) {
    this.initializeApp();
    this.activities = [
      {
        title: 'Bacardi_Default_Activity',
        showSubMenu : false,
        pages: [
          {
            title: 'Screen_43850',
            component: Screen_43850Page
          }
        ]
      }
    ];
  }

  initializeApp() {
    this.platform.ready().then(() => {
      // Okay, so the platform is ready and our plugins are available.
      // Here you can do any higher level native things you might need.
      this.statusBar.styleDefault();
      //this.splashScreen.hide();
    });
  }

  openSubmenu(act){
    act.showSubMenu = !act.showSubMenu;
  }

  openPage(page) {
    this.nav.push(page.component);
  }

}
