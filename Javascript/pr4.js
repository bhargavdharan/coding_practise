// # prgm to check Area of triangle

/**
 * To find the area of right angled triangle
 * General formulae: (base * height) / 2;
 */

// for right angled triangle
var base = 25;
var height = 25;

var areaRT = (base * height) / 2;

console.log(`Area of right angled triangle is ${areaRT}`);

// for equilateral triangle

var side1 = 5;
var side2 = 6;
var side3 = 7;

var p = (side1 + side2 + side3) / 2;

var areaET = Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));

console.log(areaET);