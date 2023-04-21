package com.hdfc.project.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hdfc.project.exception.CartIsEmpty;
import com.hdfc.project.exception.ChoiceNotValid;
import com.hdfc.project.exception.CustomerNotFound;
import com.hdfc.project.exception.ItemNotFound;
import com.hdfc.project.exception.NoOrdersAvailable;
import com.hdfc.project.exception.OrderNotAvailable;
import com.hdfc.project.exception.ProductNotFound;

@RestControllerAdvice
public class GlobalExceptionHandling {
	
	@ExceptionHandler(ProductNotFound.class)
	public ResponseEntity<String> handleExp(ProductNotFound product){
		return new ResponseEntity<String>(product.getMessage(),HttpStatus.BAD_REQUEST);
}

	@ExceptionHandler(ItemNotFound.class)
	public ResponseEntity<String> handleExp(ItemNotFound item){
		return new ResponseEntity<String>(item.getMessage(),HttpStatus.BAD_REQUEST);
}
	@ExceptionHandler(CustomerNotFound.class)
	public ResponseEntity<String> handleExp(CustomerNotFound customer){
		return new ResponseEntity<String>(customer.getMessage(),HttpStatus.BAD_REQUEST);
}
	@ExceptionHandler(CartIsEmpty.class)
	public ResponseEntity<String> handleExp(CartIsEmpty cart){
		return new ResponseEntity<String>(cart.getMessage(),HttpStatus.BAD_REQUEST);
}

   @ExceptionHandler(NoOrdersAvailable.class)
   public ResponseEntity<String> handleExp(NoOrdersAvailable orders){
	return new ResponseEntity<String>(orders.getMessage(),HttpStatus.BAD_REQUEST);
}
   @ExceptionHandler(OrderNotAvailable.class)
   public ResponseEntity<String> handleExp(OrderNotAvailable order){
   return new ResponseEntity<String>(order.getMessage(),HttpStatus.BAD_REQUEST);

}
   @ExceptionHandler(ChoiceNotValid.class)
   public ResponseEntity<String> handleExp(ChoiceNotValid choice){
   return new ResponseEntity<String>(choice.getMessage(),HttpStatus.BAD_REQUEST);

}

}
