<template>
  <section class="home-slider position-relative">
    <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0"
                aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" class="active"
                aria-current="true"
                aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                aria-label="Slide 3"></button>
      </div>
      <div class="carousel-inner">
        <div class="carousel-item">
          <img src="../assets/images/bg-home-3.jpg" class="d-block w-100" alt="...">
          <div class="bg-overlay"></div>
          <div class="carousel-caption d-none d-md-block carousel-caption-left">
            <h1 class="heading text-white">行业深耕</h1>
            <p class="text-white-50 para-desc ml-auto">创造有感情的智能终端，有能力的互联平台，有深度的数据分析。</p>
          </div>
        </div>
        <div class="carousel-item active">
          <img src="../assets/images/bg-home-2.jpg" class="d-block w-100" alt="...">
          <div class="bg-overlay"></div>
          <div class="carousel-caption d-none d-md-block carousel-caption-center">
            <h1 class="heading text-white">元巢METAHIVE</h1>
            <p class="text-white-50 para-desc mx-auto">打造未来的物联网交互体系，让事物变得更有感情。</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="../assets/images/bg-home-5.jpg" class="d-block w-100" alt="...">
          <div class="bg-overlay"></div>
          <div class="carousel-caption d-none d-md-block carousel-caption-right">
            <h1 class="heading text-white">未来愿景</h1>
            <p class="text-white-50 para-desc mr-auto">助力产业数字化转型，提升资源配置效率，实现绿色复苏碳中和。</p>
          </div>
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
              data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
              data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>
  </section>
</template>

<script>
export default {
  name: "HomeCarousel"
}
</script>

<style scoped>

</style>