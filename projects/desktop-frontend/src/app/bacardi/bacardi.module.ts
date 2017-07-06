import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { Ng2Bs3ModalModule } from 'ng2-bs3-modal/ng2-bs3-modal';
import { Screen_43900engComponent } from './screen_43900eng.component';
import { BacardiService } from './bacardi.service';

@NgModule({
    declarations: [
        Screen_43900engComponent
    ],
    imports: [
        RouterModule.forChild([
            { path: 'Screen_43900eng', component: Screen_43900engComponent}
        ]),
        Ng2Bs3ModalModule
    ],
    providers:[
        BacardiService
    ]
})

export class BacardiModule {

}