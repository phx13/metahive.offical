<template>

  <!-- Navigation Bar-->
  <header id="topnav" class="fixed-top navbar-sticky sticky">
    <div class="container">
      <!-- Logo container-->
      <div>
        <a href="/" class="logo">
          <img src="../assets/logo.png" alt="missing_logo" height="50">
        </a>
      </div>
      <!-- End Logo container-->

      <div id="navigation">
        <!-- Navigation Menu-->
        <ul class="navigation-menu">
          <li class="active">
            <a href="/">首页</a>
          </li>

          <li class="has-submenu">
            <a href="javascript:void(0)">关于我们</a><span class="menu-arrow"></span>
            <ul class="submenu">
              <li><a href="/about">公司简介</a></li>
              <li><a href="/history">公司历史</a></li>
              <li class="has-submenu"><a href="javascript:void(0)">Team Members</a><span
                  class="submenu-arrow"></span>
                <ul class="submenu">
                  <li><a href="team-grid.html">Grid Teams</a></li>
                  <li><a href="team-list.html">List Teams</a></li>
                  <li><a href="team-detail.html">Single Team</a></li>
                </ul>
              </li>
              <li class="has-submenu"><a href="javascript:void(0)">Work</a><span
                  class="submenu-arrow"></span>
                <ul class="submenu">
                  <li><a href="work-col-three.html">Three Column Portfolio</a></li>
                  <li><a href="work-col-four.html">Four Column Portfolio</a></li>
                  <li><a href="work-col-six.html">Six Column Portfolio</a></li>
                  <li><a href="work-single.html">Single Portfolio</a></li>
                </ul>
              </li>
            </ul>
          </li>

          <li class="has-submenu">
            <a href="javascript:void(0)">产品</a>
            <span class="menu-arrow"></span>
            <ul class="submenu megamenu">
              <li class="has-submenu"><a href="javascript:void(0)">Services</a><span
                  class="submenu-arrow"></span>
                <ul class="submenu">
                  <li><a href="service.html">Services</a></li>
                  <li><a href="service-image.html">Service With Image</a></li>
                  <li><a href="service-detail.html">Single Service</a></li>
                </ul>
              </li>
              <li>
                <ul>
                  <li><a href="faq.html"><b class="mdi mdi-chevron-right"></b> FAQ's</a></li>
                  <li><a href="price.html"><b class="mdi mdi-chevron-right"></b> Pricing Table</a>
                  </li>
                  <li><a href="privacy.html"><b class="mdi mdi-chevron-right"></b> Privacy Policy</a>
                  </li>
                  <li><a href="login.html"><b class="mdi mdi-chevron-right"></b> Log In</a></li>
                  <li><a href="signup.html"><b class="mdi mdi-chevron-right"></b> Sign Up</a></li>
                  <li><a href="forgot-password.html"><b class="mdi mdi-chevron-right"></b> Forgot
                    Password</a></li>
                </ul>
              </li>
              <li>
                <ul>
                  <li><a href="contact.html"><b class="mdi mdi-chevron-right"></b> Contact Us</a></li>
                  <li><a href="blank-page.html"><b class="mdi mdi-chevron-right"></b> Blank Page</a>
                  </li>
                  <li><a href="coming-soon.html"><b class="mdi mdi-chevron-right"></b> Coming soon</a>
                  </li>
                  <li><a href="404.html"><b class="mdi mdi-chevron-right"></b> 404! Error</a></li>
                  <li><a href="500.html"><b class="mdi mdi-chevron-right"></b> 500! Error</a></li>
                </ul>
              </li>
            </ul>
          </li>

          <li class="has-submenu">
            <a href="javascript:void(0)">解决方案</a>
            <span class="menu-arrow"></span>
            <ul class="submenu">
              <li><a href="blog.html">Blog</a></li>
              <li><a href="blog-left.html">Left Sidebar</a></li>
              <li><a href="blog-right.html">Right Sidebar</a></li>
              <li><a href="blog-single.html">Single BLog</a></li>
            </ul>
          </li>


          <li class="dropdown d-none d-md-inline-block">
            <a class="nav-link dropdown-toggle arrow-none" data-toggle="dropdown" href="#" role="button"
               aria-haspopup="false" aria-expanded="false">
              <i class="fas fa-search noti-icon"></i>
            </a>
            <div class="dropdown-menu dropdown-menu-right dropdown-menu-search">
              <div>
                <form role="search" class="navbar-form">
                  <input type="text" placeholder="Search..." name="s" class="form-control search-bar">
                  <a href="" class="btn-search"><i class="fa fa-search"></i></a>
                </form>
              </div>

            </div>
          </li>
        </ul>
        <!-- End navigation menu-->
      </div>
    </div>
  </header>
  <!-- End Navigation Bar-->
</template>

<script>
export default {
  name: "HeaderNav"
}
</script>

<style scoped>

</style>