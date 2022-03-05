package com.souza.caio.fundamentosJava8.test;

 class N  extends M {

	 interface Creator<T, R> {
		    R create(T t);
		}
		 
		 public static void main(String[] args) {
		        Creator<String, Log> obj = Log::new;
		  }
}
