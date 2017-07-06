import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { SharedService } from '../shared/shared.service';
import { IBacardi } from './bacardi';

@Injectable()
export class BacardiService {
    constructor(private _http : Http, private shared_service: SharedService){}

    private handleError(error : Response) {
        console.error(error);
        return Observable.throw(error.json().error || 'Server error');
    }

    create_Bacardi(bacardi: IBacardi): Observable<IBacardi>{
        return this._http.post(`${this.shared_service.baseUrl}/Bacardi_Default_Activity/create_Bacardi`,bacardi)
            .map((response : Response) => <IBacardi> response.json())
            .do(data => console.log('All: ' + JSON.stringify(data)))
            .catch(this.handleError);
    }
    update_Bacardi(bacardi: IBacardi): Observable<IBacardi>{
        return this._http.put(`${this.shared_service.baseUrl}/Bacardi_Default_Activity/update_Bacardi`,bacardi)
            .map((response : Response) => <IBacardi> response.json())
            .do(data => console.log('All: ' + JSON.stringify(data)))
            .catch(this.handleError);
    }
    search_for_update_Bacardi(bacardi_id: number): Observable<IBacardi>{
        return this._http.get(`${this.shared_service.baseUrl}/Bacardi_Default_Activity/search_for_update_Bacardi/${bacardi_id}`)
            .map((response : Response) => <IBacardi> response.json())
            .do(data => console.log('All: ' + JSON.stringify(data)))
            .catch(this.handleError);
    }
    delete_Bacardi(bacardi: IBacardi): Observable<IBacardi>{
        return this._http.delete(`${this.shared_service.baseUrl}/Bacardi_Default_Activity/delete_Bacardi/${bacardi.id}`)
            .map((response : Response) => <IBacardi> response.json())
            .do(data => console.log('All: ' + JSON.stringify(data)))
            .catch(this.handleError);
    }
    get_all_Bacardi(): Observable<IBacardi[]>{
        return this._http.get(`${this.shared_service.baseUrl}/Bacardi_Default_Activity/get_all_Bacardi`)
            .map((response : Response) => <IBacardi[]> response.json())
            .do(data => console.log('All: ' + JSON.stringify(data)))
            .catch(this.handleError);
    }
}