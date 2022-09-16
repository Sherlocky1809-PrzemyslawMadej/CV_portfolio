
<%@include file="dynamic/header.jspf"%>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top">
    <div class="container-fluid d-flex justify-content-between align-items-center">

      <h1 class="logo me-auto me-lg-0"><a href="index.html">PRZEMEK</a></h1>
      <!-- Uncomment below if you prefer to use an image logo -->
      <!-- <a href="index.jsp" class="logo"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

      <nav id="navbar" class="navbar order-last order-lg-0">
        <ul>
          <li><a class="active" href="index.html">Home</a></li>
          <li><a href="portfolio/aboutMe.jsp">About</a></li>
          <li><a href="portfolio/resumeMe.jsp">Resume</a></li>
          <li><a href="portfolio/contactMe.jsp">Contact</a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

      <%@include file="dynamic/socialLinks.jspf"%>

    </div>

  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->
  <section id="hero" class="d-flex align-items-center">
    <div class="container d-flex flex-column align-items-center" data-aos="zoom-in" data-aos-delay="100">
      <h1>Przemysław Madej</h1>
      <h2>I'm looking for a job as Junior Java Developer</h2>
      <a href="portfolio/aboutMe.jsp" class="btn-about">About Me</a>
    </div>
  </section><!-- End Hero -->

  <%@include file="dynamic/footer.jspf"%>

  <%@include file="dynamic/preloader.jspf"%>

</body>

</html>