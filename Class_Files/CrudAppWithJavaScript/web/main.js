let addOrUpdate;

window.onload = function (){
    //adding event handler for buttons
    document.querySelector("#GetButton").addEventListener("click", getAllItems);
    document.querySelector("#DeleteButton").addEventListener("click", deleteItem);
    document.querySelector("#DoneButton").addEventListener("click", processForm);
    document.querySelector("#AddButton").addEventListener("click", addItem);
    document.querySelector("#UpdateButton").addEventListener("click", updateItem);
    document.querySelector("#CancelButton").addEventListener("click", CancelAddUpdate);
    
    
    document.querySelector("table").addEventListener("click", handleRowClick);
    
    hideUpdatePanel();
    loadMenuItemCategories();
};

function resetUpdatePanel() {
    document.querySelector("#itemIDInput").value = "";
    document.querySelectorAll("option")[0].selected = true;
    document.querySelector("#descriptionInput").value = "";
    document.querySelector("#priceInput").value = "";
    document.querySelector("#vegetarianInput").checked = false;
      
}
function CancelAddUpdate(){
    hideUpdatePanel();
}

function showUpdatePanel(){
    //document.getElementById("AddUpdatePanel").classList.remove("hidden");
    document.querySelector("#AddUpdatePanel").classList.remove("hidden");
    
}
function hideUpdatePanel(){
    document.querySelector("#AddUpdatePanel").classList.add("hidden");
    
}
function addItem(){
    addOrUpdate = "add";
    resetUpdatePanel();
    showUpdatePanel();
}

function updateItem(){
    addOrUpdate = "update";
    
    resetUpdatePanel();
    poplateUpdatePanelWithSelectedItem();
    showUpdatePanel();
}

function poplateUpdatePanelWithSelectedItem(){
    let tds = document.querySelector(".highlighted").querySelectorAll("td");
    document.querySelector("#itemIDInput").value = tds[0].innerHTML;
    let options = document.querySelectorAll("option");
    for(let i =0; i < options.length; i++){
        options[i].selected = options[i].value === tds[1].innerHTML;
        
    }
    document.querySelector("#descriptionInput").value = tds[2].innerHTML;
    document.querySelector("#priceInput").value = +tds[3].innerHTML;
    document.querySelector("#vegetarianInput").checked = "true" === tds[4].innerHTML;
    
    
}
function processForm(){
    let itemID = document.querySelector("#itemIDInput").value;
    
    let itemCategoryID = document.querySelector("#categorySelect").value;
    
    let description = document.querySelector("#descriptionInput").value;
    
    let price = document.querySelector("#priceInput").value;
    
    let vegetarian = document.querySelector("#vegetarianInput").checked;
    
    let obj = {
        "id" : itemID,
        "category" : itemCategoryID,
        "description" : description,
        "price" : price,
        "vegetarian" : vegetarian
    };
    
    let url = "MenuService/items/" + itemID;
    let method = (addOrUpdate === "add") ? "POST" : "PUT";
    xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
            let resp = xmlhttp.responseText.trim();
            if(resp.search("ERROR") >= 0 || resp !== "true"){
                alert("could not complete request");
            }else{
                alert("request completed successfully");
            getAllItems();
        }
        
        }
    };
    xmlhttp.open(method, url, true);
    xmlhttp.send(JSON.stringify(obj));
}

function initUpdatePanel(text) {
    let cats = JSON.parse(text);
    let html = "";
    for(let i = 0; i< cats.length; i++){
        let id = cats[i].id;
        let desc = cats[i].description;
        
        html += "<option value='" + id + "'> " + desc + "</option>";
    }
    document.querySelector("#categorySelect").innerHTML = html;
    resetUpdatePanel();
}


function loadMenuItemCategories(){
    let url = "MenuCategoryService/categories";
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function (){
        if(xmlhttp.readyState ===4 && xmlhttp.status ===200){
            let resp = xmlhttp.responseText;
            
            if(resp.search("ERROR") >= 0){
                alert("could not perform operation");
                console.log(resp);
            }else{
                initUpdatePanel(resp);
            }
        }
    };
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}

function deleteItem(){
    let id = document.querySelector(".highlighted").querySelector("td").innerHTML;
    
    let url = "MenuService/items/" + id;
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function(){
       if(xmlhttp.readyState ===4 && xmlhttp.status ===200){
           let resp = xmlhttp.responseText.trim();
           if(resp.search("ERROR") >= 0 || resp !== "true") {
                alert("could not complete request");
               
            }else{
                alert("delete request completed successfully");
                getAllItems();
            
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
    //adding class and style to parent of clicked cell
    e.target.parentElement.classList.add("highlighted");
    
    //enable update and delete button
    document.querySelector("#DeleteButton").removeAttribute("disabled");
    document.querySelector("#UpdateButton").removeAttribute("disabled");
}

function getAllItems(){
    let url = "MenuService/items";
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function (){
        if (xmlhttp.readyState ===4 && xmlhttp.status ===200) {
            let resp = xmlhttp.responseText;
            console.log(resp);
            if(resp.search("ERROR") >= 0) {
                alert("could not complete request");
                console.log(resp);
            }else{
                debugger;
                buildTable(xmlhttp.responseText);
                clearSelection();
                resetUpdatePanel();
                hideUpdatePanel();
            
            }
          
        }
       
    };
    xmlhttp.open("GET", url, true); // HTTP verb says what action to take; URL says which item(s) to act upon
    xmlhttp.send();
    
    
}

function buildTable(text){
    let data = JSON.parse(text);
    console.log(data);
    debugger;
    let theTable = document.querySelector("table");
    let html = theTable.querySelector("tr").innerHTML;
    for(let i = 0; i < data.length; i++){
        let temp = data[i];
        
        html += "<tr>";
        html += "<td>" + temp.id + "</td>";
        html += "<td>" + temp.category + "</td>";
        html += "<td>" + temp.description + "</td>";
        html += "<td>" + temp.price + "</td>";
        html += "<td>" + temp.vegetarian + "</td>";
        html += "</tr>";
    }
    theTable.innerHTML = html;
}

//function updateProcess(){
//    let itemID = document.querySelector("#itemIDInput").value;
//    
//    let itemCategoryID = document.querySelector("#categorySelect").value;
//    
//    let description = document.querySelector("#descriptionInput").value;
//    
//    let price = document.querySelector("#priceInput").value;
//    
//    let vegetarian = document.querySelector("#vegetarianInput").checked;
//    
//    let obj = {
//        "id" : itemID,
//        "category" : itemCategoryID,
//        "description" : description,
//        "price" : price,
//        "vegetarian" : vegetarian
//    };
//    
//    let url = "MenuService/items/" + itemID;
//    
//    xmlhttp = new XMLHttpRequest();
//    xmlhttp.onreadystatechange = function(){
//        if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
//            let resp = xmlhttp.responseText.trim();
//            if(resp.search("ERROR") >= 0 || resp !== "true"){
//                alert("could not complete request");
//            }else{
//                alert("request completed successfully");
//            getAllItems();
//        }
//        
//        }
//    };
//    xmlhttp.open("PUT", url, true);
//    xmlhttp.send(JSON.stringify(obj));
//}
