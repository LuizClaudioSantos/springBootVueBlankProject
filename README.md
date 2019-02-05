# Blank Project SpringBoot And Vue.js

This is a project to be used as start point for a project using vue.js as frontend framework and SpringBoot in the backend. The frontend part is based in the CJ [video](https://www.youtube.com/watch?v=5GfpGaHKfyo&t=782s) about Vuetify.

## Main Features

1. Using the SpringBoot as framework in backend you bring to your project huge number of possibilities of a mature technology used by a lot of developers in the world. 
2. Vue.js is a an incrementally adoptable ecosystem that scales between a library and a full-featured framework, it will bring all features of a modern Javascript frontend to your project.
3. Vuetify
4. Webpack
5. npm


## Requirements

Node.js  version v8.12.0

npm version 6.4.1

JDK 1.9

## Getting Your Hands Dirty

Just clone the repository and change the project as you wish, the frontend part of it is in the folder frontend.

To build for deployment use the comand :
```
./gradlew clean build 
```

For development use the comannd below in the folder frontend, then use start the SpringBoot in the  IDE that you like.
```
npm run dev 
```

Or use only 
```
./gradlew bootRun
``` 
which will use `webpackDev` task to start frontend using `npm run dev` before running spring boot app.

