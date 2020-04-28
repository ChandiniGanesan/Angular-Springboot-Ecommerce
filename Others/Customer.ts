export class Customer{
    //Parameter Properties
    constructor(private _id:number,private _name:string)
    {}

    //Accessors
    get id():number
    { return this._id;}
    get name():string
    {return this._name;}
}