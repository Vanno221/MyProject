/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadordinamentorunnable;

/**
 *
 * @author rikys
 */
public class Main {
    
    public static void main(String[] args) {
		
		int[] array = new int[100];
		
		Thread t1 = new Thread(new ThreadOrdinamentoRunnable(caricaArray(array)));
		
		System.out.println("\n L'array non è ordinato: ");
		stampa(array);
		
		t1.start();
		
		try {
			t1.join();
		} catch(InterruptedException e) {
			System.err.println(e.toString());
			Thread.yield();
		}
		
		System.out.println("\n\n L'array è ordinato: ");
		stampa(array);
		
	}
	
	static int[] caricaArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random() * 101);
			
		}
		return array;
	}
	
	static void stampa(int[] array) {
		for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i]+" - ");
		}
	}
}
