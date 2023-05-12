class Http {
  // using # creates a private variable/method
  baseURL = 'http://localhost:9000/employees/'

  async send(url, options = {}) {
      try {
          const response = await fetch(`${this.baseURL}${url}`, options);
          const data = await response.json();

          if (!response.ok) {
              throw data.error;
          }

          return data;
      } catch(e) {
          throw "Something Went Wrong";
      }
      
  }

  get(url) {
      return this.send(url);
  }

  post(url, data) {
      return this.send(url, {
          method: 'POST',
          headers: {
              'Content-Type': 'application/json'
          },
          body: JSON.stringify(data)
      })
  }

  delete(url) {
      return this.send(url, {
          method: 'DELETE'
      })
  }
}

const http = new Http();

export default http;