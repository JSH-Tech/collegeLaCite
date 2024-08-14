document.addEventListener("DOMContentLoaded",()=>{
    // Tout mon code de javascript va ici

    // Recuperer le h1 de notre page
        // Premiere methode
        const h1=document.getElementsByTagName("h1")[0]
        console.log(h1);
        h1.style.fontSize="3em"
        h1.style.color="green"
        h1.style.textAlign="center"

        h1.addEventListener("mouseenter",()=>h1.classList.add("notre_calss"))
        h1.addEventListener("mouseleave",()=>h1.classList.remove("notre_calss"))
        // Jeu de changement dimage afficher
        const imageDeRef=document.querySelector("#mainImg")
        const imageDeRefCopy=imageDeRef.src

        const image1=document.querySelector("#pic1")
        
        image1.addEventListener("mouseenter",()=>{
            imageDeRef.src=image1.src
        })

        image1.addEventListener("mouseleave",()=>{
            imageDeRef.src=imageDeRefCopy
        })

    // Recuperation de toute les images
    const images=document.querySelectorAll("#gallery img")
    images.forEach(imageCourante=>{
         
        imageCourante.addEventListener("mouseenter",()=>{
            imageDeRef.src=imageCourante.src
        })

        imageCourante.addEventListener("mouseleave",()=>{
            imageDeRef.src=imageDeRefCopy
        })
    })

    // creation d'un nouveau element

    const p=document.createElement("p")
    const span=document.createElement("span")
    span.innerHTML=("Cliquer pour voir")
    //Ajouter le span dans p
    p.appendChild(span)
    p.innerHTML+=" Ceci est un texte"
    document.querySelector("#main").appendChild(p)
})