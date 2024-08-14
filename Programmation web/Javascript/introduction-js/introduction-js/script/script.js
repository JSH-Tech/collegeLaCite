
console.log("Bonjour a tous")

//alert
alert("Bonjour encore")

//prompt
const nom=prompt("Donner votre nom")
//confirm
const confirmation=confirm("Etes vous sur que c'est votre nom?")
    alert("La reponse est: "+confirmation)

if (confirmation) {

    alert("Bienvenue: "+nom)
} else {
    alert("Il y a un probleme")
}

/*Le hissage*/
const test="Bonjour";
console.log("Voici la variable: "+test);
