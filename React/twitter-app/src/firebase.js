import firebase from "firebase";


const firebaseConfig = {
    apiKey: "AIzaSyCzJMXj4soSgsvKwrvCJwervXtMczyfeuA",
    authDomain: "twitter-app-87a72.firebaseapp.com",
    projectId: "twitter-app-87a72",
    storageBucket: "twitter-app-87a72.appspot.com",
    messagingSenderId: "801061053614",
    appId: "1:801061053614:web:f828857ac98f292c01393f",
    measurementId: "G-L24D7YQP2V"
  };

  const firebaseApp = firebase.initializeApp(firebaseConfig);

  const db = firebaseApp.firestore();

  export default db;