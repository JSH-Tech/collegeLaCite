//Exemple sur un tableau


let data = [
    {
        "id": 1,
        "nom": "James",
        "prenom": "Kerry",
        "age": 25,
        "matieres": [
            { "id": 1, "nom": "Physique", "moyenne": 75, "profId": 1 },
            { "id": 2, "nom": "Chimie", "moyenne": 89, "profId": 1 }
        ],

    },
    {
        "id": 2,
        "nom": "Roland",
        "prenom": "Serio",
        "age": 25,
        "matieres": [
            { "id": 3, "nom": "Biologie", "moyenne": 85, "profId": 2 },
            { "id": 4, "nom": "Allemand", "moyenne": 79, "profId": 2 }
        ],

    },
    {
        "id": 3,
        "nom": "Marko",
        "prenom": "Abdel",
        "age": 25,
        "matieres": [
            { "id": 5, "nom": "Anglais", "moyenne": 65, "profId": 3 },
            { "id": 6, "nom": "Francais", "moyenne": 59, "profId": 3 }
        ],

    },
    {
        "id": 1,
        "nom": "James",
        "prenom": "Kerry",
        "age": 25,
        "matieres": [
            { "id": 1, "nom": "Physique", "moyenne": 75, "profId": 1 },
            { "id": 2, "nom": "Chimie", "moyenne": 89, "profId": 1 }
        ],

    },
]



const profObjet = {
    "id": 2,
    "nom": "Roland",
    "prenom": "Serio",
    "age": 25,
    "matieres": [
        { "id": 3, "nom": "Biologie", "moyenne": 85, "profId": 2 },
        { "id": 4, "nom": "Allemand", "moyenne": 79, "profId": 2 }
    ],

}

// 1- Une fonction qui supprime un element du tableau

const supprimerElement = (tab, elem) => {
   const resultat=tab.filter(elementCourant=>elementCourant.id!==elem.id)
   return resultat
}

// Utiliser la fonction
const newTab=supprimerElement(data,data[0])
console.log("resultat ",newTab)

//const tabModifie = supprimerElement()

//const tabModifie2 = supprimerElement()

//Test


// Ajouter un champ nom_complet a tous les profs



// Trouver le prof qui enseigne la physique

const trouverProf = (tab, nomMatiere) => {
    
}


// Milieu du tableau

const milieuTableau = tab => {
   
}



// Trouver la clef a partir de la valeur (objet)


const clefValeur = (objet, valeur) => {
  
}



