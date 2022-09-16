<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/header.jspf"%>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top">
    <div class="container-fluid d-flex justify-content-between align-items-center">

      <h1 class="logo me-auto me-lg-0"><a href="../index.jsp">PRZEMEK</a></h1>
<!--       Uncomment below if you prefer to use an image logo -->
<!--       <a href="index.jsp" class="logo"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

      <nav id="navbar" class="navbar order-last order-lg-0">
        <ul>
          <li><a href="../index.jsp">Home</a></li>
          <li><a class="active" href="about.html">About</a></li>
          <li><a href="resumeMe.jsp">Resume</a></li>
          <li><a href="contactMe.jsp">Contact</a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

      <%@include file="../dynamic/socialLinks.jspf"%>

    </div>

  </header><!-- End Header -->

  <main id="main">

    <!-- ======= About Section ======= -->
    <section id="about" class="about">d
  <c:forEach items="${personList}" var="title">
    <!-- Dlaczego cannot resolve variable "personList"? -->
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2>About</h2>
          <p>Software development is my hobby for the few years, to whom I give myself up in the evenings.
            Finally, I decided to change this to my daily job. I had started with C++ programming
            and after that I began to write first Java applications thanks to  intensive course "Java from basics".
            In the future I would like to develop my software skills to became Fullstack Developer,
            so I try to be active during lessons in this course. Moreover, I often learn and resolve various tasks
            and problems linked with  software development. My results are updated on GitHub.
              I will be happy and excited if I join to developers' team,
            which I can support my skills in the field of <b>Spring</b>, <b>Maven</b> or <b>Tomcat</b>.</p>
        </div>

        <div class="row">
          <div class="col-lg-4">
            <img src="Chłopak Noska.jpg" class="img-fluid" alt="">
          </div>
          <div class="col-lg-8 pt-4 pt-lg-0 content">
            <h3>Junior Java Developer</h3>
            <p class="fst-italic">
             “With self-discipline most anything is possible”. — Teodor Roosevelt
            </p>
            <div class="row">
              <div class="col-lg-6">
                <ul>
                  <li><i class="bi bi-rounded-right"></i> <strong>Birthday:</strong> 1 May 1995</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>Website:</strong> www.example.com</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>Phone:</strong> +123 456 7890</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>City:</strong> City : New York, USA</li>
                </ul>
              </div>
              <div class="col-lg-6">
                <ul>
                  <li><i class="bi bi-rounded-right"></i> <strong>Age:</strong> 30</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>Degree:</strong> Master</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>PhEmailone:</strong> email@example.com</li>
                  <li><i class="bi bi-rounded-right"></i> <strong>Freelance:</strong> Available</li>
                </ul>
              </div>
            </div>
            <p>
              I agree to the processing of personal data provided in this document for realising the recruitment process pursuant to the Personal Data Protection Act of 10 May 2018 (Journal of Laws 2018, item 1000) and in agreement with Regulation (EU) 2016/679 of the European Parliament and of the Council of 27 April 2016 on the protection of natural persons with regard to the processing of personal data and on the free movement of such data, and repealing Directive 95/46/EC (General Data Protection Regulation).
            </p>
          </div>
        </div>

      </div>
      </c:forEach>
    </section><!-- End About Section -->

    <!-- ======= Skills Section ======= -->
    <section id="skills" class="skills">
      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2>Skills</h2>
          <p>My soft skills: 
              work in a team - I was member and  vice-chairman of Students' Science Club "Wentylator"
              independent - in my current job I'm independent counselor and manage project department
              analytical thinking - I deal with mathematical or logical problems</p>
        </div>

        <div class="row skills-content">

          <div class="col-lg-6">

            <div class="progress">
              <span class="skill">HTML <i class="val">100%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
              </div>
            </div>

            <div class="progress">
              <span class="skill">CSS <i class="val">90%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100"></div>
              </div>
            </div>

            <div class="progress">
              <span class="skill">JavaScript <i class="val">75%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
              </div>
            </div>

          </div>

          <div class="col-lg-6">

            <div class="progress">
              <span class="skill">PHP <i class="val">80%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"></div>
              </div>
            </div>

            <div class="progress">
              <span class="skill">WordPress/CMS <i class="val">90%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100"></div>
              </div>
            </div>

            <div class="progress">
              <span class="skill">Photoshop <i class="val">55%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="55" aria-valuemin="0" aria-valuemax="100"></div>
              </div>
            </div>

          </div>

        </div>

      </div>
    </section><!-- End Skills Section -->

  </main><!-- End #main -->

    <%@include file="../dynamic/footer.jspf"%>

    <%@include file="../dynamic/preloader.jspf"%>

</body>

</html>