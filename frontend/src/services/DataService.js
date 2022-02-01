import http from "../http-common"

 class DataService {

    getStoryWords(){
        return http.get("story/words")
    }
 }

export default new DataService();
