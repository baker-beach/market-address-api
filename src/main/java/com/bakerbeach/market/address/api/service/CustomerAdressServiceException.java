package com.bakerbeach.market.address.api.service;

import com.bakerbeach.market.core.api.model.Text;

@SuppressWarnings("serial")
public class CustomerAdressServiceException extends Exception {
	
	private Text text;
	
	public Text getText(){
		return text;
	}
	
	public void setText(Text text){
		this.text = text;;
	}
	
	public CustomerAdressServiceException(Text text){
		this.text = text;
	}
	
	public CustomerAdressServiceException(Exception e){
		super(e);
	}
	
	public static class CustomerAddressNotFoundException extends CustomerAdressServiceException{
		
		public CustomerAddressNotFoundException(Exception e) {
			super(e);
		}
		
		public CustomerAddressNotFoundException(Text text) {
			super(text);
		}
		
	}
	
	public static class InvalidDataException extends CustomerAdressServiceException{
		
		public InvalidDataException(Exception e) {
			super(e);
		}
		
		public InvalidDataException(Text text) {
			super(text);
		}
		
	}

}
