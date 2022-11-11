package roy.aman.EcommerceApplication.Exceptions;

public class ResourceNotFoundException extends RuntimeException{


    public ResourceNotFoundException(String resourceName, String fieldName, Integer fieldValue){
        super(resourceName+" is not found with "+fieldName+" "+fieldValue);

    }

 }
