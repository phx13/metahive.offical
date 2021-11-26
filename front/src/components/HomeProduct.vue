<template>
  <!-- SERVICES START -->
  <section class="section bg-light">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-lg-8 col-md-12">
          <div class="section-title mb-4 pb-2 text-center">
            <h3 class="title text-uppercase mb-4">产品介绍</h3>
          </div>
        </div>

        <div class="row">
          <div class="col-lg-4 col-md-6 mt-4 pt-2" v-for="product in products">
            <div class="rounded position-relative overflow-hidden d-block">
              <div class="img">
                <img src="../assets/picture/img-2.jpg" alt="service_img" class="img-fluid">
              </div>
              <div class="text-center p-4 bg-light">
                <h5 class="text-dark">{{ product.name }}</h5>
                <p class="text-muted">{{ product.description }}</p>
<!--                <a class="text-custom" @click="getDescription(product.id)">了解更多</a>-->
                <router-link :to="'/product_single/'+product.id.toString()" class="text-custom">跳转</router-link>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- SERVICES END -->
</template>

<script>
import request from "../assets/js/request";

export default {
  name: "HomeProduct",
  data() {
    return {
      products: ""
    }
  },
  //在这里调用ajax请求方法
  created() {
    this.getProducts();
  },
  methods: {
    getProducts: function () {
      request.get("/api/server/product/all").then(res => {
        if (res) {
          this.products = res;
        }
      })
    }
  }
}
</script>

<style scoped>

</style>