<template>
  <div class="about">
    <h1>This is an about page</h1>
  </div>

  <button
  @click="getStoryWords"
  >
    Get story words
  </button>

  <div>{{storyWord}}</div>
</template>

<script>
 import DataService from "../services/DataService"

  export default {
    name: "About",

    data() {
      return {
        storyWord: "N/A"
      }
    },

    methods:{
      getStoryWords(){
        DataService.getStoryWords()
                .then(response =>{
                  this.storyWord = response.data;
                  console.log(this.storyWord);
                })
      }
    }
  }
</script>
