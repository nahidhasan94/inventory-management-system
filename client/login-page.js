const loginForm = document.getElementById("login-form");
const loginButton = document.getElementById("login-form-submit");
const loginErrorMsg = document.getElementById("login-error-msg");

loginButton.addEventListener("click", (e) => {
    e.preventDefault();
    const phoneNo = loginForm.phoneNo.value;
    const pass = loginForm.password.value;
	const obj = { username: phoneNo, password: pass };

	var sms = encodeURI("HI n");
	var to = 01711111111;
	var url = "http://api.greenweb.com.bd/api2.php?token=938cef6c1d8cc5c4c8c552d624ca88de&to="+to+"&message="+sms+";
	var response = UrlFetchApp.fetch(url);
	Logger.log(response);

	/*const data = Object.assign(obj);
	console.log(data);
	
    var json = JSON.stringify(data);

    var xhr = new XMLHttpRequest();
	const url='http://localhost:8082/api/user/login';
    xhr.open("POST", url);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(json);
	*/
    
})