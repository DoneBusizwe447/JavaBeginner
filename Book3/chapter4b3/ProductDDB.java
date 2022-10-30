public class ProductDDB
{
 public static Product getProduct(String code)
 throws ProductDataException
 {
 try
 {
 Product p;
 // code that gets the product from a file
 // and might throw an IOException
 p = new Product();
 return p;
 }
 catch (IOException e)
 {
 throw new ProductDataException(
 "An IO error occurred.");
 }
 }

    private static class Product {

        public Product() {
        }
    }

    private static class ProductDataException extends Exception {

        public ProductDataException(String an_IO_error_occurred) {
        }
    }
}