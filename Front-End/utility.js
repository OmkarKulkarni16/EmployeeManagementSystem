

// HTMLElement.prototype.onClick = function(cb) {
//    this.addEventListener("click", cb);
// }
// HTMLElement.prototype.onSubmit = function(cb) {
//    this.addEventListener("submit", cb);
// }

//  const getFormData = (formElement)=> {
//    const formData = new FormData(formElement)

//    console.log(formData)

//    const data = {};
   
//     for(let [key,value] of formData.entries()){
//        data[key] = value;
//     }
//     return data;
// }

// const displayMessage = (message,type) => {
//    const div = document.createElement('div')
//    div.classList.add('message')
//    div.classList.add(type)
//    div.innerHTML = `<p>${message}</p>`
//    document.body.appendChild(div)

//    setTimeout(()=> {
//        div.remove();
//    }, 2000)
// }

// let store = {
//    token: ""
// };

// const modifyStore = (key, payload) => {
//    store = { ...store, [key]: payload };

//    return store;
// }

// const getStore = (key) => {
//    return store[key];
// }

// const navigateTo = ((initialPage) => {
//    let page = initialPage.split("/")[1];

//    return (to) => {

//        to = to.split("/")[1];

//        const currentPage = document.getElementById(`${page}`);

//        currentPage.classList.add('hide');

//        const nextPage = document.getElementById(`${to}`);

//        nextPage.classList.remove('hide')

//        history.pushState({}, "", `/${to}`);
//    } 
// })("/home-page");

// navigateTo("/home-page");

// const ROLE_PAGE_MAP = {
//    "0a85908d-6574-441f-8a88-a7d7ef4aa947":'/admin-page',
//     "a1fb54a0-659c-423d-81d5-1cda568459db":"/worker-page",
// }


// export default{
//    ROLE_PAGE_MAP,
//    getStore,
//    modifyStore,
//    getFormData,
//    displayMessage,
//    navigateTo,
// }
