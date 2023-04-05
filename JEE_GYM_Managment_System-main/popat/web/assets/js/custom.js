(function($) {
  
  "use strict";

  // Preloader
  function stylePreloader() {
    $('body').addClass('preloader-deactive');
  }

  // Background Image
  $('[data-bg-img]').each(function() {
    $(this).css('background-image', 'url(' + $(this).data("bg-img") + ')');
  });
  // Background Color
  $('[data-bg-color]').each(function() {
    $(this).css('background-color', $(this).data("bg-color"));
  });

  // Off Canvas JS
  var canvasWrapper = $(".off-canvas-wrapper");
  $(".btn-menu").on('click', function() {
    canvasWrapper.addClass('active');
  });
  $(".close-action > .btn-close, .off-canvas-overlay").on('click', function() {
    canvasWrapper.removeClass('active');
  });

  //Responsive Slicknav JS
  $('.main-menu').slicknav({
    appendTo: '.res-mobile-menu',
    closeOnClick: true,
    removeClasses: true,
    closedSymbol: '<i class="fa fa-angle-down"></i>',
    openedSymbol: '<i class="fa fa-angle-up"></i>'
  });

  // Off Canvas JS
  var quickViewModal = $(".product-quick-view-modal");
  $(".product-action .action-quick-view").on('click', function() {
    quickViewModal.addClass('active');
    $("body").addClass('fix');
  });
  $(".btn-close, .canvas-overlay").on('click', function() {
    quickViewModal.removeClass('active');
    $("body").removeClass('fix');
  });

  // Swipper JS

  // Home Two Slider
  var swiper = new Swiper('.home-slider-container', {
    slidesPerView: 1,
    loop: true,
    spaceBetween: 0,
    effect: 'fade',
    fadeEffect: {
      crossFade: true,
    },
  });

  // Gallery Trends Slider
  var swiper = new Swiper('.gallery-slider-container', {
    slidesPerView: 4,
    slidesPerGroup: 1,
    loop: true,
    spaceBetween : 25,
    breakpoints: {
      1200:{
          slidesPerView : 4
      },

      992:{
          slidesPerView : 3
      },

      768:{
          slidesPerView : 2
      },

      576:{
          slidesPerView : 2
      },

      0:{
          slidesPerView : 1
      }
    }
  });

  // Testimonial Single Slider
  var swiper = new Swiper('.testimonial-slider-container', {
    slidesPerView: 1,
    loop: true,
    spaceBetween: 0,
    autoplay: {
      delay: 20000,
      disableOnInteraction: false,
    },
    navigation: {
      nextEl: '.testimonial-slider-container .swiper-btn-next',
      prevEl: '.testimonial-slider-container .swiper-btn-prev',
    }
  });

  // Testimonial Single Slider
  var swiper = new Swiper('.testimonial-slider2-container', {
    slidesPerView: 2,
    slidesPerGroup: 1,
    loop: true,
    spaceBetween: 70,
    autoplay: {
      delay: 20000,
      disableOnInteraction: false,
    },
    navigation: {
      nextEl: '.testimonial-slider2-container .swiper-btn-next',
      prevEl: '.testimonial-slider2-container .swiper-btn-prev',
    },
    breakpoints: {
      1200:{
          slidesPerView : 2
      },

      992:{
          slidesPerView : 2
      },

      768:{
          slidesPerView : 2

      },

      576:{
          slidesPerView : 1
      },

      0:{
          slidesPerView : 1
      }
    }
  });

  // Post Slider
  var swiper = new Swiper('.post-slider-container', {
    slidesPerView: 2,
    slidesPerGroup: 2,
    loop: true,
    spaceBetween : 60,
    pagination: {
      el: '.swiper-pagination',
      clickable: 'true',
    },
    breakpoints: {
      1200:{
          slidesPerView : 2
      },

      992:{
          slidesPerView : 2
      },

      768:{
          slidesPerView : 1

      },

      576:{
          slidesPerView : 1
      },

      0:{
          slidesPerView : 1
      }
    }
  });

  // Brand Slider
  var swiper = new Swiper('.brand-logo-slider-container', {
    slidesPerView : 5,
    loop: true,
    speed: 1000,
    spaceBetween : 0,
    autoplay: false,
    breakpoints: {
      992:{
          slidesPerView : 5
      },

      768:{
          slidesPerView : 4

      },

      576:{
          slidesPerView : 3
      },

      380:{
          slidesPerView : 3
      },

      0:{
          slidesPerView : 2
      }
    }
  });

  // Swipper JS
  var swiper = new Swiper('.team-slider-container', {
    slidesPerView: 3,
    loop: true,
    spaceBetween : 30,
    autoplay: {
      delay: 2500,
      disableOnInteraction: false,
    },
    effect: 'fade',
    fadeEffect: {
      crossFade: true,
    },
    navigation: {
      nextEl: '.swiper-button-next',
      prevEl: '.swiper-button-prev',
    },
    breakpoints: {
      1200:{
          slidesPerView : 3
      },

      992:{
          slidesPerView : 3
      },

      768:{
          slidesPerView : 2

      },

      576:{
          slidesPerView : 2
      },

      0:{
          slidesPerView : 1
      }
    }
  });

  // Swipper JS
  var swiper = new Swiper('.product3-slider-container', {
    slidesPerView: 3,
    loop: true,
    spaceBetween : 30,
    autoplay: {
      delay: 4000,
    },
    breakpoints: {
      1200:{
          slidesPerView : 3
      },

      992:{
          slidesPerView : 2
      },

      768:{
          slidesPerView : 2

      },

      576:{
          slidesPerView : 2
      },

      0:{
          slidesPerView : 1
      }
    }
  });

  $('.single-product-thumb-slider').slick({
      slidesToShow: 1,
      slidesToScroll: 1,
      arrows: false,
      asNavFor: '.single-product-nav-slider'
  });

  $('.single-product-nav-slider').slick({
      slidesToShow: 3,
      slidesToScroll: 1,
      vertical:true,
      asNavFor: '.single-product-thumb-slider',
      dots: false,
      focusOnSelect: true,
      verticalSwiping:true,
      responsive: [
        {
          breakpoint: 1200,
          settings: {
            slidesToShow: 3,
            slidesToScroll: 1,
            verticalSwiping:false,
            vertical: false,
          }
        },
      ]
  });

  // Fancybox Js
  $('.lightbox-image').fancybox();

  //Video Popup
  $('.play-video-popup').fancybox();

  // Isotope and data filter
  function isotopePortfolio() {
    var $grid = $('.masonry-grid').isotope({
      itemSelector: '.masonry-item',
      masonry: {
        columnWidth: 1
      }
    })
    // Isotope Masonry
    var $gridMasonry = $('.masonry-style').isotope({
      itemSelector: '.masonry-item'
    })
    // Isotope filter Menu
    $('.portfolio-filter-menu').on( 'click', 'button', function() {
      var filterValue = $(this).attr('data-filter');
      $grid.isotope({ filter: filterValue });
      $gridMasonry.isotope({ filter: filterValue });
      var filterMenuactive = $(".portfolio-filter-menu button");
      filterMenuactive.removeClass('active');
      $(this).addClass('active');
    });
  }

  // Svg Icon Js 
  var $svgIconBox = $('.svg-icon-style');
  $svgIconBox.each(function() {
  var $this = $(this),
    $svgIcon = $this.find('.svg-icon'),
    $id = $svgIcon.attr('id'),
    $icon = $svgIcon.data('svg-icon');
    var $vivus = new Vivus($id, { duration: 1, file: $icon });
    $this.on('scroll', function () {
      $vivus.reset().play();
    });
  });

  // Parallax Js
  $('.bg-parallax').jarallax();

  // Images Zoom
  $('.zoom-hover').zoom();

  //Shop review btn
  $(".review-write-btn").on('click', function() {
    $(".product-review-form").toggle('active');
  });

  // Product Qty
  var proQty = $(".pro-qty");
  proQty.append('<a href="#" class="inc qty-btn"><i class="fa fa-angle-up"></i></a>');
  proQty.append('<a href="#" class= "dec qty-btn"><i class="fa fa-angle-down"></i></a>');
  $('.qty-btn').on('click', function(e) {
    e.preventDefault();
    var $button = $(this);
    var oldValue = $button.parent().find('input').val();
    if ($button.hasClass('inc')) {
      var newVal = parseFloat(oldValue) + 1;
    } else {
      // Don't allow decrementing below zero
      if (oldValue > 1) {
        var newVal = parseFloat(oldValue) - 1;
      } else {
        newVal = 1;
      }
    }
    $button.parent().find('input').val(newVal);
  });

  // Product Qty
  var proQty2 = $(".pro-qty-style2");
  proQty2.append('<a href="#" class="inc qty-btn"><i class="fa fa-plus"></i></a>');
  proQty2.append('<a href="#" class= "dec qty-btn"><i class="fa fa-window-minimize"></i></a>');
  $('.qty-btn').on('click', function(e) {
    e.preventDefault();
    var $button2 = $(this);
    var oldValue2 = $button2.parent().find('input').val();
    if ($button2.hasClass('inc')) {
      var newVal2 = parseFloat(oldValue2) + 1;
    } else {
      // Don't allow decrementing below zero
      if (oldValue2 > 1) {
        var newVal2 = parseFloat(oldValue2) - 1;
      } else {
        newVal2 = 1;
      }
    }
    $button2.parent().find('input').val(newVal2);
  });

  //Checkout Page Checkbox Accordion
  $("#create_pwd").on("change", function() {
    $(".account-create").slideToggle("100");
  });

  $("#ship_to_different").on("change", function() {
    $(".ship-to-different").slideToggle("100");
  });

  // Progress Bar JS
  var skillsBar = $(".progress-bar-line");
  skillsBar.appear(function() {
    skillsBar.each(function(index, elem) {
      var elementItem = $(elem),
          skillBarAmount = elementItem.data('percent');
      elementItem.animate({
          width: skillBarAmount
      }, 800);
      elementItem.closest('.progress-item').find('.percent').text(skillBarAmount);
      elementItem.closest('.progress-item').find('.progress-info').css('width', skillBarAmount);
    });
  });

  //Tippy Tooltip JS
  tippy('.ht-tooltip', {
    inertia: true,
    animation: 'shift-away',
    arrow: true
  });

  // Scroll Top Hide Show
  var varWindow = $(window);
  varWindow.on('scroll', function(){
    if ($(this).scrollTop() > 250) {
      $('.scroll-to-top').fadeIn();
    } else {
      $('.scroll-to-top').fadeOut();
    }

    // Sticky Header
    if($('.sticky-header').length){
      var windowpos = $(this).scrollTop();
      if (windowpos >= 80) {
        $('.sticky-header').addClass('sticky');
      } else {
        $('.sticky-header').removeClass('sticky');
      }
    }
  });

  // Ajax Contact Form JS
  var form = $('#contact-form');
  var formMessages = $('.form-message');

  $(form).submit(function(e) {
    e.preventDefault();
    var formData = form.serialize();
    $.ajax({
        type: 'POST',
        url: form.attr('action'),
        data: formData
    }).done(function(response) {
        // Make sure that the formMessages div has the 'success' class.
        $(formMessages).removeClass('alert alert-danger');
        $(formMessages).addClass('alert alert-success fade show');

        // Set the message text.
        formMessages.html("<button type='button' class='btn-close' data-bs-dismiss='alert'>&times;</button>");
        formMessages.append(response);

        // Clear the form.
        $('#contact-form input,#contact-form textarea').val('');
    }).fail(function(data) {
        // Make sure that the formMessages div has the 'error' class.
        $(formMessages).removeClass('alert alert-success');
        $(formMessages).addClass('alert alert-danger fade show');

        // Set the message text.
        if (data.responseText !== '') {
            formMessages.html("<button type='button' class='btn-close' data-bs-dismiss='alert'>&times;</button>");
            formMessages.append(data.responseText);
        } else {
            $(formMessages).text('Oops! An error occurred and your message could not be sent.');
        }
    });
  });

  //Scroll To Top
  $('.scroll-to-top').on('click', function(){
    $('html, body').animate({scrollTop : 0},800);
    return false;
  });

  // Reveal Footer JS
  let revealId = $(".reveal-footer"),
    footerHeight = revealId.outerHeight(),
    windowWidth = $(window).width(),
    windowHeight = $(window).outerHeight(),
    leftFixedHeader = $("header.fixed-left"),
    leftFixedHeaderWidth = leftFixedHeader.innerWidth();

  if (windowWidth > 991 && windowHeight > footerHeight) {
    $(".site-wrapper-reveal").css({
      'margin-bottom': footerHeight + 'px'
    });
  }
  
  
/* ==========================================================================
   When document is loading, do
   ========================================================================== */
  
  varWindow.on('load', function() {
    isotopePortfolio();
    AOS.init({
      once: true,
    });
    stylePreloader();
  });
  

})(window.jQuery);