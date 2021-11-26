<template>
  <header-nav/>
  <home-carousel/>
  <home-introduction/>
  <home-product/>
  <footer-contact/>
</template>

<script>
import HeaderNav from "../components/HeaderNav";
import HomeCarousel from "../components/HomeCarousel";
import HomeIntroduction from "../components/HomeIntroduction";
import HomeProduct from "../components/HomeProduct";
import FooterContact from "../components/FooterContact";

export default {
  components: {FooterContact, HomeProduct, HomeIntroduction, HomeCarousel, HeaderNav}
}
</script>
