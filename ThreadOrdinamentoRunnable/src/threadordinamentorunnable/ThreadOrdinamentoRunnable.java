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
public class ThreadOrdinamentoRunnable implements Runnable{

    private int[] arrayOrdinato;
	
	
	public ThreadOrdinamentoRunnable(int[] arrayOrdinato) {
		this.arrayOrdinato = arrayOrdinato;
	}
	
	public void ordinaArray() {
		for (int i = 0; i < arrayOrdinato.length; i++) {
			for(int j = 0; j < arrayOrdinato.length - 1; j++) {
				if(arrayOrdinato[j] < arrayOrdinato[j+1]) {
				} else {
					int salvaNum = arrayOrdinato[j];
					arrayOrdinato[j] = arrayOrdinato[j+1];
					arrayOrdinato[j+1] = salvaNum;
				}
			}			
		}
	}
	
	public void run() {
		ordinaArray();
	}
    
}
