
  const form = document.getElementById("admin_formpage");
  var adminName = document.getElementById("admin").value;
  var password = document.getElementById("admin_pass").value;
  System.out.println(adminName);
  System.out.println(password);


    form.addEventListener("submit", function(event) {
      event.preventDefault();
      if (adminName === "HDadmin" && password === "Mradmin") {
        alert("Form submitted successfully!");
        form.submit();
      }
      else{
        alert("unsuccesfull y but");
      }
    });

   