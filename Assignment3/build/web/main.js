let addOrUpdate;

window.onload = function (){

    document.querySelector("#GetButton").addEventListener("click", getAllCustomers);
    document.querySelector("#DeleteButton").addEventListener("click", deleteCustomer);
    document.querySelector("#DoneButton").addEventListener("click", processForm);
    document.querySelector("#AddButton").addEventListener("click", addCustomer);
    document.querySelector("#UpdateButton").addEventListener("click", updateCustomer);
    document.querySelector("#CancelButton").addEventListener("click", CancelAddUpdate);
    
    
    document.querySelector("table").addEventListener("click", handleRowClick);
    
    hideUpdatePanel();
};

function resetUpdatePanel() {
    document.querySelector("#idInput").value = "";
    document.querySelector("#customerNameInput").value = "";
    document.querySelector("#genderInput").value = "";
    document.querySelector("#ageInput").value = "";
}

function CancelAddUpdate(){
    hideUpdatePanel();
}

function showUpdatePanel(){
    document.querySelector("#AddUpdatePanel").classList.remove("hidden");
}

function hideUpdatePanel(){
    document.querySelector("#AddUpdatePanel").classList.add("hidden");   
}

function addCustomer(){
    addOrUpdate = "add";
    resetUpdatePanel();
    showUpdatePanel();
    
}

function updateCustomer(){
    addOrUpdate = "update";
    resetUpdatePanel();
    poplateUpdatePanelWithSelectedItem();
    showUpdatePanel();
}

function poplateUpdatePanelWithSelectedItem(){
    let tds = document.querySelector(".highlighted").querySelectorAll("td");
    document.querySelector("#idInput").value = tds[0].innerHTML;
    document.querySelector("#customerNameInput").value = tds[1].innerHTML;
    document.querySelector("#genderInput").value = +tds[2].innerHTML;
    document.querySelector("#ageInput").value = +tds[2].innerHTML;
}

function processForm(){
    let id = document.querySelector("#idInput").value;
    
    let name = document.querySelector("#customerNameInput").value;
    
    let gender = document.querySelector("#genderInput").value;
    
    let age = document.querySelector("#ageInput").value;
        
    let obj = {
        "id" : id,
        "name" : name,
        "gender" : gender,
        "age" : age
    };
    
    let url = "CustomerService/customers/" + id;
    let method = (addOrUpdate === "add") ? "POST" : "PUT";
    xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
            let resp = xmlhttp.responseText.trim();
            if(resp.search("ERROR") >= 0 || resp !== "true"){
                alert("could not complete request");
            }else{
                alert("request completed successfully");
                getAllCustomers();
                resetUpdatePanel();
            }
        }
    };
    xmlhttp.open(method, url, true);
    xmlhttp.send(JSON.stringify(obj));
}

function deleteCustomer(){
    let id = document.querySelector(".highlighted").querySelector("td").innerHTML;
    
    let url = "CustomerService/customers/" + id;
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function(){
       if(xmlhttp.readyState ===4 && xmlhttp.status ===200){
           let resp = xmlhttp.responseText.trim();
           if(resp.search("ERROR") >= 0 || resp !== "true") {
                alert("could not complete request");
            }else{
                alert("delete request completed successfully");
                getAllCustomers();
            
            }
       }
        
    };
    xmlhttp.open("DELETE", url, true );
    xmlhttp.send();
}

function clearSelection(){
    let trs = document.querySelectorAll("tr");
    for(let i = 0; i < trs.length; i++){
        trs[i].classList.remove("highlighted");
    }
}

function handleRowClick(e){
    clearSelection();
    e.target.parentElement.classList.add("highlighted");    
    //enable update and delete button
    document.querySelector("#DeleteButton").removeAttribute("disabled");
    document.querySelector("#UpdateButton").removeAttribute("disabled");
}

function getAllCustomers(){
    let url = "CustomerService/customers/";
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function (){
        if (xmlhttp.readyState ===4 && xmlhttp.status ===200) {
            let resp = xmlhttp.responseText;
            if(resp.search("ERROR") >= 0) {
                alert("could not complete request");
                console.log(resp);
            }else{
                buildTable(xmlhttp.responseText);
                clearSelection();
                resetUpdatePanel();
                hideUpdatePanel();
                
            }
        }
    };
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}

function buildTable(text){
    let data = JSON.parse(text);
    console.log(data);
    let theTable = document.querySelector("table");
    let html = theTable.querySelector("tr").innerHTML;
    for(let i = 0; i < data.length; i++){
        let temp = data[i];
        html += "<tr>";
        html += "<td>" + temp.id + "</td>";
        html += "<td>" + temp.name + "</td>";
        html += "<td>" + temp.gender + "</td>";
        html += "<td>" + temp.age + "</td>";
        html += "</tr>";
    }
    theTable.innerHTML = html;
}