// const parent = document.getElementById("parent-id");
// const grandparent = document.querySelector("#grandparent-id");
// const parent = document.querySelector(".parent");

// const parents = document.getElementsByClassName("parent");
const p = document.getElementsByTagName("p");
// const parents = document.querySelectorAll(".parent");
// const parent = document.querySelector(".parent");
// const children = grandparent.querySelectorAll(".child");


for(i = 0; i<p.length; i++){
    changeEleColor(p[i])
}


// SELECT CHILDRENS
// const parents = grandparent.children;
// const parentOne = parents[0];
// const children = parentOne.children;




// SELECT SLIBLINGS
// const childOne = grandparent.querySelector(".child");
// const childTwo = childOne.nextElementSibling;


// SELECT PARENTS
// const childOne = document.querySelector("#child-one");
// const parent = childOne.parentElement;
// const grandparent = parent.parentElement;


// changeColor(parent);
// changeColor(parent);
// changeColor(childOne);
// changeColor(childTwo);
// changeColor(childTwo.previousElementSibling);


// children.forEach(changeColor);

// for(i = 0; i < parents.length; i++){
//     changeColor(parents[i]);
// }

// function changeColor(ele) {
//     ele.style.backgroundColor = "#fff";
// }

function changeEleColor(ele){
    ele.style.color = "blue";
}