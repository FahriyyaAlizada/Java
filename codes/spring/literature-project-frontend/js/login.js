const loginForm = document.querySelector('form');

loginForm.addEventListener('submit', (event) => {
    event.preventDefault();

    const request = {
        username: document.getElementById('username').value,
        password: document.getElementById('password').value
    }

    fetch('http://localhost:9085/auth/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(request)
    })

    .then(async response => {
        if (response.ok) {
            const token = await response.text();
            localStorage.setItem('token',token);
            alert("Login successfully");
            document.getElementById('username').value = "";
            document.getElementById('password').value = "";
        } else {
            let data = response.json();
            alert(data.message);
        }
    })

})