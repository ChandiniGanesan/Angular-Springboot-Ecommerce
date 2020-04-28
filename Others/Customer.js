"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Customer = /** @class */ (function () {
    //Parameter Properties
    function Customer(_id, _name) {
        this._id = _id;
        this._name = _name;
    }
    Object.defineProperty(Customer.prototype, "id", {
        //Accessors
        get: function () { return this._id; },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "name", {
        get: function () { return this._name; },
        enumerable: true,
        configurable: true
    });
    return Customer;
}());
exports.Customer = Customer;
