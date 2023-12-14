package aulaas;
import java.util.Random;


public class numerosaleatorios {
	
	    public static void main(String[] args) {
	        int[] randomNumbers = new int[1000];
	        Random random = new Random();

	        for (int i = 0; i < 1000; i++) {
	            randomNumbers[i] = random.nextInt(19999) - 9999;
	        }

	        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

	        for (int i = 0; i < 1000; i++) {
	            doublyLinkedList.insertInOrder(randomNumbers[i]);
	        }

	        System.out.println("Lista em ordem crescente:");
	        doublyLinkedList.printAscending();

	        System.out.println("\nLista em ordem decrescente:");
	        doublyLinkedList.printDescending();
	    }
	}

	
