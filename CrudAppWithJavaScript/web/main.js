window.onload = function (){
    //adding event handler for buttons
    document.querySelector("#GetButton").addEventListener("click", getAllItems());
    document.querySelector("#DeleteButton").addEventListener("click", deleteItem());
    document.querySelector(".table").addEventListener("click", handleRowClick());
};

function initUpdatePanel(text){
    let cats = JSON.parse(text);
    let html = "";
    for(let i = 0; i < cats.length; i++){
        
        let id = cats[i].id;
        let desc = cats[i].description;
    }
    
}

function loadMenuItemCategory(){
    
    let url = "MenuCategoryService/categories";
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
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
        
        if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
            let resp = xmlhttp.responseText.trim();
            console.log(resp);
            if(resp.search("ERROR") >= 0 || resp !== "true"){
                alert("could not complete request");
                console.log(resp);
            }else{
                alert("delete request completed successfully");
                getAllItems();
            }
        }
    };
    xmlhttp.open("DELETE", url, true);
    xmlhttp.send();
}

function clearSelection(){
    
    let trs = document.querySelectorAll("tr");
    for(let i = 0; i < trs.length; i++){
        
        trs[i].classList.remove(".highlighted");
        
    }
    
}

function handleRowClick(e){
    clearSelection();
    //adding class and style to parent of clicked cell
    e.target.parentElement.classList.add(".highlighted");
    
    //enable update and delete button
    document.querySelector("#DeleteButton").removeAttribute("disabled");
    document.querySelector("#UpdateButton").removeAttribute("disabled");
    
}

function getAllItems(){
    let url = "MenuService/items";
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function (){
        if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
            let resp = xmlhttp.responseText;
            if(resp.search("ERROR") >= 0){
                alert("could not complete request");
            }else{
                buildTable(xmlhttp.responseText);
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
        html += "<td>" + temp.category + "</td>";
        html += "<td>" + temp.description + "</td>";
        html += "<td>" + temp.price + "</td>";
        html += "<td>" + temp.vegetarian + "</td>";
        html += "</tr>";
    };
    theTable.innerHTML = html;
}

