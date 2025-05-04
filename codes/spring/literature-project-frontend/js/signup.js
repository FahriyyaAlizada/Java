const registrationForm = document.querySelector('form');
registrationForm.addEventListener('submit', (event) =>{
    event.preventDefault();

    const user = {
        firstName: document.getElementById('firstName').value,
        lastName: document.getElementById('lastName').value,
        username: document.getElementById('username').value,
        email: document.getElementById('email').value,
        password: document.getElementById('password').value
    }

    fetch('http://localhost:9085/auth/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    })

    .then(async response => {
        if (response.ok) {
            const message = await response.text();
            alert(message);
            window.location.href="login.html";
            document.getElementById('firstName').value = "";
            document.getElementById('lastName').value = "";
            document.getElementById('username').value = "";
            document.getElementById('email').value = "";
            document.getElementById('password').value = "";
        } else {
            const data = await response.json();
            alert(data.message);
        }
    })
})