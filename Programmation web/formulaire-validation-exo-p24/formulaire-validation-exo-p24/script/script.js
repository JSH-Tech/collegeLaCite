document.addEventListener("DOMContentLoaded",()=>{
    //recuperation du formulaire
    const formulaire=document.forms.form_ship
    //recuperation des element du formulaire
    const {speed, fname, identity, postcode}=formulaire
    console.log(speed, fname, identity, postcode)

    const champs={speed, fname, identity, postcode}
    
    const valeurs={speed:speed.value, fname:fname.value, identity:identity.value,postcode:postcode.value}

    console.log(valeurs)

    const erreurs={speed:"", fname:"", identity:"", postcode:""}

    //validation
    //regex
    const nameRegex=/^[a-zA-Z]{2,}$/
    const postRegex=/^[AA-Za-z]\d[A-Za-z][ -]?\d[A-Za-z]\d$/ //Code postal regex
    const identityRegex=/^\d(6)$/ //regex Longueur exactement 6 caracteres

    //Fonction de validation
    function validerChamps(champ) {
        //Recuperation des champs (cle -> valeur)
        const {name, value}=champ

        switch (name) {
            case "speed":
                if (value==0) {
                    erreurs.speed="Choisir un mode de livraison valide"
                    return false
                }else{
                    erreurs.speed=""
                    return true
                }
                break;
            case "fname":
                if (!nameRegex.test(value)) {
                    erreurs.fname="Le nom doit contenir uniquement des lettres et minimum 2"
                    return false
                } else {
                    erreurs.fname=""
                    return true
                }
            case "identity":
                if (!identityRegex.test(value)) {
                    erreurs.identity="L'Id doit avoir exactement 6 chiffres"
                    return false
                } else {
                    erreurs.identity=""
                    return true
                }
            case "postcode":
                if (!postRegex.test(value)) {
                    erreurs.postcode="Saisir un code postal du Canada"
                    return false
                } else {
                    erreurs.postcode=""
                    return true
                }
            default:
                break;
        }
    }

    //Soumission du formulaire apres validation
    formulaire.addEventListener("submit",(evt)=>{

        evt.preventDefault()

        //validation des donnees
        for ( key in champs) {
        
            let isValide=validerChamps(champs[key])

            if (!isValide) {
                champs[key].nextElementSibling.innerHTML=erreurs[key]
                champs[key].nextElementSibling.style.color="red"
                
            }
            if(isValide){
                const afficher =document.getElementById("thanks_msg")
                afficher.style.display="block"
                document.querySelector("#thanksCustomer").innerHTML=valeurs.fname
            }
        }

        for ( key in champs) {
            champs[key].addEventListener("input",()=>{
                const {name,value}=champs[key]
                valeurs[name]=value
                
                let isValide=validerChamps(champs[key])

                if (!isValide) {
                    champs[key].nextElementSibling.innerHTML=erreurs[key]
                    champs[key].nextElementSibling.style.color="red"
                    
                }
                if(isValide){
                    const afficher =document.getElementById("thanks_msg")
                    afficher.style.display="block"
                    document.querySelector("#thanksCustomer").innerHTML=valeurs.fname
                }else{
                    
                }

            })
        
            
        }

        
        
    })
})