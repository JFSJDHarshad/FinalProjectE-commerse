document.addEventListener('DOMContentLoaded', function() {
    const productData = JSON.parse(localStorage.getItem('products'));
    
  
    // Compile the Handlebars template
    const templateSource = document.getElementById('product-template').innerHTML;
    const template = Handlebars.compile(templateSource);
  
    // Render the product details
    const productDetails = document.getElementById('productDetails');
    productDetails.innerHTML = template({ products: productData });
    
  });
  