const token=localStorage.getItem("token");
 
 fetch("http://localhost:9085/movies/getAll",{
     method:'GET',
     headers:{
         "Authorization":`Bearer ${token}`
     }
 })
 .then(response => response.json())
 .then(result => {
     console.log(result);
     let movies =  result.movies;
     let carts=document.querySelector(".carts");
     movies.forEach(element => {
         let cart=document.createElement('div');
         cart.classList.add("cart");
 
        let title=document.createElement('h3');
        title.textContent=element.title;
 
        let genre=document.createElement("p");
        genre.textContent=element.genre;
 
        let rating=document.createElement("p");
 
         let stars='';
         for (let index = 0; index < element.rating; index++) {
             stars+='<i class="fa-solid fa-star"></i>';
         }
        rating.innerHTML=stars;
 
        cart.appendChild(title);
        cart.appendChild(genre);
        cart.appendChild(rating);
        carts.appendChild(cart);
     });
     
 })

fetch("http://localhost:9085/auth/profile",{
    method:'GET',
    headers:{
        "Authorization":`Bearer ${token}`
    }
})
.then(response => response.json())
.then(result => {
    console.log(result);
    let firstName =  result.firstName;
    let lastName = result.lastName;

    let name = document.getElementById("firstName");
    let surname = document.getElementById("lastName");

    name.textContent = firstName;
    surname.textContent = lastName;
})