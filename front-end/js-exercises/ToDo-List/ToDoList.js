
var createNewTaskElement=function(taskString){

    var taskInput=document.getElementById("new-task");
    var addButton=document.getElementsByTagName("button")[0];
    var completedTasksHolder=document.getElementById("completed-tasks");



    var listItem=document.createElement("li");

    var checkBox=document.createElement("input");
    var label=document.createElement("label");
    var editInput=document.createElement("input");
    var editButton=document.createElement("button");
    var deleteButton=document.createElement("button");

    label.innerText=taskString;

    checkBox.type="checkbox";
    editInput.type="text";

    editButton.innerText="Edit";
    editButton.className="edit";
    deleteButton.innerText="Delete";
    deleteButton.className="delete";

    listItem.appendChild(checkBox);
    listItem.appendChild(label);
    listItem.appendChild(editInput);
    listItem.appendChild(editButton);
    listItem.appendChild(deleteButton);
    return listItem;
}



var deleteTask=function(){
    console.log("Delete Task...");

    var listItem=this.parentNode;
    var ul=listItem.parentNode;
    ul.removeChild(listItem);

}

var taskCompleted=function(){
    console.log("Complete Task...");

    var listItem=this.parentNode;
    completedTasksHolder.appendChild(listItem);
    bindTaskEvents(listItem, taskIncomplete);

}
