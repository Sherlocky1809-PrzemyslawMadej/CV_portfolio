<%@include file="../dynamic/header.jspf"%>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top">
    <div class="container-fluid d-flex justify-content-between align-items-center">

      <h1 class="logo me-auto me-lg-0"><a href="../index.jsp">PRZEMEK</a></h1>
      <!-- Uncomment below if you prefer to use an image logo -->
      <!-- <a href="index.jsp" class="logo"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

      <nav id="navbar" class="navbar order-last order-lg-0">
        <ul>
          <li><a href="../index.jsp">Home</a></li>
          <li><a href="aboutMe.jsp">About</a></li>
          <li><a class="active" href="resume.html">Resume</a></li>
          <li><a href="contactMe.jsp">Contact</a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

      <%@include file="../dynamic/socialLinks.jspf"%>

    </div>

  </header><!-- End Header -->

  <main id="main">

    <!-- ======= Resume Section ======= -->
    <section id="resume" class="resume">
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2>Resume</h2>
          <p>My soft skills: 
              work in a team - I was member and  vice-chairman of Students' Science Club "Wentylator"
              independent - in my current job I'm independent counselor and manage project department
              analytical thinking - I deal with mathematical or logical problems.</p>
        </div>

        <div class="row">
          <div class="col-lg-6">
            <h3 class="resume-title">Foreign Languages</h3>
            <div class="resume-item pb-0">
              <h4></h4>
              <p><em>Confirmation of by English language skills is C1 certificate achieved during studying at Technical University of Lodz. My A1 level of Portuguese is an effect of studying at University of Aveiro (Portugal) as Erasmus+ exchange.</em></p>
              <p>
              <ul>
                <li>Portuguese A1</li>
                <li>German A2</li>
                <li>English C1</li>
              </ul>
              </p>
            </div>

            <h3 class="resume-title">Education</h3>
            <div class="resume-item">
              <h4>Master of Environmental Engineering - Erasmus+ Programme</h4>
              <h5>2019 - 2020</h5>
              <p><em>University of Aveiro - Portugal </em></p>
              <p>I did a research about particullar matter contamination in portuguese City called Estarreja. Results of my analysis were a base of my Master Thesis.</p>
            </div>
            <div class="resume-item">
              <h4>Master of Environmental Engineering</h4>
              <h5>2014 - 2021</h5>
              <p><em>Lodz University Of Technology, Poland</em></p>
              <p>I took part in events fromStudents' Science Club called "Wentylator" like science conferences, courses and another type of activity.</p>
            </div>
          </div>
          <div class="col-lg-6">
            <h3 class="resume-title">Professional Experience</h3>
            <div class="resume-item">
              <h4>Project and Technical counselor </h4>
              <h5>2020 - Present</h5>
              <p><em>Vesbo Poland </em></p>
              <p>
              <ul>
                <li>Creating material statements and offers</li>
                <li>Designing and updating of hydraulic installations </li>
                <li>Technical consulting in the scope of company's products</li>
              </ul>
              </p>
            </div>
          <h3 class="resume-title">Courses</h3>
            <div class="resume-item">
              <h4>Graphic design specialist</h4>
              <h5>2017 - 2018</h5>
              <p><em>Stepping Stone Advertising, New York, NY</em></p>
              <p>
              <ul>
                <li>Developed numerous marketing programs (logos, brochures,infographics, presentations, and advertisements).</li>
                <li>Managed up to 5 projects or tasks at a given time while under pressure</li>
                <li>Recommended and consulted with clients on the most appropriate graphic design</li>
                <li>Created 4+ design presentations and proposals a month for clients and account managers</li>
              </ul>
              </p>
            </div>
          </div>
        </div>

      </div>
    </section><!-- End Resume Section -->

  </main><!-- End #main -->

  <%@include file="../dynamic/footer.jspf"%>

  <%@include file="../dynamic/preloader.jspf"%>

</body>

</html>