import axios from "axios";

export default axios.create({
    // baseURL: "http://localhost:8082/",
    baseURL: "http://localhost:8080/",
    headers: {
        "Content-type": "application/json"
    }
});
