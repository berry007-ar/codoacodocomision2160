alert ('soy una ventana emergente');
console.log ('Hola soy mensaje de consola');

/*Variable*/
var nombre_variable
let otra_variable= "Hola"
const PI = 3.1416
let hayClases= true
let terminoLaClase = true

/*TIPO*/
console.log(PI*2)

/* Condicionales*/
hayClases=false
if(hayClases == true && terminoLaClase != true){
    console.log('nos conectamos a clase')
} else{
    console.log ('salimos')
}

if(hayClases == false || terminoLaClase == true) {
    console.log ('salimos')

}  

let elemento = document.getElementById("principal");
/*console.log(elemento)*/
elemento.innerHTML = "miValor para innerhtml"
elemento.innerHTML += "<p>" +otra_variable+ "</p>"
document.write ("zapallito") ;
 