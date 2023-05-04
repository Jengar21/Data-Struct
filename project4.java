 /*
  Your Name:  Jennifer Garcia
  Pace Email: jg34071n@pace.edu
  Bubble Sort:
  What is the worst case big O and what kind of input would cause that?
  The worst case big O is O(n^2) for bubble sort, when the list has the smallest element at the last position, this would cause the smallest element to move down the list and pass through each other element.
  What is the best case big O and what kind of input would cause that?
  The best case would be O(n) and this would apply when the list is already sorted because there is no comparisons and therefore no swaps. 
  
  Insertion Sort:
  What is the worst case big O and what kind of input would cause that?
  The worst case big O is O(n^2) for insertion sort when the list has the smallest element at the last position, this would cause the smallest element to move down the list and pass through each other element.
  What is the best case big O and what kind of input would cause that?
  The best case would be O(n) and this would apply when the list is already sorted.
  
  Selection Sort:
  What is the worst case big O and what kind of input would cause that?
  The worst case big O is O(n^2) for selection sort when the list is already sorted but the smallest element at the last position, this would cause the smallest element to move down the list and pass through each other element.
  What is the best case big O and what kind of input would cause that?
  The best case would be O(n) and this would apply when the list is already sorted because there is no comparisons and therefore no swaps. 
*/
import java.util.ArrayList;
import java.util.Collections;

public class project4 {
   // print method
	public static void print(ArrayList<Courses> a) {
        for (Courses c : a) {
            System.out.println(c);
        }
    }
	
	// bubble sort
	public static void bubbleSort(ArrayList<Courses> a) {
        int n = a.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a.get(j).compareTo(a.get(j+1)) > 0) {
                	//swap j and j+1
                   Courses temp= a.get(j);
                   a.set(j,a.get(j+1));
                   a.set(j+1, temp);
                   
                }
            }
        }
    }
	
	// insertion sort 
    public static void insertionSort(ArrayList<Courses> a) {
        int n = a.size();
        for (int i = 1; i < n; i++) {
            Courses temp = a.get(i);
            int j = i;
            
            while (j >= 0 && a.get(j-1).compareTo(temp) > 0) {
                a.set(j, a.get(j-1));
                j --;
            }
            a.set(j, temp);
        }
    }
    // selection sort
    public static void selectionSort(ArrayList<Courses> a) {
        int n = a.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (a.get(j).compareTo(a.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // swap i and minIndex
            Courses temp= a.get(i);
            a.set(i,a.get(minIndex));
            a.set(minIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Courses> courses = new ArrayList<>();
        
        courses.add(new Courses("MAT", 100, "Calculus I"));
        courses.add(new Courses("CS", 241, "Data Structures and Algorithms"));
        courses.add(new Courses("CS", 121, "Introduction to Computer Science"));
        courses.add(new Courses("CIS", 151, "Programming Fundamentals"));

        System.out.println("Original List:");
        print(courses);
        System.out.println();

        Collections.sort(courses);
        System.out.println("Sorted List using Comparable:");
        print(courses);
        System.out.println();

        bubbleSort(courses);
        System.out.println("Sorted List using Bubble Sort:");
        print(courses);
        System.out.println();

        insertionSort(courses);
        System.out.println("Sorted List using Insertion Sort:");
        print(courses);
        System.out.println();

        selectionSort(courses);
        System.out.println("Sorted List using Selection Sort:");
        print(courses);
    }
}
