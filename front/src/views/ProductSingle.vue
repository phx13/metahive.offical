<template>
  <header-nav/>
  <product-description/>
  <footer-contact/>
</template>

<script>
import HeaderNav from "../components/HeaderNav";
import FooterContact from "../components/FooterContact";
import ProductDescription from "../components/ProductDescription";

export default {
  name: "ProductSingle",
  components: {ProductDescription, FooterContact, HeaderNav}
}
</script>

<style scoped>

</style>