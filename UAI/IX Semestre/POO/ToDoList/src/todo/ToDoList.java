package todo;

public class ToDoList {

	  //variables
	  private String[] todo; //almacenaje de tareas
	  private int count;     //contador


	  /**
	   *  Crea la Lista de Tareas. M�ximo 10 tareas
	   */
	  public ToDoList() {
	    this.todo = new String[10];
	    this.count = 0;
	  }

	  /**
	   * Verifica si la tarea ha sido agregada a la lista o no
	   */
	  public boolean add(String item) {
	    if (this.count == this.todo.length) {
	      return false;  //no se pudo agregar la tarea
	    }else {
	      this.todo[count] = item;
	      this.count++;
	      return true;
	    }
	  }

	  /**
	   * Entrega cuantas tareas hay en la lista
	   */
	  public int getSize() {
	    return count;
	  }

	  /**
	   * Removes the item at the given 1-based index in this list.
	   * Returns the removed item, or null if the given index did not correspond
	   * to a valid item.
	   */
	  public String remove(int index) {
	    if (index < 1 || index > this.count) {
	      return null;  //no such element
	    }else {
	      index--;  //convert to 0-based indexing used by array
	      String deleted = this.todo[index];
	      //delete by shifting everything down into removed item's space
	      for (int i = index; i < this.count - 1; i++) {
	        this.todo[i] = this.todo[i + 1];
	      }
	      this.count--;  //removed an element
	      return deleted;
	    }
	  }

	  /**
	   * Entrega un String con las listas que hay ingresadas.
	   */
	  public String toString() {
	    String output = "TODO:\n";
	    for (int i = 0; i < this.count; i++) {
	      output += (i + 1) + ". " + this.todo[i] + "\n";
	    }
	    return output;
	  }



	  /**
	   * MENU.
	   */
	  public static void main(String[] args) {

	    java.util.Scanner keybd = new java.util.Scanner(System.in);
	    ToDoList list = new ToDoList();

	    int choice = 1;
	    while (choice != 0) {
	      //print list
	      System.out.println();
	      System.out.println(list);  //calls toString()

	      //print menu choices
	      System.out.println("MENU:");
	      System.out.println("1 - Agregar tarea");
	      System.out.println("2 - Remover �ltima tarea");
	      System.out.println("3 - Remover tarea");
	      System.out.println("0 - Salir");
	      System.out.print("Ingresar el n�mero de acci�n a realizar: ");

	      //Elecci�n del usuario
	      try {
	        choice = keybd.nextInt();
	        keybd.nextLine();  
	        switch (choice) {
	          case 1:  //Agregar
	            System.out.print("Ingrese tarea a recordar: ");
	            String task = keybd.nextLine();
	            boolean added = list.add(task);
	            if (!added) {
	              System.out.println("La lista de tareas est� completa. Elimina una tarea para agregar otra");
	            }
	            break;

	          case 2:  //Eliminar �ltima tarea
	            String removed = list.remove(list.getSize());
	            if (removed != null) {
	              System.out.println("Eliminado: " + removed);
	            }else {
	              System.out.println("La lista de tareas est� vac�a.");
	            }
	            break;

	          case 3:  //Eliminar tarea
	            System.out.print("Ingrese el n�mero de la tarea a remover: ");
	            int index = keybd.nextInt();
	            removed = list.remove(index);
	            if (removed != null) {
	              System.out.println("Eliminado: " + removed);
	            }else {
	              System.out.println("No hay ninguna tarea en el n�mero " +
	                  index + ".");
	            }
	            break;

	          case 0:
	            System.out.println("Sesi�n Finalizada");
	            break;

	          default:
	            System.out.println("La opci�n " + choice + " no existe. " +
	                " Ingrese una opci�n v�lida.");
	            break;
	        }
	      }catch (java.util.InputMismatchException ime) {
	        System.out.println("ERROR. Debe ingresar un n�mero v�lido");
	        keybd.nextLine();  
	      }
	    }
	  }

	}