"use strict";
//Basic Helloworld Program
console.log("Hello World");
//Variables Types and Usage
var x = "I am Chandini";
var y = 2;
console.log("" + x + y);
//loops and arrays
var myarray = ["Chandini", "Ganesan"];
for (var i = 0; i < myarray.length; i++)
    console.log(myarray[i]);
//arrays are always growable
myarray.push("Mallika");
for (var _i = 0, myarray_1 = myarray; _i < myarray_1.length; _i++) {
    var i = myarray_1[_i];
    console.log(i);
}
