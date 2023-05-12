import http from "./http.js";
import references from "./references.js";
// import utility from "./utility.js";


export const displayAllEmployee = async ()=>{

    const getAllEmployee = await http.get("getAll");
    console.log(getAllEmployee);


     getAllEmployee.forEach((employee)=>{
        let newRow = document.createElement("tr");
        const {employeeId,employeeName,employeeDateOfBirth} = employee;
        console.log(Object.values(employee));
    //     Object.values(employee).forEach((value)=>{
    //         let cell = document.createElement("td");
    //         cell.innerText = value;
    //         newRow.appendChild(cell);
            
    //     })
    //   console.log(newRow)
    //     references.tableData.appendChild(newRow);
        // references.tableData.innerHTML=`<tr><td>Update</td></tr>`

        newRow.innerHTML = `<td>${employeeId}</td>
        <td>${employeeName}</td><td>${employeeDateOfBirth}</td><td><button>Update</button><button>Delete</button></td>`
        references.tableData.appendChild(newRow);
     })
}
