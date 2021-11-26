<template>

  <!-- portfolio detail -->
  <section class="section">
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-6">
          <img src="../assets/picture/img-2.jpg" alt="" class="img-fluid rounded">
        </div>

        <div class="col-lg-4 col-md-6 mt-4 mt-sm-0 pt-2 pt-sm-0">
          <div class="sidebar p-4 rounded border">
            <div class="section-title mb-0">
              <h4 class="title mb-4">产品信息:</h4>
            </div>

            <dl class="row mb-0">
              <dt class="col-4">产品名称:</dt>
              <dd class="col-8">{{ product.name }}</dd>

              <dt class="col-4">产品类型:</dt>
              <dd class="col-8">{{ product.type }}</dd>
            </dl>
          </div>
        </div>
      </div>

      <div class="row mt-4">
        <div class="col-md-12">
          <div class="section-title">
            <h5>产品描述:</h5>
          </div>

          <div class="project-desc">
            <p class="text-muted">{{ product.description }}</p>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- portfolio detail -->
</template>

<script>
import request from "../assets/js/request";

export default {
  name: "ProductDescription",
  data() {
    return {
      product: "",
    }
  },
  //在这里调用ajax请求方法
  created() {
    this.getProductDescription();
  },
  methods: {
    getProductDescription: function () {
      let productId = this.$route.params.productId;
      request.get("/api/server/product/" + productId).then(res => {
        if (res) {
          this.product = res;
        }
      })
    }
  }
}
</script>

<style scoped>

</style>