var element;

document.getElementById("header").innerHTML="<h1> simplilearn</h1>"

document.getElementById("header").attributes[1].value="mno";

document.getElementById("header").removeAttribute("class");


element=document.getElementById("header").getAttribute("class");

console.log(element);