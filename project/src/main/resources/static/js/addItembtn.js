document.addEventListener('DOMContentLoaded', function() {
    var adminLoginButton = document.getElementById('buttn');
    
    adminLoginButton.addEventListener('click', function(event) {
      event.preventDefault(); // Prevent the default behavior of the anchor tag
      
      // Redirect to the admin login page
      window.location.href = '/adminlogin';
    });
  });
  