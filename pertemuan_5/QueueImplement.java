package pertemuan_5;

import java.util.Scanner;

class Queue {
    private int front, rear, capacity, count;
    private int[] arr;

    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Menambahkan elemen
    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue penuh! Tidak bisa insert.");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Menghapus elemen
    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue kosong! Tidak bisa remove.");
            return;
        }
        System.out.println("Removed: " + arr[front]);
        front = (front + 1) % capacity;
        count--;
    }

    // Melihat elemen depan
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return;
        }
        System.out.println("Front element: " + arr[front]);
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == capacity);
    }

    public int size() {
        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return;
        }
        System.out.print("Queue = ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
}

public class QueueImplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();

        Queue q = new Queue(n);
        char ch;

        do {
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. size");
            System.out.print("Your Choice? ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nilai: ");
                    q.insert(sc.nextInt());
                    break;
                case 2:
                    q.remove();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    System.out.println("Queue kosong? " + q.isEmpty());
                    break;
                case 5:
                    System.out.println("Queue penuh? " + q.isFull());
                    break;
                case 6:
                    System.out.println("Size = " + q.size());
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }

            q.display();

            System.out.print("\nDo you want to continue (Type y or n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

        sc.close();
    }
}
