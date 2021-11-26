import {createApp} from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap"
import $ from "jquery"
import "@fortawesome/fontawesome-free/css/fontawesome.min.css"
import "@fortawesome/fontawesome-free/css/brands.min.css"
import "@fortawesome/fontawesome-free/css/solid.min.css"
import "./assets/css/style.css"

createApp(App).use(store).use(router).use($).mount('#app')
