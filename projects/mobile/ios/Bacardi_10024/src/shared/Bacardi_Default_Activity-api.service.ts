import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class Bacardi_Default_ActivityService {
    private baseUrl = "http://34.193.74.68/Bacardi_10024";
    constructor(private http : Http) {

    }

    createBacardi(Bacardi):Observable<any> {
        return this.http.post(`${this.baseUrl}/Bacardi_Default_Activity/create_Bacardi`,Bacardi)
                                .map((res:Response) => res.json())
                                .catch((error:any) => Observable.throw(error.json().error || 'Server error')); 
    }

}