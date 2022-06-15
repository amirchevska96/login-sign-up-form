console.log(axios);

getAllLogins = () => {
  const URL = "https://localhost:8443/v1/logins";
  axios.get(URL).then((response) => {
    console.log(response);
    let tRow = ``;
    for (const iterator of response.data) {
      tRow += `<table><tr><td>${iterator.id}</td><td>${iterator.userName}</td></tr></table>`;
    }
    document.getElementById("outputLogins").innerHTML = tRow;
  }),
    (error) => {
      console.log(error);
    };
};
getLoginById = () => {
  let id = document.getElementById("getLoginById").value;
  const URL = "https://localhost:8443/v1/logins/";

  axios.get(URL + id).then((response) => {
    console.log(response.data.userName);
    let tRow = `${response.data.id}&nbsp${response.data.userName}`;
    document.getElementById("outputLogin").innerHTML = tRow;
  }),
    (error) => {
      console.log(error);
    };
};
deleteLoginById = () => {
  let id = document.getElementById("getLoginById").value;
  const URL = "https://localhost:8443/v1/logins/";
  axios.delete(URL + id).then((response) => {
    console.log(response);
  }),
    (error) => {
      console.log(error);
    };
};
addLogin = () => {
  const URL = "https://localhost:8443/v1/logins";
  axios
    .post(URL, {
      userName: document.getElementById("username_id").value,
      password: document.getElementById("password_id").value,
    })
    .then(
      (response) => {
        console.log(response);
      },
      (error) => {
        console.log(error);
      }
    );
};
